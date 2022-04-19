package es.uniovi.dlp.ast.definitions.sub;

import es.uniovi.dlp.ast.definitions.AbstractDefinition;
import es.uniovi.dlp.ast.statements.Statement;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.ast.types.sub.FunctionType;
import es.uniovi.dlp.visitor.AbstractVisitor;

import java.util.ArrayList;
import java.util.List;

public class FunctionDefinition extends AbstractDefinition {
    private List<VariableDefinition> variableDefinitions;
    private List<Statement> statements;
    private FunctionType functionType;

    public FunctionDefinition(int line, int column, FunctionType type, String name, List<VariableDefinition> variableDefinitions, List<Statement> statements) {
        super(line, column, type, name);
        this.functionType = type;
		this.variableDefinitions = new ArrayList<VariableDefinition>(variableDefinitions);
        this.statements = new ArrayList<Statement>(statements);;
    }

    public List<VariableDefinition> getVariableDefinitions() {
        return variableDefinitions;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public List<VariableDefinition> getParameters() {
        return ((FunctionType)getType()).getParameters();
    }

    @Override
    public Type getType() {
        return this.functionType;
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

    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }
}
