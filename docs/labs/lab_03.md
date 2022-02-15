# Laboratorio 03

## Objetivos

Usando [ANTLR](https://www.antlr.org/), se implementará un analizador léxico (lexer) dentro del fichero [`Xana.g4`](../../src/main/antlr4/Xana.g4), para los elementos del lenguaje indicados más abajo.

Al final de la clase, el test [`LexerTest.java`](../../src/test/java/es/uniovi/dlp/parser/LexerTest.java) debe pasar correctamente.

Para ello será necesario:

1. Implementar los elementos correspondientes en el analizador léxico
2. Generar los nuevos ficheros de ANTLR, como se menciona en la sección de herramientas.
3. Descomentar el contenido de `testSimpleLexer` dentro de `LexerTest.java`.
4. Implementar, dentro de [`LexerHelper`](../../src/main/java/es/uniovi/dlp/parser/LexerHelper.java), las funciones `lexemeToReal` y `lexemeToChar`.
5. Implementar, dentro de [`LexerInfo`](../../src/test/java/es/uniovi/dlp/parser/LexerInfo.java), los tipos restantes dentro del método `getSemanticValue`.
6. Ejecutar `mvn clean test` y comprobar que todo funciona correctamente.

> **Super Pro tip:** Si quieres inspirarte por Lexers y Parsers de lenguajes reales (como JavaScript, Java, C++, etc), échale un ojo al repositorio [antlr/grammars-v4](https://github.com/antlr/grammars-v4).

## Herramientas

Se puede usar el plugin de [ANTLR para IntelliJ](https://plugins.jetbrains.com/plugin/7358-antlr-v4).

También podemos ejecutar el siguiente comando:

```
mvn antlr4:antlr4
```

Esto deberá generar las clases de Java y los ficheros de tokens dentro del paquete `es.uniovi.dlp.parser`. 

Alternativamente, también se podrá generar los ficheros y ejecutar los tests en una línea:

```
mvn clean antlr4:antlr4 test
```

## Elementos del lenguaje

Se deben considerar los siguientes elementos dentro del analizador léxico:

- Comentarios de una línea comenzando con `#`.
- Comentarios con varias líneas delimitados con `"""`.
- Identificadores, pueden estar formados por letras, dígitos y `_`, pero no pueden comenzar por dígitos.
- Constantes enteras sin signo.
- Constantes reales.
    - Con punto decimal: `43.3`, `2.`, `.15`.
    - Con exponente: `52.45E-4`, `3e2`.
- Constantes de caracteres entre `''`:
    - Letras: `'a'`. 
    - ASCII: `'\126'`.
    - Y los caracteres especiales `'\n'` y `'\t'`.
