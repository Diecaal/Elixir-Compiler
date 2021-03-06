package es.uniovi.dlp.ast.types.sub;

import es.uniovi.dlp.ast.ASTNode;
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
    public Type assignment(Type rightType, ASTNode ast) {
        if(rightType instanceof IntType)
            return this;
        if(rightType instanceof CharType)
            return new CharType(ast.getLine(), ast.getColumn());

        return super.assignment(rightType, ast);
    }

    @Override
    public Type arithmetic(Type otherType, ASTNode ast) {
        if(otherType instanceof CharType || otherType instanceof IntType) {
            return this;
        } else if(otherType instanceof DoubleType) {
            return new DoubleType(getLine(), getColumn());
        }
        return super.arithmetic(otherType, ast);
    }

    @Override
    public Type logical(Type otherType, ASTNode ast) {
        if(otherType.isLogical())
            return this;
        return super.logical(otherType, ast);
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
    public boolean isSimple() {
        return true;
    }


    @Override
    public Type cast(Type toCast, ASTNode ast) {
        if(toCast instanceof CharType)
            return new CharType(toCast.getLine(), toCast.getColumn());
        else if(toCast instanceof IntType)
            return this;
        else if(toCast instanceof DoubleType)
            return new DoubleType(toCast.getLine(), toCast.getColumn());
        return super.cast(toCast, ast);
    }

    @Override
    public Type comparison(Type otherType, ASTNode ast) {
        if(otherType instanceof IntType || otherType instanceof CharType || otherType instanceof DoubleType)
            return this;
        return super.comparison(otherType, ast);
    }

    @Override
    public int getNumberBytes() {
        return 2;
    }

    @Override
    public Type getIntermediateType(Type to) {
        if(to instanceof DoubleType)
            return new DoubleType(getLine(), getColumn());
        else if(to instanceof CharType)
            return new CharType(getLine(), getColumn());

        return super.getIntermediateType(to);
    }

    @Override
    public boolean isPromotableTo(Type to) {
        if(to instanceof IntType || to instanceof DoubleType)
            return true;

        return super.isPromotableTo(to);
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }
}
