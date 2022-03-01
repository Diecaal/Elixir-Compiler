# Laboratorio 05

## Objetivos

Usando las [Actions de Antlr](https://github.com/antlr/antlr4/blob/master/doc/actions.md), debes incluir el código necesario en tu gramática para generar el AST pertinente con las clases creadas en [el laboratorio 2](lab_02.md).

## Instrucciones

Cuando termines el laboratorio (no te olvides de ir haciendo commits), ejecuta el siguiente comando (con tu UO) y sube el Zip correspondiente al campus:

```
git archive -o ../UO121212_lab05.zip HEAD
```

### Imports

Recuerda que nuestra gramática de Antlr acaba generando las clases `es.uniovi.dlp.parser.XanaParser` y `es.uniovi.dlp.parser.XanaLexer`, entre otras cosas.
Por lo tanto, dentro de la gramática te encuentras en el paquete `es.uniovi.dlp.parser`.
Si quieres referenciar la clase `es.uniovi.dlp.ast.expressions.Expression`, por ejemplo, debes incluir su `import` correspondiente.

Estos imports se deben declarar al principio de la gramática en la sección de `@header {...}`:

```
@header {
package es.uniovi.dlp.parser;

// Aquí tus imports...
import es.uniovi.dlp.ast.expressions.Expression;
// También puedes importar un paquete entero y no preocuparte de las clases dentro de él
import es.uniovi.dlp.ast.statements.*;
}
```

### Etiquetas

Se pueden usar labels para referenciar tokens o reglas y después poder usarlas en las acciones:

```
statement returns [Statement st]
    : leftExp=expression '=' rightExp=expression { $st = new Assignment($leftExp, $rightExp); }
    ;
```

Si queremos usar un token literal, debemos usar obligatoriamente un label para referenciarlo:

```
primitiveType returns [Type t]
    : i='int' { $t = new IntType($i.getLine(), $i.getCharPositionInLine() + 1); }
```

También se pueden crear etiquetas en forma de lista usando el operador `+=` en lugar de `=` para recoger los tokens necesarios:
```
varDefinitions returns [List<VarDefinition> ast = new ArrayList<>()]
    : ids+=ID (',' ids+=ID)* '::' type {
        for(var id : $ids) {
            $ast.add(new VarDefinition(id.getLine(), id.getCharPositionInLine() + 1, id.getText(), $type.ast));
        }
    }
    ;
```

### Tokens `start` y `stop`

Dentro del contexto de una acción, tenemos las variables `start` y  `stop` que son los tokens iniciales y finales que encajan en esa regla, por si queremos usarlos en lugar de definir labels cada vez:

```
primitiveType returns [Type t]
    : 'int' { $t = new IntType($start.getLine(), $start.getCharPositionInLine() + 1); }
```

### Ejecuta los tests de continuo

Mientras estás creando las acciones, es normal equivocarse, para asegurarte que te equivocas lo menor posible, ejecuta los tests en cada cambio que hagas:

```
mvn clean antlr4:antlr4 test
```

Si te has equivocado, o te falta algo, tendrás un error de compilación o también puede ser que hayas cambiado una regla sin querer y los tests dejen de pasar.
Intenta corregirlo lo antes posible para evitar que se te acumulen los cambios.

### Abrir el _Introspector_

> Nota: La clase [`RunIntrospector`](../../src/test/java/es/uniovi/dlp/parser/RunIntrospector.java) tiene comentada unas líneas para no dar error de compilación, cuando hayas creado la acción de la regla `program` dentro de tu gramática ya podrías descomentar esta línea.

Cuando creas que tienes las acciones puestas correctamente, y los tests te siguen funcionando, lanza el _introspector_ con el siguiente comando para comprobar que el AST tiene sentido:

```
mvn clean antlr4:antlr4 test-compile exec:java -Dexec.classpathScope=test -Dexec.mainClass="es.uniovi.dlp.parser.RunIntrospector" -Dexec.args="examples/basic.xana"
```

Si te fijas en este comando ejecutamos los siguientes pasos:

1. Limpiamos la carpeta `target/` con `clean`.
2. Regeneramos el parser y el lexer a partir de la gramática con `antlr4:antlr4`.
3. Compilamos la carpeta de tests con `test-compile` (porque `compile` no compila la carpeta de test).
4. Como vamos a ejecutar una clase de la carpeta de test, tenemos que decirle cuál es el classpath que debe tener en cuenta: `-Dexec.classpathScope=test`.
5. Ejecutamos la clase `RunIntrospector` con `-Dexec.mainClass="es.uniovi.dlp.parser.RunIntrospector"`.
6. Finalmente le pasamos como argumento el fichero que queramos: `-Dexec.args="examples/basic.xana"`. Si quieres probar tus propios programas, aquí es donde puedes cambiarlo.
