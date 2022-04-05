package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.types.sub.ErrorType;

public abstract class AbstractType extends AbstractASTNode implements Type {

    public AbstractType(int line, int column) {
        super(line, column);
    }

    @Override
    public Type arithmetic(Type otherType) {
        return new ErrorType(otherType.getLine(), otherType.getColumn());
    }

    @Override
    public Type logical(Type otherType) {
        return new ErrorType(otherType.getLine(), otherType.getColumn());
    }

    @Override
    public Type indexing(Type indexType) {
        return new ErrorType(indexType.getLine(), indexType.getColumn());
    }

    @Override
    public Type dot(Type field) {
        return new ErrorType(field.getLine(), field.getColumn());
    }

    @Override
    public Type cast(Type toCast) {
        return new ErrorType(getLine(), getColumn());
    }

    @Override
    public Type comparison(Type otherType) {
        if(otherType instanceof ErrorType) {
            return otherType;
        }
        return null;
    }

    @Override
    public boolean promotableTo(Type to) {
        return false;
    }

    @Override
    public boolean isLogical() {
        return false;
    }

    @Override
    public boolean isIndexable() {
        return false;
    }

    @Override
    public boolean isArithmetic() {
        return false;
    }

    @Override
    public boolean allowDot() {
        return false;
    }

}