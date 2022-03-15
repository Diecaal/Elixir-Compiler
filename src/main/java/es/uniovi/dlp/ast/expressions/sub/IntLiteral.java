package es.uniovi.dlp.ast.expressions.sub;

import es.uniovi.dlp.ast.expressions.AbstractExpression;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class IntLiteral extends AbstractExpression {
    private int value;

    public IntLiteral(int line, int column, int value) {
        super(line, column);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }
}
