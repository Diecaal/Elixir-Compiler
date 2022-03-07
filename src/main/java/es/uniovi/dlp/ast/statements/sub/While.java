package es.uniovi.dlp.ast.statements.sub;

import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.ast.statements.AbstractStatement;
import es.uniovi.dlp.ast.statements.Statement;

import java.util.ArrayList;
import java.util.List;

public class While extends AbstractStatement {
    private Expression condition;
    private List<Statement> body;

    public While(int line, int column, Expression condition, List<Statement> body) {
        super(line, column);
        this.condition = condition;
        this.body = new ArrayList<Statement>(body);
    }

    public Expression getCondition() {
        return condition;
    }

    public List<Statement> getBody() {
        return body;
    }

    @Override
    public String toString() {
        String bodyStr = "";
        for(Statement s : body)
            bodyStr += "\n" + s.toString();
        /* Only if body */
        return String.format("while %s do %s end", condition.toString(), bodyStr);
    }
}
