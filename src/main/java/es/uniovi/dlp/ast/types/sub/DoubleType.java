package es.uniovi.dlp.ast.types.sub;

import es.uniovi.dlp.ast.ASTNode;
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
    public Type assignment(Type rightType, ASTNode ast) {
        if(rightType instanceof DoubleType)
            return this;
        else if(rightType instanceof IntType)
            return new IntType(ast.getLine(), ast.getColumn());
        else if(rightType instanceof CharType)
            return new CharType(ast.getLine(), ast.getColumn());
        return super.assignment(rightType, ast);
    }

    @Override
    public Type arithmetic(Type otherType, ASTNode ast) {
        if(otherType instanceof DoubleType)
            return this;
        else if(otherType instanceof IntType)
            return new DoubleType(otherType.getLine(), otherType.getColumn());

        return super.arithmetic(otherType, ast);
    }

    @Override
    public Type cast(Type toCast, ASTNode ast) {
        if(toCast instanceof DoubleType)
            return this;
        else if(toCast instanceof IntType)
            return new IntType(getLine(), getColumn());

        return super.cast(toCast, ast);
    }

    @Override
    public Type comparison(Type otherType, ASTNode ast) {
        if(otherType instanceof DoubleType || otherType instanceof IntType)
            return this;
        return super.comparison(otherType, ast);
    }

    @Override
    public boolean isArithmetic() {
        return true;
    }

    @Override
    public int getNumberBytes() {
        return 4;
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }
}
