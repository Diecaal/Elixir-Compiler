grammar Xana;

@header {
    package es.uniovi.dlp.parser;

    import es.uniovi.dlp.ast.statements.sub.*;
    import es.uniovi.dlp.ast.statements.*;
    import es.uniovi.dlp.ast.definitions.sub.*;
    import es.uniovi.dlp.ast.definitions.*;
    import es.uniovi.dlp.ast.expressions.sub.*;
    import es.uniovi.dlp.ast.expressions.*;
    import es.uniovi.dlp.ast.types.sub.*;
    import es.uniovi.dlp.ast.types.*;
    import es.uniovi.dlp.ast.Program;
    import es.uniovi.dlp.parser.LexerHelper;
}

program returns[Program ast]
        : d=definitions m=mainFunction { $definitions.ast.add($m.ast); } EOF { $ast = new Program(0,0,$d.ast); }
        ;

// DEFINITIONS
definitions returns[List<Definition> ast = new ArrayList<Definition>()]:
            ( variableDefinition { $ast.addAll($variableDefinition.ast); }
            | functionDefinition { $ast.add($functionDefinition.ast); } )*
            ;

variableDefinition returns[List<VariableDefinition> ast = new ArrayList<>()]
                   : ids+=ID (',' ids+=ID)*? '::' type
                    { for(var variable : $ids) { $ast.add( new VariableDefinition(variable.getLine(), variable.getCharPositionInLine() + 1, $type.ast, variable.getText())); } }
                   ;

// DEFINITIONS - Function
functionDefinition returns[FunctionDefinition ast]
                   : 'def' ID '(' params=functionParameters ')' '::' returnType=functionType 'do' block=functionBlock 'end'
                    { $ast = new FunctionDefinition($start.getLine(), $start.getCharPositionInLine() + 1,
                                                                  new FunctionType($start.getLine(), $start.getCharPositionInLine(), $params.ast, $returnType.ast),
                                                    $ID.text, $block.varDefs, $block.statements );
                                  }
                   ;

functionBlock returns[List<VariableDefinition> varDefs =  new ArrayList<VariableDefinition>(),
                      List<Statement> statements =  new ArrayList<Statement>()]:
                (var=variableDefinition { $varDefs.addAll( $var.ast ); })* (s=statement { $statements.addAll( $s.ast); })*
              ;

functionType returns[Type ast]
             : t=primitiveType
              { $ast = $t.ast; }
             | 'void'
              { $ast = new VoidType($start.getLine(), $start.getCharPositionInLine() + 1); }
             ;

functionParameters returns[List<VariableDefinition> ast =  new ArrayList<VariableDefinition>()]
                   : { $ast = new ArrayList<VariableDefinition>(); } // No parameters passed to function
                   | ID '::' t=type { $ast.add( new VariableDefinition($ID.getLine(), $ID.getCharPositionInLine()+1, $t.ast, $ID.text) ); }
                     (',' ID '::' t2=type { $ast.add( new VariableDefinition($ID.getLine(), $ID.getCharPositionInLine()+1, $t2.ast, $ID.text) ); })*
                   ;

// DEFINITIONS - Function - Main
mainFunction returns[FunctionDefinition ast]
             locals[List<VariableDefinition> varDefs =  new ArrayList<VariableDefinition>(),
                    List<Statement> statements =  new ArrayList<Statement>()]
             : 'def' 'main' '(' ')' 'do' (var=variableDefinition { $varDefs.addAll( $var.ast ); } | s=statement { $statements.addAll( $s.ast); })* 'end'
              { $ast = new FunctionDefinition($start.getLine(), $start.getCharPositionInLine() + 1,
                                              new FunctionType($start.getLine(), $start.getCharPositionInLine(), new ArrayList<VariableDefinition>(),
                                                                new VoidType($start.getLine(), $start.getCharPositionInLine())
                                              ), "main", $varDefs, $statements );
              }
             ;

functionInvocation returns[FunctionInvocation ast]
                   locals [List<Expression> expressions = new ArrayList<Expression>()]
                   : ID '(' ( e=expression {$expressions.add($e.ast);} (',' e2=expression {$expressions.add($e2.ast);})* )? ')'
                    { $ast = new FunctionInvocation($start.getLine(), $start.getCharPositionInLine() + 1, new Variable($start.getLine(), $start.getCharPositionInLine() + 1, $ID.text), $expressions); }
                   ;

// STATEMENTS
statement returns [List<Statement> ast = new ArrayList<Statement>()]
          locals[List<Statement> elseBody = new ArrayList<Statement>()]:
           'if' condition=expression 'do' ifStm=conditionalBody ('else' elseStm=conditionalBody { $elseBody = $elseStm.ast; })? 'end'
          { $ast.add(new If($start.getLine(), $start.getCharPositionInLine() + 1, $condition.ast, $ifStm.ast, $elseBody)); }
         | 'while' condition=expression 'do' whileStm=conditionalBody 'end'
          { $ast.add(new While($start.getLine(), $start.getCharPositionInLine() + 1, $condition.ast, $whileStm.ast)); }
         | 'puts' e+=expression (',' e+=expression)*?
          { for(var exp : $e) { $ast.add(new Write($start.getLine(), $start.getCharPositionInLine() + 1, exp.ast)); } }
         | 'in' e+=expression (',' e+=expression)*?
          { for(var exp : $e) { $ast.add(new Read($start.getLine(), $start.getCharPositionInLine() + 1, exp.ast)); } }
         | 'return' expression
          { $ast.add(new Return($start.getLine(), $start.getCharPositionInLine() + 1, $expression.ast)); }
         | <asocc=right> left=expression '=' right=expression
          { $ast.add(new Assignment($start.getLine(), $start.getCharPositionInLine() + 1, $left.ast, $right.ast)); }
         | functionInvocation
          { $ast.add($functionInvocation.ast); }
         ;

conditionalBody returns[List<Statement> ast = new ArrayList<Statement>()]
                : statement { $ast.addAll( $statement.ast ); } (statement { $ast.addAll( $statement.ast ); })*
                | { $ast = new ArrayList<Statement>(); }
                ;

// EXPRESSIONS
expression returns[Expression ast]
           : '(' expression ')'
            { $ast = $expression.ast; }
           | arr=expression '[' index=expression ']'
            { $ast = new ArrayAccess($start.getLine(), $start.getCharPositionInLine() + 1, $arr.ast, $index.ast); }
           | struct=expression '.' field=ID
            { $ast = new StructAccess($start.getLine(), $start.getCharPositionInLine() + 1, $struct.ast, $field.getText()); }
           | casted=expression  'as' toCast=primitiveType
            { $ast = new Cast($start.getLine(), $start.getCharPositionInLine() + 1, $toCast.ast, $casted.ast); }
           | '-' expression
            { $ast = new UnaryMinus($start.getLine(), $start.getCharPositionInLine() + 1, $expression.ast); }
           | '!' expression
            { $ast = new UnaryNegative($start.getLine(), $start.getCharPositionInLine() + 1, $expression.ast); }
           | left=expression op=('*'|'/'|'%') right=expression
            { $ast = new Arithmetic($start.getLine(), $start.getCharPositionInLine() + 1, $left.ast, $op.getText(), $op.getLine(), $op.getCharPositionInLine() + 1, $right.ast); }
           | left=expression op=('+'|'-') right=expression
            { $ast = new Arithmetic($start.getLine(), $start.getCharPositionInLine() + 1, $left.ast, $op.getText(), $op.getLine(), $op.getCharPositionInLine() + 1, $right.ast); }
           | left=expression op=('>'|'>='|'<'|'<='|'!='|'==') right=expression
            { $ast = new Relational($start.getLine(), $start.getCharPositionInLine() + 1, $left.ast, $op.getText(), $op.getLine(), $op.getCharPositionInLine() + 1, $right.ast); }
           | left=expression op=('&&'|'||') right=expression
            { $ast = new Logical($start.getLine(), $start.getCharPositionInLine() + 1, $left.ast, $op.getText(), $op.getLine(), $op.getCharPositionInLine() + 1, $right.ast); }
           | functionInvocation
            { $ast = $functionInvocation.ast; }
           | INT_CONSTANT
            { $ast = new IntLiteral($start.getLine(), $start.getCharPositionInLine() + 1, LexerHelper.lexemeToInt($INT_CONSTANT.text)); }
           | REAL_CONSTANT
            { $ast = new DoubleLiteral($start.getLine(), $start.getCharPositionInLine() + 1, LexerHelper.lexemeToReal($REAL_CONSTANT.text)); }
           | CHAR_CONSTANT
            { $ast = new CharLiteral($start.getLine(), $start.getCharPositionInLine() + 1, LexerHelper.lexemeToChar($CHAR_CONSTANT.text)); }
           | ID
            { $ast = new Variable($start.getLine(), $start.getCharPositionInLine() + 1, $ID.text); }
           ;

//TYPES
type returns[Type ast]
     : '[' i=INT_CONSTANT '::' t=type ']'
      { $ast = new ArrayType($start.getLine(), $start.getCharPositionInLine() + 1, $t.ast, LexerHelper.lexemeToInt($i.text)); }
     | 'defstruct' 'do' recordType 'end'
      { $ast = new StructType($start.getLine(), $start.getCharPositionInLine() + 1, $recordType.ast); }
     | primitiveType
      { $ast = $primitiveType.ast; }
     ;

recordType returns[List<RecordType> ast = new ArrayList<>()]
           : (ids+=ID (',' ids+=ID)* '::' type
           { for(var id : $ids) { $ast.add(new RecordType(id.getLine(), id.getCharPositionInLine() + 1, $type.ast, id.getText())); }
             $ids.clear(); })*? // if list is no cleared, extra records will be created with new succesive types
           ;

primitiveType returns[Type ast]
              : 'int' { $ast = new IntType($start.getLine(), $start.getCharPositionInLine() + 1); }
              | 'double' { $ast = new DoubleType($start.getLine(), $start.getCharPositionInLine() + 1); }
              | 'char' { $ast = new CharType($start.getLine(), $start.getCharPositionInLine() + 1); }
              ;

ID: ([a-zA-Z]|'_') ([a-zA-Z]|'_'|[0-9])*
  ;

COMMENT: ('#' .*? (EOL|EOF) | '"""' .*? '"""' )+ -> skip
       ;

WS: ([\t\n\r] | ' ')+ -> skip
  ;

REAL_CONSTANT: ('-')? INT_CONSTANT '.' ('-')? INT_CONSTANT ([Ee] ('-')? INT_CONSTANT)?
             | ('-')? INT_CONSTANT* '.' ('-')? INT_CONSTANT ([Ee] ('-')? INT_CONSTANT)?
             | ('-')? INT_CONSTANT '.' ('-')? INT_CONSTANT* ([Ee] ('-')? INT_CONSTANT)?
             | ('-')? INT_CONSTANT [Ee] ('-')? INT_CONSTANT
             ;

INT_CONSTANT: [0-9]+
            ;


CHAR_CONSTANT: '\'' .*? '\''
             | '\'\\ ' INT_CONSTANT '\''
             ;

EOL : ('\r'|'\n')+
    ;
