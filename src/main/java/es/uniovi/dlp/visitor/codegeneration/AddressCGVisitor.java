package es.uniovi.dlp.visitor.codegeneration;

import com.ibm.icu.impl.UResource;
import es.uniovi.dlp.ast.definitions.sub.VariableDefinition;
import es.uniovi.dlp.ast.expressions.sub.*;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.ast.types.sub.IntType;
import es.uniovi.dlp.ast.types.sub.StructType;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class AddressCGVisitor extends AbstractVisitor<Void, Void> {
    private final CodeGenerator cg;
    public ValueCGVisitor valueVisitor = null;

    public AddressCGVisitor(CodeGenerator cg) {
        this.cg = cg;
    }

    @Override
    public Void visit(ArrayAccess arrayAccess, Void param) {
        arrayAccess.getArray().accept(this, param);
        arrayAccess.getIndex().accept(valueVisitor, param);
        cg.writeInstruction("pushi\t" + arrayAccess.getType().getNumberBytes());
        cg.writeInstruction("muli");
        cg.writeInstruction("addi");
        return null;
    }



    @Override
    public Void visit(StructAccess structAccess, Void param) {
        structAccess.getStruct().accept(this, param);
        cg.writeInstruction("pushi\t" + ((StructType) structAccess.getStruct().getType()).findRecordByName(structAccess.getField()).getOffset());
        cg.writeInstruction("addi");
        return null;
    }

    @Override
    public Void visit(Variable variable, Void param) {
        if(variable.getDefinition().getScope() == 0) {
            cg.writeInstruction( String.format("pusha\t%s", ((VariableDefinition) variable.getDefinition()).getOffset()) );
        } else {
            cg.writeInstruction( String.format("push\tbp") );
            cg.writeInstruction( String.format("pushi\t%s", ((VariableDefinition) variable.getDefinition()).getOffset()) );
            cg.writeInstruction( String.format("addi") );
        }
        return null;
    }
}
