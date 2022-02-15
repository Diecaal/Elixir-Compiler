grammar Xana;

@header {
package es.uniovi.dlp.parser;
}

program: ID
       | expression
       ;

ID: CHAR_CONSTANT (',' CHAR_CONSTANT)* '::' BASIC_TYPE
          ;

expression: INT_CONSTANT
          | DOUBLE_CONSTANT
          | CHAR_CONSTANT
          ;

COMMENT: ('#' .*? (EOL|EOF) | '"""' .*? '"""')+ -> skip
       ;

WS: ([\t\n\r] | ' ')+ -> skip
  ;

BASIC_TYPE: 'int'
          | 'double'
          | 'char'
          ;

INT_CONSTANT: [0-9]+
            ;

REAL_CONSTANT: INT_CONSTANT '.' INT_CONSTANT ([eE] INT_CONSTANT)?
             | INT_CONSTANT* '.' INT_CONSTANT ([eE] INT_CONSTANT)?
             | INT_CONSTANT '.' INT_CONSTANT* ([eE] INT_CONSTANT)?
             | INT_CONSTANT [eE] INT_CONSTANT
             ;

CHAR_CONSTANT: [a-zA-Z]
             ;

EOL : ('\r'|'\n')+
    ;
