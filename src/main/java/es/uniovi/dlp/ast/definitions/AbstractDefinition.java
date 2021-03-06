package es.uniovi.dlp.ast.definitions;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.types.Type;

public abstract class AbstractDefinition extends AbstractASTNode implements Definition {
    private Type type;
    private String name;
    private int scope;

    public AbstractDefinition(int line, int column, Type type, String name) {
        super(line, column);
        this.type = type;
        this.name = name;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setScope(int scope) { this.scope =  scope; }

    public int getScope() { return this.scope; }
}
