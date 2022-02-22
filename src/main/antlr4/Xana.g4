grammar Xana;

@header {
package es.uniovi.dlp.parser;
}

program: ID
       | expression
       ;

ID: ([a-zA-Z]|'_') ([a-zA-Z]|'_'|[0-9])*
  ;

expression: INT_CONSTANT
          | REAL_CONSTANT
          | CHAR_CONSTANT
          ;

COMMENT: ('#' .*? (EOL|EOF) | '"""' .*? '"""' )+ -> skip
       ;

WS: ([\t\n\r] | ' ')+ -> skip
  ;

BASIC_TYPE: 'int'
          | 'double'
          | 'char'
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
