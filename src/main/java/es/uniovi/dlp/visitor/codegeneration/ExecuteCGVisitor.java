package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definitions.Definition;
import es.uniovi.dlp.ast.definitions.sub.FunctionDefinition;
import es.uniovi.dlp.ast.definitions.sub.VariableDefinition;
import es.uniovi.dlp.ast.expressions.sub.Cast;
import es.uniovi.dlp.ast.statements.Statement;
import es.uniovi.dlp.ast.statements.sub.*;
import es.uniovi.dlp.ast.types.sub.FunctionType;
import es.uniovi.dlp.ast.types.sub.VoidType;
import es.uniovi.dlp.visitor.AbstractVisitor;
import es.uniovi.dlp.visitor.codegeneration.util.ReturnStatementDTO;

import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ExecuteCGVisitor extends AbstractVisitor<Void, ReturnStatementDTO> {
    private final String sourceFile;
    private final CodeGenerator cg;
    private final AddressCGVisitor addressVisitor;  //new AddressCGVisitor(cg);
    private final ValueCGVisitor valueVisitor; // new ValueCGVisitor(cg, addressVisitor);

    public ExecuteCGVisitor(String sourceFile, OutputStreamWriter out, boolean showDebug) {
        this.sourceFile = sourceFile;
        this.cg = new CodeGenerator(out, showDebug);
        this.addressVisitor = new AddressCGVisitor(cg);
        this.valueVisitor = new ValueCGVisitor(cg, addressVisitor);
        this.addressVisitor.valueVisitor = valueVisitor;
    }

    @Override
    public Void visit(Program program, ReturnStatementDTO param) {
        cg.source(sourceFile);

        /**
         *  Aux data structures, for making sure first all variables definitions are traversed, and after them aññ
         *  function definitions. So first  of all variable definitions comments are displayed.
         */
        Queue<VariableDefinition> varDefs = new LinkedList<>();
        Queue<FunctionDefinition> funcDefs = new LinkedList<>();

        for(Definition definition : program.getDefinitions()) {
            if(definition instanceof VariableDefinition)
                varDefs.add((VariableDefinition) definition);
            else
                funcDefs.add((FunctionDefinition) definition);
        }

        while(!varDefs.isEmpty())
            varDefs.poll().accept(this, null);

        cg.callMain();

        while(!funcDefs.isEmpty())
            funcDefs.poll().accept(this, null);

        return null;
    }

    @Override
    public Void visit(FunctionDefinition funcDefinition, ReturnStatementDTO param) {
        cg.writeLine(funcDefinition.getLine());
        cg.writeLabel(funcDefinition.getName());
        funcDefinition.getType().accept(this, param);

        int localBytes = 0;

        cg.writeComment("Local variables");
        for(int i=0; i<funcDefinition.getVariableDefinitions().size();i++){
            funcDefinition.getVariableDefinitions().get(i).accept(this, param);
            if(i == funcDefinition.getVariableDefinitions().size() - 1)
                /* Assign local bytes needed by the function to size of last variable definition declared */
                localBytes = -(funcDefinition.getVariableDefinitions().get(i).getOffset());
        }
        cg.enter(Math.abs(localBytes));

        FunctionType functionType = ((FunctionType)funcDefinition.getType());
        int parametersBytes = functionType.getParameters().stream().mapToInt(parameter -> parameter.getType().getNumberBytes()).sum();
        int returnBytes = functionType.getReturnType() instanceof VoidType ? 0 : functionType.getReturnType().getNumberBytes();

        ReturnStatementDTO returnStatementDTO = new ReturnStatementDTO(localBytes, parametersBytes, returnBytes);

        for(Statement statement : funcDefinition.getStatements()) {
            statement.accept(this, returnStatementDTO);
        }

        if(functionType.getReturnType() instanceof VoidType) {
            cg.returnCG(new ReturnStatementDTO(localBytes, parametersBytes, 0));
        }

        return null;
    }

    @Override
    public Void visit(FunctionType functionType, ReturnStatementDTO param) {
        cg.writeComment("Parameters");
        functionType.getParameters().forEach(parameter -> parameter.accept(this, param));
        return null;
    }

    @Override
    public Void visit(VariableDefinition variableDefinition, ReturnStatementDTO param) {
        cg.variableDefinitionComment(variableDefinition);
        return null;
    }

    @Override
    public Void visit(Write write, ReturnStatementDTO param) {
        cg.writeLine(write.getLine());
        cg.writeComment("Write");
        write.getExpression().accept(valueVisitor, null);
        cg.out(write.getExpression().getType());
        return null;
    }

    @Override
    public Void visit(Read read, ReturnStatementDTO param) {
        cg.writeLine(read.getLine());
        cg.writeComment("Read");
        read.getExpression().accept(addressVisitor, null);
        cg.in(read.getExpression().getType());
        cg.store(read.getExpression().getType());
        return null;
    }

    @Override
    public Void visit(Assignment assignment, ReturnStatementDTO param) {
        cg.writeLine(assignment.getLine());
        cg.writeComment("Assignment");
        assignment.getLeftExpression().accept(addressVisitor, null);
        assignment.getRightExpression().accept(valueVisitor, null);
        cg.promote(assignment.getRightExpression().getType(), assignment.getLeftExpression().getType());
        cg.store(assignment.getLeftExpression().getType());
        return null;
    }

    @Override
    public Void visit(If ifStm, ReturnStatementDTO param) {
        cg.writeLine(ifStm.getLine());
        cg.writeComment("If statement");

        String elseBodyLabel = cg.requestLabel();
        String exitIfLabel =  cg.requestLabel();

        cg.writeComment("If condition");
        ifStm.getCondition().accept(valueVisitor, null);
        cg.writeInstruction( String.format("jz\t%s", elseBodyLabel) );

        cg.writeComment("Body of the if branch");
        ifStm.getIfBody().forEach(statement -> statement.accept(this, param));
        cg.writeInstruction( String.format("jmp\t%s", exitIfLabel));

        cg.writeLabel(elseBodyLabel); /* ENTER ELSE */

        cg.writeComment("Body of the else branch");
        ifStm.getElseBody().forEach(statement -> statement.accept(this, param));

        cg.writeLabel(exitIfLabel); /* EXIT IF */

        return null;
    }

    @Override
    public Void visit(While whileStm, ReturnStatementDTO param) {
        cg.writeLine(whileStm.getLine());
        cg.writeComment("While statement");

        String startWhileLabel = cg.requestLabel();
        String exitWhileLabel = cg.requestLabel();

        cg.writeLabel(startWhileLabel); /* ENTER WHILE */

        cg.writeComment("While condition");
        whileStm.getCondition().accept(valueVisitor, null);
        cg.writeInstruction( String.format("jz\t%s", exitWhileLabel) );

        cg.writeComment("Body of the while statement");
        whileStm.getBody().forEach(statement -> statement.accept(this, param));

        cg.writeInstruction(String.format("jmp\t%s", startWhileLabel));
        cg.writeLabel(exitWhileLabel); /* EXIT WHILE */

        return null;
    }

    @Override
    public Void visit(Return returnStm, ReturnStatementDTO param) {
        cg.writeLine(returnStm.getLine());
        cg.writeComment("Return statement");

        returnStm.getExpression().accept(valueVisitor, null);
        cg.returnCG(param);
        return null;
    }

    @Override
    public Void visit(FunctionInvocation functionInvocation, ReturnStatementDTO param) {
        cg.writeLine(functionInvocation.getLine());
        cg.writeComment("Function invocation statement");

        functionInvocation.getParameters().forEach( p -> p.accept(valueVisitor, null) );
        cg.call(functionInvocation.getVariable().getName());

        if ( !( functionInvocation.getType() instanceof VoidType) )
            cg.pop(functionInvocation.getType());

        return null;
    }
}
