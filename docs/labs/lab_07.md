# Laboratorio 07

## Objetivos

En este laboratorio, debes recorrer el AST y anotar en todas las expresiones la propiedad _LValue_.
También debes identificar y añadir los errores correspondientes cuando una expresión deba ser un _LValue_ y esta no lo sea.

Como ejemplo, los programas [`examples/errors/lvalue/read.xana`](../../examples/errors/lvalue/read.xana) y [`examples/errors/lvalue/arithmetic.xana`](../../examples/errors/lvalue/arithmetic.xana) deben mostrar errores,
mientras que [`examples/errors/valid_examples/lvalue.xana`](../../examples/errors/valid_examples/lvalue.xana) no.

## Instrucciones

Para ejecutar un programa en específico, puedes ejecutar el siguiente comando, con el nombre del programa:

```
bin\xana.bat examples/errors/lvalue/read.xana
```

Si quieres ver el resultado del introspector en un programa **válido**:

```
bin\xana.bat examples/errors/valid_examples/lvalue.xana --introspector
```

También se ha añadido el test [`LvalueTest`](../../src/test/java/es/uniovi/dlp/visitor/semantic/LvalueTest.java) que debería funcionar correctamente:

```
mvn clean test
```
