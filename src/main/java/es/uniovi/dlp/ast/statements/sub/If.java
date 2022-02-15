package es.uniovi.dlp.ast.statements.sub;

import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.ast.statements.AbstractStatement;
import es.uniovi.dlp.ast.statements.Statement;

import java.util.List;

public class If extends AbstractStatement {
    private Expression condition;
    private List<Statement> ifBody;
    private List<Statement> elseBody;

    public If(int line, int column, Expression condition, List<Statement> ifBody, List<Statement> elseBody) {
        super(line, column);
        this.condition = condition;
        this.ifBody = ifBody;
        this.elseBody = elseBody;
    }
}
