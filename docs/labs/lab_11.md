# Laboratorio 11

## Objetivos

El principal objetivo de este laboratorio es generar código que pueda ejecutar la máquina virtual MAPL.

En esta práctica, generaremos código MAPL para los siguientes nodos:

- Programas
- Definiciones de funciones
- Definiciones de variables globales y locales
- Write
- Read
- Asignaciones
- Operaciones Aritméticas, de comparación y lógicas
- Cast
- Variables
- Valores literales

## Instrucciones

> En teoría se ha visto que existen tres tipos de funciones principales dentro de las plantillas de código: `execute`, `value` y `address`.

Para llevar a cabo este laboratorio es necesario:

1. Crear una clase `CodeGenerator` que se encargue de concatenar todas las instrucciones de nuestro programa y escribirlas a un `OutputStreamWriter` determinado.
2. Crear un nuevo `ExecuteCGVisitor` que genere código para la ejecución de todas las sentencias del programa.
3. Este visitor, estará compuesto por otros dos nuevos visitors, que se necesitarán entre ellos: `AddressCGVisitor`, `ValueCGVisitor`;
   los cuales se encargarán de calcular la posición en memoria de una variable, array o struct, y de añadir el valor de una expresión a la pila, respectivamente.

Puedes ir probando que el código se genera correctamente ejecutando:

```
bin\xana.bat examples/codegeneration/simple.xana -a
```

Para el fichero [`codegeneration/simple.xana`](../../examples/codegeneration/simple.xana) el resultado debería ser el contenido del fichero [`codegeneration/simple.xana.mp`](../../examples/codegeneration/simple.xana.mp).

> **Nota:** Ten cuidado, porque si no te fijas bien, puedes sobreescribir el fichero `codegeneration/simple.xana.mp`.
> Antes de hacer commit, revisa bien que no haces cambios en ese fichero.

### Compilar y ejecutar un programa

Para generar un fichero para MAPL ejecuta:

```
bin\xana.bat examples/codegeneration/simple.xana
```

Esto te debería generar un archivo de MAPL llamado `examples/codegeneration/simple.xana.mp`.

Una vez que tengas el fichero intermedio generado, puedes ejecutar el siguiente comando para abrir la interfaz interactiva de MAPL:

```
.\mapl\GVM.exe examples/codegeneration/simple.xana.mp
```

O ejecutar el siguiente comando para interpretar directamente el fichero usando `TextVM.exe`:

```
.\mapl\TextVM.exe examples/codegeneration/simple.xana.mp
```

#### Linux y macOS

Para ejecutar MAPL en linux o macOS debes tener instalado [mono](https://www.mono-project.com/).

> **Nota:** Para macOS a partir de Catalina, no hay soporte para Windows Forms,
> por lo que la interfaz gráfica de MAPL no va a funcionar.

Los comandos en este caso deberían ser:

```
mono mapl/GVM.exe examples/codegeneration/simple.xana.mp
```

y


```
mono mapl/TextVM.exe examples/codegeneration/simple.xana.mp
```

## Instrucciones de MAPL

> Las instrucciones están delimitadas por saltos de línea.

> El caracter `'` se usa para empezar comentarios de una línea.

### Información de debug

```
#source <string_constant>  Permite a MAPL associar código de ensamblador
                           con el programa de alto nivel correspondiente

#line <int_constant>       Permite a MAPL IDE associar el código de ensamblador
                           con la línea correspondiente de código de alto nivel.
```

### Instrucciones Push

```
pushb <ASCII_code>      Apila el caracter (1 byte)
push[i] <int_constant>  Apila el entero (2 bytes)
pushf <real_constant>   Apila el decimal (4 bytes)
pusha <int_constant>    Apila la dirección (2 bytes)
push[a] bp              Apila el valor del registro BP (2 bytes)
```

### Load y store

```
loadb, load[i], loadf       Saca una dirección de memoria de la pila (2 bytes).
                            Luego, apila el contenido en la pila (1, 2 o 4 bytes) que
                            existía en la dirección de memoria anterior.

storeb, store[i], storef    Saca de la pila un valor (1, 2 o 4 bytes).
                            Luego, saca de la pila una dirección de memoria (2 bytes).
                            Finalmente, inserta el primer valor en la dirección de memoria indicada.
```

### Pop y duplicación de valores

```
popb, pop[i], popf  Saca de la pila 1, 2 o 4 bytes, respectivamente.
dupb, dup[i], dupf  Duplica encima de la pila 1, 2 o 4 bytes, respectivamente.
```


### Operaciones aritméticas

> Sacan dos operandos de la pila y apilan el resultado.

```
add[i], addf  Suma
sub[i], subf  Resta
mul[i], mulf  Multiplicación
div[i], divf  División
mod[i], modf  Resto (modulus)
```

### Operaciones de comparación

> Sacan dos operandos de la pila y apilan el resultado.

```
gt[i], gtf  Mayor (>)
lt[i], ltf  Menor (<)
ge[i], gef  Mayor o igual (>=)
le[i], lef  Menor o igual (<=)
eq[i], eqf  Igual (==)
ne[i], nef  Diferente (!=)
```

### Operaciones lógicas

> Sacan uno o dos operandos de la pila y apilan el resultado.

```
and     Operación and (&&)
or      Operación or (||)
not     Negación (!)
```

### Input / Output

```
outb, out[i], outf  Saca un valor (1, 2 o 4 bytes) de la pila y lo muestra por consola
inb, in[i], inf     Lee un valor del teclado (1, 2 o 4 bytes) y lo apila.
```

### Conversiones

```
b2i  Saca un caracter y apila un entero
i2f  Saca un entero y apila un decimal
f2i  Saca un decimal y apila un entero
i2b  Saca un entero y apila un caracter
```

### Saltos y etiquetas (Jumps)

```
<id>:        Define una etiqueta para saltos e invocaciones (funciones)
jmp <label>  Salta, sin condiciones, a la etiqueta especificada como parámetro.
jz  <label>  Saca un entero de la pila y salta a la etiqueta si el valor del entero es cero.
jnz <label>  Saca un entero de la pila y salta a la etiqueta si el valor del entero no es cero.
```


### Funciones

```
call <id>                                           Invoca la función con la etiqueta <id>
enter <int_constant>                                Reserva los bytes indicados en la parte superior de la pila.

ret <int_constant>, <int_constant>, <int_constant>  Retorna de la invocación de una función.
                                                    La primera constante indica los bytes a devolver,
                                                    la segunda, los bytes que ocupan todas las variables locales,
                                                    la última, los bytes que ocupan todos los argumentos.

halt                                                Termina la ejecución de un programa
```
