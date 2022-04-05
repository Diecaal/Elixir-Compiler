package es.uniovi.dlp.ast.expressions.sub;

import es.uniovi.dlp.ast.definitions.Definition;
import es.uniovi.dlp.ast.expressions.AbstractExpression;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class Variable extends AbstractExpression {
    private String name;
    private Definition definition;

    public Variable(int line, int column, String name) {
        super(line, column);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Definition getDefinition() {
        return definition;
    }

    public void setDefinition(Definition definition) {
        this.definition = definition;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }
}
