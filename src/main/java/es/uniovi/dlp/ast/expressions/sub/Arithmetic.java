package es.uniovi.dlp.ast.expressions.sub;

import es.uniovi.dlp.ast.expressions.AbstractExpression;
import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class Arithmetic extends AbstractExpression {
    private String operator;
    private Expression leftExpression;
    private Expression rightExpression;

    public Arithmetic(int line, int column, Expression leftExpression, String operator, Expression rightExpression) {
        super(line, column);
        this.leftExpression = leftExpression;
        this.operator = operator;
        this.rightExpression = rightExpression;
    }

    @Override
    public String toString() {
        return leftExpression.toString() + operator + rightExpression.toString();
    }

    public String getOperator() {
        return operator;
    }

    public Expression getLeftExpression() {
        return leftExpression;
    }

    public Expression getRightExpression() {
        return rightExpression;
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }
}
