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
        : d=definitions* m=mainFunction { $definitions.ast.add($m.ast); } EOF { $ast = new Program(0,0,$d.ast); }
        ;

definitions returns[List<Definition> ast = new ArrayList<Definition>()]
            : variableDefinition { $ast.addAll($variableDefinition.ast); }
            | functionDefinition { $ast.addAll($functionDefinition.ast); }
            ;

mainFunction returns[FunctionDefinition ast]
             : 'def' 'main' '(' ')' 'do' variableDefinition* statement* (variableDefinition|statement)* 'end'
             ;

variableDefinition returns[List<VariableDefinition> ast = new ArrayList<>()]
                   : ids+=ID (',' ids+=ID)*? '::' type
                    { for(var variable : $ids) { $ast.add( new VariableDefinition(variable.getLine(), variable.getCharPositionInLine() + 1, $type.ast, variable.getText())); } }
                   ;

functionDefinition returns[FunctionDefinition ast]
                   : 'def' ID '(' functionParameters ')' '::' funcType=functionType 'do' funcBody=functionBody 'end'
                    { $ast = new FunctionDefinition($start.getLine(), $start.getCharPositionInLine() + 1, $funcType.ast, $ID.text, $funcBody.ast); }
                   ;

functionParameters returns[List<VariableDefinition> ast =  new ArrayList<VariableDefinition>()]
                   : (ID '::' type (',' ID '::' type)*)?
                   ;

functionBody returns[List<Statement> ast = new ArrayList<>()]
             : variableDefinition* statement*
             ;

functionInvocation returns[FunctionInvocation ast]
                   locals [List<Expression> expressions = new ArrayList<Expression>()]
                   : ID '(' ( e=expression {$expressions.add($e.ast);} (',' e2=expression {$expressions.add($e.ast);})* )? ')'
                    { $ast = new FunctionInvocation($start.getLine(), $start.getCharPositionInLine() + 1, new Variable($start.getLine(), $start.getCharPositionInLine() + 1, $ID.text), $expressions); }
                   ;

statement returns [Statement ast]
         : 'if' expression 'do' conditionalBody ('else' conditionalBody)? 'end'
         | 'while' expression 'do' conditionalBody 'end'
         | 'puts' expression (',' expression)*?
         | 'in' expression (',' expression)*?
         | 'return' expression
         | <asocc=right> left=expression '=' right=expression
          { $ast = new Assignment($start.getLine(), $start.getCharPositionInLine() + 1, $left.ast, $right.ast); }
         | functionInvocation
         ;

conditionalBody returns[List<Statement> ast = new ArrayList<Statement>()]
                : statement*
                ;

expression returns[Expression ast]
           : '(' expression ')'
            { $ast = $expression.ast; }
           | arr=expression '[' index=expression ']'
            { $ast = new ArrayAccess($start.getLine(), $start.getCharPositionInLine() + 1, $arr.ast, $index.ast); }
           | struct=expression '.' field=ID
            { $ast = new StructAccess($start.getLine(), $start.getCharPositionInLine() + 1, $struct.ast, $field.getText()); }
           | expression 'as' toCast=primitiveType
            { $ast = new Cast($start.getLine(), $start.getCharPositionInLine() + 1, $toCast.ast, $expression.ast); }
           | '-' expression
            { $ast = new UnaryMinus($start.getLine(), $start.getCharPositionInLine() + 1, $expression.ast); }
           | '!' expression
            { $ast = new UnaryNegative($start.getLine(), $start.getCharPositionInLine() + 1, $expression.ast); }
           | left=expression op=('*'|'/'|'%') right=expression
            { $ast = new Arithmetic($start.getLine(), $start.getCharPositionInLine() + 1, $left.ast, $op.getText(), $right.ast); }
           | left=expression op=('+'|'-') right=expression
            { $ast = new Arithmetic($start.getLine(), $start.getCharPositionInLine() + 1, $left.ast, $op.getText(), $right.ast); }
           | left=expression op=('>'|'>='|'<'|'<='|'!='|'==') right=expression
            { $ast = new Relational($start.getLine(), $start.getCharPositionInLine() + 1, $left.ast, $op.getText(), $right.ast); }
           | left=expression op=('&&'|'||') right=expression
            { $ast = new Logical($start.getLine(), $start.getCharPositionInLine() + 1, $left.ast, $op.getText(), $right.ast); }
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

functionType returns[Type ast]
             : primitiveType
              { $ast = $primitiveType.ast; }
             | 'void'
              { $ast = new VoidType($start.getLine(), $start.getCharPositionInLine() + 1); }
             ;

type returns[Type ast]
     : '[' i=INT_CONSTANT '::' t=type ']'
      { $ast = new ArrayType($start.getLine(), $start.getCharPositionInLine() + 1, $t.ast, LexerHelper.lexemeToInt($i.text)); }
     | 'defstruct' 'do' recordType 'end'
      { $ast = ($recordType.ast == null) ? new StructType($start.getLine(), $start.getCharPositionInLine() + 1, new ArrayList<RecordType>())
                                         : new StructType($start.getLine(), $start.getCharPositionInLine() + 1, $recordType.ast); }
     | primitiveType
      { $ast = $primitiveType.ast; }
     ;

recordType returns[List<RecordType> ast = new ArrayList<>()]
           : (ids+=ID (',' ids+=ID)* '::' type)*?
            { for(var id : $ids) { $ast.add(new RecordType(id.getLine(), id.getCharPositionInLine() + 1, $type.ast, id.getText())); } }
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
