package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.AbstractASTNode;

public abstract class AbstractExpression extends AbstractASTNode implements Expression {
    protected boolean Lvalue;

    public AbstractExpression(int line, int column) {
        super(line, column);
    }

    @Override
    public void setLvalue(boolean Lvalue) {
        this.Lvalue = Lvalue;
    }

    @Override
    public boolean getLvalue() {
        return this.Lvalue;
    }
}
