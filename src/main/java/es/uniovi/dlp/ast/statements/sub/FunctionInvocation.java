package es.uniovi.dlp.ast.statements.sub;

import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.ast.expressions.sub.Variable;
import es.uniovi.dlp.ast.statements.AbstractStatement;

import java.util.ArrayList;
import java.util.List;

public class FunctionInvocation extends AbstractStatement implements Expression {
    private Variable variable;
    private List<Expression> parameters;

    public FunctionInvocation(int line, int column, Variable variable, List<Expression> parameters) {
        super(line, column);
        this.variable = variable;
        this.parameters = new ArrayList<Expression>(parameters);
    }

    @Override
    public String toString() {
        String params = "";
        for(Expression exp : parameters) {
            params += exp.toString() + ";";
        }
        return String.format("%s (%s)", variable.toString(), params);
    }
}
