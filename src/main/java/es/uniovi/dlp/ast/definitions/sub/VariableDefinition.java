package es.uniovi.dlp.ast.definitions.sub;

import es.uniovi.dlp.ast.definitions.AbstractDefinition;
import es.uniovi.dlp.ast.definitions.Definition;
import es.uniovi.dlp.ast.statements.AbstractStatement;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class VariableDefinition extends AbstractDefinition {
    public VariableDefinition(int line, int column, Type type, String name) {
        super(line, column, type, name);
    }

    @Override
    public String toString() {
        return String.format("%s :: %s", this.getName(), this.getType());
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }
}
