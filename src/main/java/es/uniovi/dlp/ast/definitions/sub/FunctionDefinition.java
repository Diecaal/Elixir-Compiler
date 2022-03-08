package es.uniovi.dlp.ast.definitions.sub;

import es.uniovi.dlp.ast.definitions.AbstractDefinition;
import es.uniovi.dlp.ast.statements.Statement;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.ast.types.sub.FunctionType;

import java.util.ArrayList;
import java.util.List;

public class FunctionDefinition extends AbstractDefinition {
    private List<VariableDefinition> variableDefinitions;
    private List<Statement> statements;

    public FunctionDefinition(int line, int column, FunctionType type, String name, List<VariableDefinition> variableDefinitions, List<Statement> statements) {
        super(line, column, type, name);
		this.variableDefinitions = new ArrayList<VariableDefinition>(variableDefinitions);
        this.statements = new ArrayList<Statement>(statements);;
    }

    public List<VariableDefinition> getVariableDefinitions() {
        return variableDefinitions;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    @Override
    public String toString() {
        String varDefsStr = "";
        for(VariableDefinition varDef : getVariableDefinitions())
            varDefsStr += "\n" + varDef.toString();
        String statementStr = "";
        for(Statement s : getStatements())
            statementStr += "\n" + s.toString();
        return String.format("def %s %s do %s %s end", this.getName(), this.getType(), varDefsStr, statementStr);
    }
}
