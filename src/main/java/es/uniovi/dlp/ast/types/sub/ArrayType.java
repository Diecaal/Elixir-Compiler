package es.uniovi.dlp.ast.types.sub;

import es.uniovi.dlp.ast.types.AbstractType;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class ArrayType extends AbstractType {
    private Type arrayType;
    private int length;

    public ArrayType(int line, int column, Type type, int length) {
        super(line, column);
        this.arrayType = type;
        this.length = length;
    }

    public Type getArrayType() {
        return arrayType;
    }

    public int getLength() {
        return length;
    }

    @Override
    public Type indexing(Type indexType) {
        return arrayType;
    }

    @Override
    public String toString() {
        return String.format("[%s :: %s]", String.valueOf(length), arrayType.toString());
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }
}
