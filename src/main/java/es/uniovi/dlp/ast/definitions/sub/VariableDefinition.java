package es.uniovi.dlp.ast.definitions.sub;

import es.uniovi.dlp.ast.definitions.AbstractDefinition;
import es.uniovi.dlp.ast.definitions.Definition;
import es.uniovi.dlp.ast.statements.AbstractStatement;
import es.uniovi.dlp.ast.types.Type;

public class VariableDefinition extends AbstractStatement implements Definition {
    private Type type;
    private String name;

    public VariableDefinition(int line, int column, Type type, String name) {
        super(line, column);
        this.type = type;
        this.name = name;
    }

    @Override
    public Type getType() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String toString() {
        return String.format("%s :: $s", name, type.toString());
    }
}
