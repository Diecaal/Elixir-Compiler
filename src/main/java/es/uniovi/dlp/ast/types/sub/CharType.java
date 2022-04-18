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
        if(otherType instanceof CharType) {
            return new CharType(otherType.getLine(), otherType.getColumn());
        }
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

        return super.cast(toCast, ast);
    }

    @Override
    public Type comparison(Type otherType, ASTNode ast) {
        if (otherType instanceof CharType)
            return this;
        else if (otherType instanceof IntType)
            return new IntType(ast.getLine(), ast.getColumn());

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
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }
}
