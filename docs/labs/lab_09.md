# Laboratorio 09

## Objetivos

El principal objetivo de este laboratorio es finalizar el pase de comprobación de tipos, de tal manera que se detecten todos los errores recogidos en el test [`TypeCheckingTest`](../../src/test/java/es/uniovi/dlp/visitor/semantic/TypeCheckingTest.java).

Una vez finalizado el pase de comprobación de tipos, el AST debe estar anotado con los tipos adecuados en cada expresión.

Completa los diagramas UML con un nuevo tipo `ErrorType` y los nuevos métodos que tendrán los tipos del AST. 

## Instrucciones

Comprueba que todos los tests funcionan correctamente:

```
mvn clean antlr4:antlr4 test
```

Comprueba con el introspector que las expresiones tienen el tipo correspondiente:

```
bin\xana.bat examples/basic.xana --introspector
```
