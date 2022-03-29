package es.uniovi.dlp.ast.statements.sub;

import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.ast.expressions.sub.Variable;
import es.uniovi.dlp.ast.statements.AbstractStatement;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

import java.util.ArrayList;
import java.util.List;

public class FunctionInvocation extends AbstractStatement implements Expression {
    private Variable variable;
    private List<Expression> parameters;
    private boolean Lvalue;
    private Type type;

    public FunctionInvocation(int line, int column, Variable variable, List<Expression> parameters) {
        super(line, column);
        this.variable = variable;
        this.parameters = new ArrayList<Expression>(parameters);
    }

    public Variable getVariable() {
        return variable;
    }

    public List<Expression> getParameters() {
        return parameters;
    }

    @Override
    public String toString() {
        String params = "";
        for(Expression exp : parameters) {
            params += exp.toString() + ",";
        }
        return String.format("%s (%s)", variable.toString(), params);
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }

    @Override
    public void setLvalue(boolean Lvalue) {
        this.Lvalue = Lvalue;
    }

    @Override
    public boolean getLvalue() {
        return this.Lvalue;
    }

    @Override
    public Type getType() {
        return this.type;
    }

    @Override
    public void setType(Type type) {
        this.type = type;
    }
}
