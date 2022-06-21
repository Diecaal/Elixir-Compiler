package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.ast.types.sub.ErrorType;

import java.util.List;

public abstract class AbstractType extends AbstractASTNode implements Type {

    public AbstractType(int line, int column) {
        super(line, column);
    }

    @Override
    public Type arithmetic(Type otherType, ASTNode ast) {
        return new ErrorType(ast.getLine(), ast.getColumn());
    }

    @Override
    public Type logical(Type otherType, ASTNode ast) {
        return new ErrorType(ast.getLine(), ast.getColumn());
    }

    @Override
    public Type indexing(Type indexType, ASTNode ast) {
        return new ErrorType(ast.getLine(), ast.getColumn());
    }

    @Override
    public Type dot(String field, ASTNode ast) {
        return new ErrorType(ast.getLine(), ast.getColumn());
    }

    @Override
    public Type cast(Type toCast, ASTNode ast) {
        return new ErrorType(ast.getLine(), ast.getColumn());
    }

    @Override
    public Type comparison(Type otherType, ASTNode ast) {
        return new ErrorType(ast.getLine(), ast.getColumn());
    }

    @Override
    public Type assignment(Type rightType, ASTNode ast) {
        return new ErrorType(ast.getLine(), ast.getColumn());
    }

    @Override
    public Type invocation(List<Expression> parameters, ASTNode ast) {
        return new ErrorType(ast.getLine(), ast.getColumn());
    }

//    @Override
//    public Type typesMatch(Type otherType, ASTNode ast) {
//        if(this.getClass().equals(otherType.getClass()))
//            return this;
//        return new ErrorType(ast.getLine(), ast.getColumn());
//    }

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

    @Override
    public boolean isInvocable() {
        return false;
    }

    @Override
    public boolean isError() {
        return false;
    }

    @Override
    public boolean isPromotableTo(Type to) {
        return false;
    }

    @Override
    public int getNumberBytes() {
        return 0;
    }

    @Override
    public Type getIntermediateType(Type to) {
        if(this.getClass().equals(to.getClass()))
            return this;
        return null;
    }
}