grammar Xana;

@header {
package es.uniovi.dlp.parser;
}

program: definitions* mainFunction EOF
       ;

definitions: functionDefinition
           | variableDefinition
           ;

mainFunction: 'def' 'main' '(' ')' 'do' variableDefinition* statement* (variableDefinition|statement)* 'end'
            ;

variableDefinition: ID (',' ID)*? '::' type
                  ;

functionDefinition: 'def' ID '(' functionParameters ')' '::' functionType 'do' functionBody 'end'
                  ;

functionParameters: (ID '::' type (',' ID '::' type)*)?
                  ;

functionBody: variableDefinition* statement*
            ;

functionInvocation: ID '(' ( expression (',' expression)* )? ')'
                  ;

statement: 'if' expression 'do' conditionalBody ('else' conditionalBody)? 'end'
         | 'while' expression 'do' conditionalBody 'end'
         | 'puts' expression (',' expression)*?
         | 'in' expression (',' expression)*?
         | 'return' expression
         | <asocc=right> expression '=' expression
         | functionInvocation
         ;

conditionalBody: statement*
               ;

expression: '(' expression ')'
          | expression '[' expression ']'
          | expression '.' expression
          | expression 'as' primitiveType
          | '-' expression
          | '!' expression
          | expression ('*'|'/'|'%') expression
          | expression ('+'|'-') expression
          | expression ('>'|'>='|'<'|'<='|'!='|'==') expression
          | expression ('&&'|'||') expression
          | expression '=' expression
          | functionInvocation
          | INT_CONSTANT
          | REAL_CONSTANT
          | CHAR_CONSTANT
          | ID
          ;

functionType: primitiveType
            | 'void'
            ;

type: '[' INT_CONSTANT '::' type ']'
    | 'defstruct' 'do' recordFields*? 'end'
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
