package es.uniovi.dlp.ast.types.sub;

import es.uniovi.dlp.ast.types.AbstractType;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class DoubleType extends AbstractType {
    public DoubleType(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "double";
    }

    @Override
    public Type arithmetic(Type otherType) {
        if(otherType instanceof DoubleType) {
            return this;
        } else if(otherType instanceof IntType) {
            return new DoubleType(otherType.getLine(), otherType.getColumn());
        }
        return super.arithmetic(otherType);
    }

    @Override
    public Type cast(Type from) {
        if(from instanceof DoubleType)
            return from;

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
