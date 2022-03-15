package es.uniovi.dlp.ast.types.sub;

import es.uniovi.dlp.ast.types.AbstractType;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class CharType extends AbstractType {
    public CharType(int line, int column) {
        super(line, column);
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
