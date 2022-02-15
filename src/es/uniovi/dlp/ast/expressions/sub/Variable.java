package es.uniovi.dlp.ast.expressions.sub;

import es.uniovi.dlp.ast.expressions.AbstractExpression;

public class Variable extends AbstractExpression {
    private String name;

    public Variable(int line, int column, String name) {
        super(line, column);
        this.name = name;
    }
}
