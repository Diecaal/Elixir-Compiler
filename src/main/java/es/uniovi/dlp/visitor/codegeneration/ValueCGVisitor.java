package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.definitions.sub.VariableDefinition;
import es.uniovi.dlp.ast.expressions.sub.*;
import es.uniovi.dlp.ast.statements.sub.FunctionInvocation;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class ValueCGVisitor extends AbstractVisitor<Void, Void> {
    private final CodeGenerator cg;
    private final AddressCGVisitor addressVisitor;

    public ValueCGVisitor(CodeGenerator cg, AddressCGVisitor addressVisitor) {
        this.cg = cg;
        this.addressVisitor = addressVisitor;
    }

    @Override
    public Void visit(Arithmetic arithmetic, Void param) {
        arithmetic.getRightExpression().accept(this, param);
        arithmetic.getLeftExpression().accept(this, param);
        cg.writeInstruction(String.format("%s%s", cg.getArithmeticOperand(arithmetic.getOperator()), arithmetic.getType()));
        return null;
    }

    @Override
    public Void visit(Logical logical, Void param) {
        logical.getRightExpression().accept(this, param);
        logical.getLeftExpression().accept(this, param);
        cg.writeInstruction(String.format("%s", cg.getLogicalOperand(logical.getOperator())));
        return null;
    }

    @Override
    public Void visit(Relational relational, Void param) {
        relational.getRightExpression().accept(this, param);
        relational.getLeftExpression().accept(this, param);
        cg.writeInstruction(String.format("%s%s", cg.getRelationalOperand(relational.getOperator()), relational.getType()));
        return null;
    }

    @Override
    public Void visit(Cast cast, Void param) {
        cast.getExpression().accept(this, param);
        cg.convertTo(cast.getExpression().getType(), cast.getCastType());
        return null;
    }

    @Override
    public Void visit(CharLiteral charLiteral, Void param) {
        cg.writeInstruction( String.format("pushb\t%s", (int) charLiteral.getValue()) );
        return null;
    }

    @Override
    public Void visit(IntLiteral intLiteral, Void param) {
        cg.writeInstruction( String.format("pushi\t%s", intLiteral.getValue()) );
        return null;
    }

    @Override
    public Void visit(DoubleLiteral doubleLiteral, Void param) {
        cg.writeInstruction( String.format("pushf\t%s", doubleLiteral.getValue()) );
        return null;
    }

    @Override
    public Void visit(ArrayAccess arrayAccess, Void param) {
        cg.writeComment("Indexing");
        arrayAccess.accept(addressVisitor, param);
        cg.writeInstruction( String.format("load%s", cg.getSuffix(arrayAccess.getType())));
        return null;
    }

    @Override
    public Void visit(StructAccess structAccess, Void param) {
        cg.writeComment("Field Access");
        structAccess.accept(addressVisitor, param);
        cg.writeInstruction( String.format("load%s", cg.getSuffix(structAccess.getType())));
        return null;
    }

    @Override
    public Void visit(Variable variable, Void param) {
        variable.accept(addressVisitor, param);
        cg.writeInstruction(String.format("load%s", cg.getSuffix(variable.getType())));
        return null;
    }

    @Override
    public Void visit(FunctionInvocation functionInvocation, Void param) {
        functionInvocation.getParameters().forEach(parameter -> parameter.accept(this, param));
        cg.call(functionInvocation.getVariable().getName());
        return null;
    }
}
