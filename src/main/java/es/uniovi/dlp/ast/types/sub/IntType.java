package es.uniovi.dlp.ast.types.sub;

import es.uniovi.dlp.ast.types.AbstractType;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class IntType extends AbstractType {
    public IntType(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "int";
    }

    @Override
    public Type arithmetic(Type otherType) {
        if(otherType instanceof CharType || otherType instanceof IntType) {
            return this;
        } else if(otherType instanceof DoubleType) {
            return otherType;
        }
        return super.arithmetic(otherType);
    }

    @Override
    public Type cast(Type from) {
        if(from instanceof IntType || from instanceof CharType)
            return from;
        else if(from instanceof DoubleType)
            return new IntType(from.getLine(), from.getColumn());
        return super.cast(from);
    }

    @Override
    public boolean isArithmetic() {
        return true;
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }
}
