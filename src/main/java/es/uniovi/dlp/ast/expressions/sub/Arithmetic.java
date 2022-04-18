package es.uniovi.dlp.ast.expressions.sub;

import es.uniovi.dlp.ast.expressions.AbstractExpression;
import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class Arithmetic extends AbstractExpression {
    private String operator;
    private Expression leftExpression;
    private Expression rightExpression;

    private int[] operatorPosition = new int[2];

    public Arithmetic(int line, int column, Expression leftExpression, String operator, Expression rightExpression) {
        super(line, column);
        this.leftExpression = leftExpression;
        this.operator = operator;
        this.rightExpression = rightExpression;
    }

    public Arithmetic(int line, int column, Expression leftExpression, String operator, int operatorLine, int operatorColumn, Expression rightExpression) {
        this(line,column,leftExpression,operator,rightExpression);
        operatorPosition[0] = operatorLine;
        operatorPosition[1] = operatorColumn;
    }

    @Override
    public String toString() {
        return leftExpression.toString() + operator + rightExpression.toString();
    }

    public String getOperator() {
        return operator;
    }

    public int getOperatorLine() {
        return operatorPosition[0];
    }

    public int getOperatorColumn() {
        return operatorPosition[1];
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
