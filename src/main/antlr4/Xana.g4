grammar Xana;

@header {
package es.uniovi.dlp.parser;
}

program: definitions* mainFunction EOF
       ;

definitions: functionDefinition
           | variableDefinition
           ;

mainFunction: 'def' 'main' '(' ')' 'do' functionBody 'end'
                      ;

variableDefinition: ID (',' ID)* '::' type
                  ;

functionDefinition: 'def' ID '(' functionParameters ')' '::' functionType 'do' functionBody 'end'
                  ;

functionParameters: (ID '::' type (',' ID '::' type)*)?
                  ;

functionBody: variableDefinition* statement*
            ;

statement: 'if' expression 'do' functionBody ('else' functionBody)? 'end'
         | 'while' expression 'do' functionBody 'end'
         | 'puts' expression (',' expression)*?
         | 'in' expression
         | 'return' expression
         | expression '=' expression
         | ID '(' (ID (',' ID)*)? ')' /* Function Invocation */
         ;

expression: '(' expression ')'
          | '[' expression ']'
          | expression '.' expression
          | expression 'as' primitiveType
          | '-' expression
          | '!' expression
          | expression ('*'|'/'|'%') expression
          | expression ('+'|'-') expression
          | expression ('>'|'>='|'<'|'<='|'!='|'==') expression
          | expression ('&&'|'||') expression
          | expression '=' expression
          | INT_CONSTANT
          | REAL_CONSTANT
          | CHAR_CONSTANT
          ;

functionType: primitiveType
            | 'void'
            ;

type: '[' ID '::' type ']'
    | 'defstruct' 'do' recordFields 'end'
    | primitiveType
    ;

recordFields: ID (',' ID)* '::' type
            ;

primitiveType: 'int'
             | 'double'
             | 'char'
             ;

ID: ([a-zA-Z]|'_') ([a-zA-Z]|'_'|[0-9])*
  ;

COMMENT: ('#' .*? (EOL|EOF) | '"""' .*? '"""' )+ -> skip
       ;

WS: ([\t\n\r] | ' ')+ -> skip
  ;

REAL_CONSTANT: INT_CONSTANT '.' INT_CONSTANT ([Ee] INT_CONSTANT)?
             | INT_CONSTANT* '.' INT_CONSTANT ([Ee] INT_CONSTANT)?
             | INT_CONSTANT '.' INT_CONSTANT* ([Ee] INT_CONSTANT)?
             | INT_CONSTANT [Ee] INT_CONSTANT
             ;

INT_CONSTANT: [0-9]+
            | '-' [0-9]+
            ;

CHAR_CONSTANT: '\'' .*? '\''
             | '\'\\ ' INT_CONSTANT '\''
             ;

EOL : ('\r'|'\n')+
    ;
