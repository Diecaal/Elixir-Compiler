package es.uniovi.dlp.ast.types.sub;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.types.AbstractType;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class CharType extends AbstractType {
    public CharType(int line, int column) {
        super(line, column);
    }

    @Override
    public Type assignment(Type rightType, ASTNode ast) {
        if(rightType instanceof CharType)
            return this;
        return super.assignment(rightType, ast);
    }

    @Override
    public Type arithmetic(Type otherType, ASTNode ast) {
        /**
         * if(otherType instanceof CharType)
         *  return IntType.getInstance();
         */
        if(otherType instanceof CharType) {
            return new CharType(otherType.getLine(), otherType.getColumn());
        }
        /**
         * if(otherType instanceof IntType || otherType instanceof DoubleType)
         *  return otherType;
         */
        return super.arithmetic(otherType, ast);
    }

    @Override
    public boolean isArithmetic() {
        return true;
    }

    @Override
    public Type cast(Type toCast, ASTNode ast) {
        if(toCast instanceof CharType || toCast instanceof IntType)
            return toCast;
        else if(toCast instanceof DoubleType)
            return new DoubleType(getLine(), getColumn());

        return super.cast(toCast, ast);
    }

    @Override
    public Type comparison(Type otherType, ASTNode ast) {
        if (otherType instanceof IntType || otherType instanceof CharType)
            return new BoolType(getLine(), getColumn());

        return super.comparison(otherType, ast);
    }

    @Override
    public int getNumberBytes() {
        return 1;
    }

    @Override
    public String toString() {
        return "char";
    }

    @Override
    public Type getIntermediateType(Type to) {
        if(to instanceof IntType || to instanceof DoubleType)
            return new IntType(getLine(), getColumn());

        return super.getIntermediateType(to);
    }

    @Override
    public boolean isPromotableTo(Type to) {
        if(to instanceof CharType || to instanceof IntType || to instanceof DoubleType)
            return true;

        return super.isPromotableTo(to);
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }
}
