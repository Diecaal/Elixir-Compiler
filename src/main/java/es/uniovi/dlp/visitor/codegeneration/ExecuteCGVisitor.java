package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definitions.Definition;
import es.uniovi.dlp.ast.definitions.sub.FunctionDefinition;
import es.uniovi.dlp.ast.definitions.sub.VariableDefinition;
import es.uniovi.dlp.ast.statements.Statement;
import es.uniovi.dlp.ast.statements.sub.Write;
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
        for(Definition definition : program.getDefinitions()) {
            definition.accept(this, param);
        }
        return null;
    }

    @Override
    public Void visit(FunctionDefinition funcDefinition, Void param) {
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
        cg.writeComment(String.format("%s :: %s (offset %s)",
                variableDefinition.getName(), variableDefinition.getType(), variableDefinition.getOffset())
        );
        return null;
    }

    @Override
    public Void visit(Write write, Void param) {
        write.accept(valueVisitor, param);
        cg.writeLine(write.getLine());
        cg.writeInstruction(String.format("out %s", cg.getSuffix(write.getExpression().getType())));
        return null;
    }
}
