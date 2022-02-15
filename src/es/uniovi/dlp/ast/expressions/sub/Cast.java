package es.uniovi.dlp.ast.expressions.sub;

import es.uniovi.dlp.ast.expressions.AbstractExpression;
import es.uniovi.dlp.ast.expressions.Expression;

public class Cast extends AbstractExpression {

    private Type castType;
    private Expression expression;

    public Cast(int line, int column, Type castType, Expression expression) {
        super(line, column);
        this.castType = castType;
        this.expression = expression;
    }
}
