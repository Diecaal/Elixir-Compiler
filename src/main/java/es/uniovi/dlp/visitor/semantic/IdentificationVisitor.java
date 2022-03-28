package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.definitions.sub.FunctionDefinition;
import es.uniovi.dlp.ast.definitions.sub.VariableDefinition;
import es.uniovi.dlp.ast.expressions.sub.Variable;
import es.uniovi.dlp.ast.statements.sub.FunctionInvocation;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.visitor.AbstractVisitor;

import java.util.List;

public class IdentificationVisitor extends AbstractVisitor<Type, Type> {

    SymbolTable table = new SymbolTable();

    @Override
    public Type visit(FunctionDefinition funcDefinition, Type param) {
        if(!table.insert(funcDefinition)) {
            ErrorManager.getInstance().addError( new Error(funcDefinition, ErrorReason.FUNCTION_ALREADY_DECLARED) );
        }
        return super.visit(funcDefinition, param);
    }

    @Override
    public Type visit(VariableDefinition variableDefinition, Type param) {
        if(!table.insert(variableDefinition)) {
            ErrorManager.getInstance().addError( new Error(variableDefinition, ErrorReason.VARIABLE_ALREADY_DECLARED) );
        }
        return super.visit(variableDefinition, param);
    }

    @Override
    public Type visit(Variable variable, Type param) {
        if(table.find(variable.getName()) == null) {
            ErrorManager.getInstance().addError( new Error(variable, ErrorReason.VARIABLE_NOT_DECLARED) );
        }
        // Assign variableDefinition to found variable if correct finding

        return super.visit(variable, param);
    }

    @Override
    public Type visit(FunctionInvocation functionInvocation, Type param) {
        if(table.find(functionInvocation.getVariable().getName()) == null) {
            List<Error> err = ErrorManager.getInstance().getErrors();
            ErrorManager.getInstance().addError( new Error(functionInvocation, ErrorReason.FUNCTION_NOT_DECLARED) );
            err = ErrorManager.getInstance().getErrors();
        }
        return super.visit(functionInvocation, param);
    }
}
