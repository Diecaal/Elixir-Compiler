package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.types.Type;

public abstract class AbstractExpression extends AbstractASTNode implements Expression {
    protected boolean Lvalue;
    protected Type type;

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

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public void setType(Type type) {
        this.type = type;
    }
}
