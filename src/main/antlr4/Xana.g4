grammar Xana;


@header {
package es.uniovi.dlp.parser;
}

program: INT_CONSTANT
       ;

INT_CONSTANT: [0-9]+
            ;
