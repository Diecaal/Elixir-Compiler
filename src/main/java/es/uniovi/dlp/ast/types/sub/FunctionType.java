package es.uniovi.dlp.ast.types.sub;

import es.uniovi.dlp.ast.definitions.sub.VariableDefinition;
import es.uniovi.dlp.ast.types.AbstractType;
import es.uniovi.dlp.ast.types.Type;

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

    @Override
    public String toString() {
        String paramStr = "";
        for(VariableDefinition var : parameters)
            paramStr += var.toString();
        return String.format("(%s) :: %s", paramStr, returnType.toString());
    }
}
