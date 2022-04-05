package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.definitions.sub.FunctionDefinition;
import es.uniovi.dlp.ast.definitions.sub.VariableDefinition;
import es.uniovi.dlp.ast.types.sub.FunctionType;
import es.uniovi.dlp.ast.types.sub.RecordType;
import es.uniovi.dlp.ast.types.sub.StructType;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class OffsetVisitor extends AbstractVisitor<Void, Integer> {

    private int globalVariablesBytes = 0;

    @Override
    public Void visit(FunctionDefinition funcDefinition, Integer param) {
        int localNumberBytes = 0;

        // Annotate function parameters
        funcDefinition.getType().accept(this, localNumberBytes);

        // Proceed to annotate body's variable definitions
        for(VariableDefinition varDef : funcDefinition.getVariableDefinitions()) {
            varDef.accept(this, localNumberBytes);
            localNumberBytes += varDef.getType().getNumberBytes();
        }

        return super.visit(funcDefinition, param);
    }

    @Override
    public Void visit(VariableDefinition variableDefinition, Integer param) {
        if(variableDefinition.getScope() == 0) {
            variableDefinition.setOffset(globalVariablesBytes);
            globalVariablesBytes += variableDefinition.getType().getNumberBytes();
        } else {
            if(param != null)
                variableDefinition.setOffset(param);
        }

        return super.visit(variableDefinition, param);
    }

    @Override
    public Void visit(FunctionType functionType, Integer param) {
        int localParamsBytes = 0;

        for(VariableDefinition parameter : functionType.getParameters()) {
            parameter.setOffset(localParamsBytes);
            localParamsBytes += parameter.getType().getNumberBytes();
        }
        return super.visit(functionType, param);
    }

    @Override
    public Void visit(StructType structType, Integer param) {
        int localRecordsBytes = 0;

        for(RecordType record : structType.getRecords()) {
            record.setOffset(localRecordsBytes);
            localRecordsBytes += record.getNumberBytes();
        }

        return super.visit(structType, param);
    }

    @Override
    public Void visit(RecordType recordType, Integer param) {
        return super.visit(recordType, param);
    }
}
