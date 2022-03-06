package es.uniovi.dlp.ast.statements.sub;

import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.ast.statements.AbstractStatement;
import es.uniovi.dlp.ast.statements.Statement;

import java.util.ArrayList;
import java.util.List;

public class If extends AbstractStatement {
    private Expression condition;
    private List<Statement> ifBody;
    private List<Statement> elseBody;

    public If(int line, int column, Expression condition, List<Statement> ifBody, List<Statement> elseBody) {
        super(line, column);
        this.condition = condition;
        this.ifBody = new ArrayList<Statement>(ifBody);
        this.elseBody = new ArrayList<Statement>(elseBody);
    }

    @Override
    public String toString() {
        String ifBodyStr = "";
        for(Statement s : ifBody)
            ifBodyStr += "\n" + s.toString();
        /* Only if body */
        if(elseBody.size() <= 0)
            return String.format("if %s do %s end", condition.toString(), ifBodyStr);
        /* If and else body */
        String elseBodyStr = "";
        for(Statement s : elseBody)
            elseBodyStr += "\n" + s.toString();
        return String.format("if %s do %s else %s end", condition.toString(), ifBodyStr, elseBodyStr);
    }
}
