package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.types.sub.ErrorType;

public abstract class AbstractType extends AbstractASTNode implements Type {

    public AbstractType(int line, int column) {
        super(line, column);
    }

    @Override
    public Type arithmetic(Type otherType) {
        if(otherType instanceof ErrorType) {
            return otherType;
        }
        return null;
    }

    @Override
    public Type logical(Type otherType) {
        if(otherType instanceof ErrorType) {
            return otherType;
        }
        return null;
    }

    @Override
    public Type indexing(Type indexType) {
        if(indexType instanceof ErrorType) {
            return indexType;
        }
        return null;
    }

    @Override
    public Type dot(Type field) {
        if(field instanceof ErrorType) {
            return field;
        }
        return null;
    }

    @Override
    public Type cast(Type from) {
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
