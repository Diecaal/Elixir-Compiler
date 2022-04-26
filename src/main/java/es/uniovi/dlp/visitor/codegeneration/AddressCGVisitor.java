package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.definitions.sub.VariableDefinition;
import es.uniovi.dlp.ast.expressions.sub.*;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.ast.types.sub.IntType;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class AddressCGVisitor extends AbstractVisitor<Void, Void> {
    private final CodeGenerator cg;

    public AddressCGVisitor(CodeGenerator cg) {
        this.cg = cg;
    }

    @Override
    public Void visit(ArrayAccess arrayAccess, Void param) {
        return super.visit(arrayAccess, param);
    }

    @Override
    public Void visit(StructAccess structAccess, Void param) {
        return super.visit(structAccess, param);
    }

    @Override
    public Void visit(Variable variable, Void param) {
        if(variable.getDefinition().getScope() == 0) {
            cg.writeInstruction( String.format("pusha %s", ((VariableDefinition) variable.getDefinition()).getOffset()) );
        } else {
            cg.writeInstruction( String.format("push\tbp") );
            cg.writeInstruction( String.format("pushi %s", ((VariableDefinition) variable.getDefinition()).getOffset()) );
            cg.writeInstruction( String.format("addi") );
        }
        return super.visit(variable, param);
    }
}
