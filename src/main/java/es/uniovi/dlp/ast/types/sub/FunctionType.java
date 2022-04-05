package es.uniovi.dlp.ast.types.sub;

import es.uniovi.dlp.ast.definitions.sub.VariableDefinition;
import es.uniovi.dlp.ast.types.AbstractType;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

import java.util.ArrayList;
import java.util.List;

public class FunctionType extends AbstractType {
    private Type returnType;
    private List<VariableDefinition> parameters;

    public FunctionType(int line, int column, List<VariableDefinition> parameters, Type returnType) {
        super(line, column);
        this.parameters = new ArrayList<VariableDefinition>(parameters);
        this.returnType = returnType;
    }

    public Type getReturnType() {
        return returnType;
    }

    public List<VariableDefinition> getParameters() {
        return parameters;
    }

    @Override
    public String toString() {
        String paramStr = "";
        for(VariableDefinition var : parameters)
            paramStr += var.toString() + ",";
        return String.format("(%s) :: %s", paramStr, returnType.toString());
    }

    @Override
    public int getNumberBytes() {
        int numBytes = 0;
        for(VariableDefinition param : getParameters())
            numBytes += param.getType().getNumberBytes();
        return numBytes;
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }
}
