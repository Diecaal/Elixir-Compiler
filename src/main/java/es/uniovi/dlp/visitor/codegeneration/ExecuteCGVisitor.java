package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definitions.Definition;
import es.uniovi.dlp.ast.definitions.sub.FunctionDefinition;
import es.uniovi.dlp.ast.definitions.sub.VariableDefinition;
import es.uniovi.dlp.ast.expressions.sub.Cast;
import es.uniovi.dlp.ast.statements.Statement;
import es.uniovi.dlp.ast.statements.sub.*;
import es.uniovi.dlp.ast.types.sub.FunctionType;
import es.uniovi.dlp.visitor.AbstractVisitor;

import java.io.OutputStreamWriter;

public class ExecuteCGVisitor extends AbstractVisitor<Void, Void> {
    private final String sourceFile;
    private final CodeGenerator cg;
    private final AddressCGVisitor addressVisitor;  //new AddressCGVisitor(cg);
    private final ValueCGVisitor valueVisitor; // new ValueCGVisitor(cg, addressVisitor);

    public ExecuteCGVisitor(String sourceFile, OutputStreamWriter out, boolean showDebug) {
        this.sourceFile = sourceFile;
        this.cg = new CodeGenerator(out, showDebug);
        this.addressVisitor = new AddressCGVisitor(cg);
        this.valueVisitor = new ValueCGVisitor(cg, addressVisitor);
    }

    @Override
    public Void visit(Program program, Void param) {
        cg.writeComment("Program");
        for(Definition definition : program.getDefinitions()) {
            definition.accept(this, param);
        }
        return null;
    }

    @Override
    public Void visit(FunctionDefinition funcDefinition, Void param) {
        cg.writeComment("Function Definition");
        cg.writeLine(funcDefinition.getLine());
        funcDefinition.getType().accept(this, param);

        int localBytes = 0;

        for(int i=0; i<funcDefinition.getVariableDefinitions().size();i++){
            funcDefinition.getVariableDefinitions().get(i).accept(this, param);
            if(i == funcDefinition.getVariableDefinitions().size() - 1)
                /* Assign local bytes needed by the function to size of last variable definition declared */
                localBytes = funcDefinition.getVariableDefinitions().get(i).getOffset();
        }
        for(Statement statement : funcDefinition.getStatements()) {
            statement.accept(this, param);
        }

        cg.writeInstruction(String.format("enter %s", localBytes));

        int parametersBytes = funcDefinition.getType().getNumberBytes();
        int returnBytes = funcDefinition.getType().getNumberBytes();

        cg.writeInstruction(String.format("ret %s, %s, %s", returnBytes, localBytes, parametersBytes));

        return null;
    }

    @Override
    public Void visit(VariableDefinition variableDefinition, Void param) {
        cg.writeComment("Variable Definition");
        cg.writeComment(String.format("%s :: %s (offset %s)",
                variableDefinition.getName(), variableDefinition.getType(), variableDefinition.getOffset())
        );
        return null;
    }

    @Override
    public Void visit(Write write, Void param) {
        cg.writeLine(write.getLine());
        cg.writeComment("Write");
        write.accept(valueVisitor, param);
        cg.writeInstruction(String.format("out %s", cg.getSuffix(write.getExpression().getType())));
        return null;
    }

    @Override
    public Void visit(Read read, Void param) {
        cg.writeLine(read.getLine());
        cg.writeComment("Read");
        read.accept(valueVisitor, param);
        cg.writeInstruction(String.format("in %s", cg.getSuffix(read.getExpression().getType())));
        return null;
    }

    @Override
    public Void visit(Assignment assignment, Void param) {
        cg.writeLine(assignment.getLine());
        cg.writeComment("Assignment");
        assignment.getLeftExpression().accept(addressVisitor, param);
        assignment.getRightExpression().accept(this, param);
        cg.writeInstruction(String.format("store%s", cg.getSuffix(assignment.getRightExpression().getType())));
        return null;
    }

    @Override
    public Void visit(If ifStm, Void param) {
        cg.writeLine(ifStm.getLine());
        cg.writeComment("If");

        String elseBodyLabel = cg.requestLabel();
        String exitIfLabel =  cg.requestLabel();

        cg.writeComment("If condition");
        ifStm.getCondition().accept(valueVisitor, param);
        cg.writeInstruction( String.format("jz\t%s", elseBodyLabel) );

        cg.writeComment("If branch body");
        ifStm.getIfBody().forEach(statement -> statement.accept(this, param));
        cg.writeInstruction( String.format("jmp\t%s", exitIfLabel));

        cg.writeLabel(elseBodyLabel); /* ENTER ELSE */

        cg.writeComment("Else branch body");
        ifStm.getElseBody().forEach(statement -> statement.accept(this, param));

        cg.writeLabel(exitIfLabel); /* EXIT IF */

        return null;
    }

    @Override
    public Void visit(While whileStm, Void param) {
        cg.writeLine(whileStm.getLine());
        cg.writeComment("While");

        String startWhileLabel = cg.requestLabel();
        String exitWhileLabel = cg.requestLabel();

        cg.writeLabel(startWhileLabel); /* ENTER WHILE */

        cg.writeComment("While condition");
        whileStm.getCondition().accept(valueVisitor, param);
        cg.writeInstruction( String.format("jz\t%s", exitWhileLabel) );

        cg.writeComment("While body");
        whileStm.getBody().forEach(statement -> statement.accept(this, param));

        cg.writeInstruction(String.format("jmp\t%s", startWhileLabel));
        cg.writeLabel(exitWhileLabel); /* EXIT WHILE */

        return null;
    }
}
