package es.uniovi.dlp.ast.statements.sub;

import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.ast.expressions.sub.Variable;
import es.uniovi.dlp.ast.statements.AbstractStatement;
import es.uniovi.dlp.visitor.AbstractVisitor;

import java.util.ArrayList;
import java.util.List;

public class Destructuring extends AbstractStatement {

    private List<Expression> variables;
    private Expression array;

    public Destructuring(int line, int column, List<Expression> variables, Expression array) {
        super(line, column);
        this.variables = variables;
        this.array = array;
    }

    public List<Expression> getVariables() {
        return variables;
    }

    public Expression getArray() {
        return array;
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }
}
