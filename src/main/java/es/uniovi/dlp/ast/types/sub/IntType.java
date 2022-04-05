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
            return new DoubleType(getLine(), getColumn());
        }
        return super.arithmetic(otherType);
    }

    @Override
    public Type logical(Type otherType) {
        if(otherType.isLogical())
            return this;
        return super.logical(otherType);
    }

    @Override
    public boolean isArithmetic() {
        return true;
    }

    @Override
    public boolean isLogical() {
        return true;
    }

    @Override
    public boolean isIndexable() {
        return true;
    }

    @Override
    public boolean promotableTo(Type to) {
        if(to instanceof DoubleType || to instanceof CharType || to instanceof IntType)
            return true;

        return super.promotableTo(to);
    }

    @Override
    public Type cast(Type toCast) {
        if(toCast instanceof IntType || toCast instanceof CharType)
            return this;
        else if(toCast instanceof DoubleType)
            return new DoubleType(toCast.getLine(), toCast.getColumn());
        return super.cast(toCast);
    }

    @Override
    public int getNumberBytes() {
        return 2;
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }
}
