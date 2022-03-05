package es.uniovi.dlp.ast.types.sub;

import es.uniovi.dlp.ast.types.AbstractType;
import es.uniovi.dlp.ast.types.Type;

public class ArrayType extends AbstractType {
    private Type arrayType;
    private int length;

    public ArrayType(int line, int column, Type type, int length) {
        super(line, column);
        this.arrayType = type;
        this.length = length;
    }

    @Override
    public String toString() {
        return String.format("[%s :: %s]", String.valueOf(length), arrayType.toString());
    }
}
