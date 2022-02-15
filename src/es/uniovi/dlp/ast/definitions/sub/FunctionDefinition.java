package es.uniovi.dlp.ast.definitions.sub;

import es.uniovi.dlp.ast.definitions.AbstractDefinition;
import es.uniovi.dlp.ast.statements.Statement;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.ast.types.sub.FunctionType;

import java.util.List;

public class FunctionDefinition extends AbstractDefinition {
    List<Statement> statements;
    private FunctionType type;
    private String name;

    public FunctionDefinition(int line, int column, FunctionType type, String name, List<Statement> statements) {
        super(line, column, type, name);
        this.statements = statements;
    }
}
