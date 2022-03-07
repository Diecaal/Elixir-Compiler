package es.uniovi.dlp.ast.expressions.sub;

import es.uniovi.dlp.ast.expressions.AbstractExpression;
import es.uniovi.dlp.ast.expressions.Expression;

public class Logical extends AbstractExpression {
    private String operator;
    private Expression leftExpression;
    private Expression rightExpression;

    public Logical(int line, int column, Expression leftExpression, String operator, Expression rightExpression) {
        super(line, column);
        this.leftExpression = leftExpression;
        this.operator = operator;
        this.rightExpression = rightExpression;
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
    public String toString() {
        return leftExpression.toString() + operator + rightExpression.toString();
    }
}
