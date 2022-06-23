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
        arithmetic.getLeftExpression().accept(this, param);
        /* Promotes left expression type to type of arithmetics (Expression) if needed */
        cg.promote(arithmetic.getLeftExpression().getType(), arithmetic.getType());
        arithmetic.getRightExpression().accept(this, param);
        /* Promotes right expression type to type of arithmetic (Expression) if needed */
        cg.promote(arithmetic.getRightExpression().getType(), arithmetic.getType());

        cg.arithmeticOperation(arithmetic.getOperator(), arithmetic.getType());
        return null;
    }

    @Override
    public Void visit(Logical logical, Void param) {
        logical.getLeftExpression().accept(this, param);
        logical.getRightExpression().accept(this, param);

        cg.logicalOperation(logical.getOperator());
        return null;
    }

    @Override
    public Void visit(Relational relational, Void param) {
        relational.getLeftExpression().accept(this, param);
        relational.getRightExpression().accept(this, param);

        cg.relationalOperation(relational.getOperator(), relational.getType());
        return null;
    }

    @Override
    public Void visit(Cast cast, Void param) {
        cast.getExpression().accept(this, param);
        cg.convertTo(cast.getExpression().getType(), cast.getCastType());
        return null;
    }

    @Override
    public Void visit(ArrayAccess arrayAccess, Void param) {
        cg.writeComment("Indexing");
        arrayAccess.accept(addressVisitor, param);
        cg.load(arrayAccess.getType());
        return null;
    }

    @Override
    public Void visit(StructAccess structAccess, Void param) {
        cg.writeComment("Field Access");
        structAccess.accept(addressVisitor, param);
        cg.load(structAccess.getType());
        return null;
    }
    @Override
    public Void visit(Variable variable, Void param) {
        variable.accept(addressVisitor, param);
        cg.load(variable.getType());
        return null;
    }

    @Override
    public Void visit(FunctionInvocation functionInvocation, Void param) {
        functionInvocation.getParameters().forEach(parameter -> parameter.accept(this, param));
        cg.call(functionInvocation.getVariable().getName());
        return null;
    }

    @Override
    public Void visit(UnaryNegative ast, Void param) {
        ast.getExpression().accept(this, param);
        cg.not();
        return null;
    }

    @Override
    public Void visit(UnaryMinus ast, Void param) {
        ast.getExpression().accept(this, param);
        cg.minus();
        return null;
    }

    @Override
    public Void visit(CharLiteral charLiteral, Void param) {
        cg.push(charLiteral.getType(), String.valueOf( ((int) charLiteral.getValue()) ) );
        return null;
    }

    @Override
    public Void visit(IntLiteral intLiteral, Void param) {
        cg.push(intLiteral.getType(), String.valueOf(intLiteral.getValue()));
        return null;
    }

    @Override
    public Void visit(DoubleLiteral doubleLiteral, Void param) {
        cg.push(doubleLiteral.getType(), String.valueOf(doubleLiteral.getValue()));
        return null;
    }


    @Override
    public Void visit(BoolLiteral boolLiteral, Void param) {
        cg.push(boolLiteral.getType(), String.valueOf(boolLiteral.getValue()));
        return super.visit(boolLiteral, param);
    }
}
