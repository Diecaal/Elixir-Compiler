# Laboratorio 10

## Objetivos

En este laboratorio debemos anotar el AST con los _offsets_ correspondientes para cada variable global, cada variable local y para los parámetros de una función.

## Instrucciones

Para ello los pasos a seguir son:

1. Crear un nuevo visitor llamado `OffsetVisitor` dentro de un nuevo paquete `es.uniovi.dlp.visitor.codegeneration` y añadirlo a nuestra clase `Compiler` para que se ejecute después de la comprobación de tipos.
2. A cada tipo de nuestro AST, crear una función `getNumberOfBytes(): int` que nos devuelva cuánto _ocupa_ dicho tipo.
3. Crear una propiedad `offset` en `RecordField` y `VarDefinition`, y anotarla con el valor adecuado.

Comprobar el AST con el programa de ejemplo:

```
bin\xana.bat examples/codegeneration/offsets/simple.xana --introspector
```

## Ejemplo

Para tener como referencia de cómo deben ser los offsets, el [siguiente programa](../../examples/codegeneration/offsets/simple.xana):

```
i :: char
j :: int

def suma(a :: int, b :: double) :: double do
  real :: double
  letra :: char
  return a + b
end


def main() do
    suma(1, 2.0)
end
```

Debe tener una representación _similar_ (no entraremos todavía en detalles) en memoria cuando `suma` es invocada:

```
------+----------------------+ <-- Inicio de memoria (variables globales)
 0000 |          i           |
------+----------------------+
 0001 |          j           |
 0002 |                      |
------+----------------------+
      |         ...          |
------+----------------------+ <-- SP: Límite superior de la pila
 1005 |        letra         |
------+----------------------+
 1006 |         real         |
 1007 |                      |
 1008 |                      |
 1009 |                      |
------+----------------------+ <-- BP
 1010 |     Previous BP      |
 1011 |        (1020)        |
------+----------------------+
 1012 |    Return address    |
 1013 |       to main        |
------+----------------------+
 1014 |                      |
 1015 |         2.0          |
 1016 |         (b)          |
 1017 |                      |
------+----------------------+
 1018 |          1           |
 1019 |         (a)          |
------+----------------------+
 1020 |     Previous BP      |
 1021 |        (1024)        |
------+----------------------+
 1022 |    Return address    |
 1023 |                      |
------+----------------------+ <-- Límite inferior de la pila
```
