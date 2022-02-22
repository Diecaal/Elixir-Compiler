# Laboratorio 04

## Objetivos

Teniendo en cuenta la especificación del lenguaje descrita en el fichero [`docs/specification.md`](../specification.md), implementar un analizador sintáctico de dicho lenguaje.

El fichero de ejemplo [`examples/basic.xana`](../../examples/basic.xana), se debe deberá poder analizar sin problemas.

También contamos con una batería de tests para el Parser que deberán pasarse ejecutando:
```
mvn clean antlr4:antlr4 test
```

## Herramientas

Además del plugin de IntelliJ nos podremos ayudar de las siguientes instrucciones:

### Abrir la interfaz del inspector

```
mvn clean antlr4:antlr4 compile exec:java -Dexec.mainClass="org.antlr.v4.gui.TestRig" -Dexec.args="es.uniovi.dlp.parser.Xana program -gui examples/basic.xana"
```

### Ver la traza del analizador

```
mvn clean antlr4:antlr4 compile exec:java -Dexec.mainClass="org.antlr.v4.gui.TestRig" -Dexec.args="es.uniovi.dlp.parser.Xana program -trace examples/basic.xana"
```

### Ver los tokens analizados

```
mvn clean antlr4:antlr4 compile exec:java -Dexec.mainClass="org.antlr.v4.gui.TestRig" -Dexec.args="es.uniovi.dlp.parser.Xana program -tokens examples/basic.xana"
```
