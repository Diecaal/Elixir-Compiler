package es.uniovi.dlp.ast.definitions.sub;

import es.uniovi.dlp.ast.definitions.AbstractDefinition;
import es.uniovi.dlp.ast.statements.Statement;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.ast.types.sub.FunctionType;

import java.util.ArrayList;
import java.util.List;

public class FunctionDefinition extends AbstractDefinition {
    List<VariableDefinition> varDefs;
    List<Statement> statements;
    private FunctionType type;
    private String name;

    public FunctionDefinition(int line, int column, FunctionType type, String name, List<VariableDefinition> variableDefinitions, List<Statement> statements) {
        super(line, column, type, name);
		this.type = type;
		this.name = name;
		this.varDefs = new ArrayList<VariableDefinition>(variableDefinitions);
        this.statements = new ArrayList<Statement>(statements);;
    }
}