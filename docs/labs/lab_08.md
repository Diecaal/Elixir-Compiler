# Laboratorio 08

## Objetivos

En este laboratorio, debes crear el pase de identificación correspondiente a la fase de análisis semántico de nuestro compilador.

Primero completa la implementación de la clase [`SymbolTable`](../../src/main/java/es/uniovi/dlp/visitor/semantic/SymbolTable.java) para que pase los tests definidos en[`SymbolTableTest`](../../src/test/java/es/uniovi/dlp/visitor/semantic/SymbolTableTest.java).

Finalmente, implementa un nuevo `IdentificationVisitor` que detecte los errores definidos en [`IdentificationTest`](../../src/test/java/es/uniovi/dlp/visitor/semantic/IdentificationTest.java).

## Instrucciones

Comprueba que todos los tests te funcionan correctamente:

```
mvn clean antlr4:antlr4 test
```

Comprueba con el introspector que las definiciones tienen el ámbito correcto:

```
bin\xana.bat examples/basic.xana --introspector
```
