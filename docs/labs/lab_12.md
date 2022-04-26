# Laboratorio 12

## Objetivos

Implementar la generación de código MAPL para los siguientes nodos:

- If
- While
- Indexing
- FieldAccess

## Instrucciones

Existen cuatro programas de prueba:

- [`codegeneration/if.xana`](../../examples/codegeneration/if.xana)
- [`codegeneration/while.xana`](../../examples/codegeneration/while.xana)
- [`codegeneration/indexing.xana`](../../examples/codegeneration/indexing.xana)
- [`codegeneration/field_access.xana`](../../examples/codegeneration/field_access.xana)

Prueba que el código se genera correctamente ejecutando:

```
bin\xana.bat examples/codegeneration/if.xana -a
```

Recuerda que puedes probar el programa usando:

```
.\mapl\TextVM.exe examples/codegeneration/if.xana.mp
```
