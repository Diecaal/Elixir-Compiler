package es.uniovi.dlp.ast.expressions.sub;

import es.uniovi.dlp.ast.expressions.AbstractExpression;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class DoubleLiteral extends AbstractExpression {
    private double value;

    public DoubleLiteral(int line, int column, double value) {
        super(line, column);
        this.value = value;
    }

    public double getValue() {
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
