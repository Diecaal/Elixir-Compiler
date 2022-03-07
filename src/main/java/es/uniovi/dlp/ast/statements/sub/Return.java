package es.uniovi.dlp.ast.statements.sub;

import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.ast.statements.AbstractStatement;

public class Return extends AbstractStatement {
    private Expression expression;

    public Return(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "return" + expression.toString();
    }
}
