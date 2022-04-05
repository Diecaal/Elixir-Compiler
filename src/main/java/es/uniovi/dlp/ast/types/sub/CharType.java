package es.uniovi.dlp.ast.types.sub;

import es.uniovi.dlp.ast.types.AbstractType;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class CharType extends AbstractType {
    public CharType(int line, int column) {
        super(line, column);
    }

    @Override
    public Type arithmetic(Type otherType) {
        if(otherType instanceof CharType) {
            return new CharType(otherType.getLine(), otherType.getColumn());
        }
        return super.arithmetic(otherType);
    }

    @Override
    public Type cast(Type from) {
        if(from instanceof CharType || from instanceof IntType)
            return from;
        return super.cast(from);
    }

    @Override
    public boolean isArithmetic() {
        return true;
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
