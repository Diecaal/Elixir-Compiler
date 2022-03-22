package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definitions.sub.FunctionDefinition;
import es.uniovi.dlp.ast.definitions.sub.VariableDefinition;
import es.uniovi.dlp.ast.expressions.sub.*;
import es.uniovi.dlp.ast.statements.sub.*;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.ast.types.sub.*;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class TypeCheckingVisitor extends AbstractVisitor<Type, Type> {

    @Override
    public Type visit(Program program, Type param) {
        return super.visit(program, param);
    }

    /* Definitions */

    @Override
    public Type visit(VariableDefinition variableDefinition, Type param) {
        super.visit(variableDefinition, param);
        return null;
    }

    @Override
    public Type visit(FunctionDefinition funcDefinition, Type param) {
        return super.visit(funcDefinition, param);
    }

    /* Expressions */

    @Override
    public Type visit(Arithmetic arithmetic, Type param) {
        super.visit(arithmetic, param);
        arithmetic.setLvalue(false);
        return null;
    }

    @Override
    public Type visit(ArrayAccess arrayAccess, Type param) {
        super.visit(arrayAccess, param);
        arrayAccess.setLvalue(true);
        return null;
    }

    @Override
    public Type visit(Cast cast, Type param) {
        super.visit(cast, param);
        cast.setLvalue(false);
        return null;
    }

    @Override
    public Type visit(CharLiteral charLiteral, Type param) {
        super.visit(charLiteral, param);
        charLiteral.setLvalue(false);
        return null;
    }

    @Override
    public Type visit(DoubleLiteral doubleLiteral, Type param) {
        super.visit(doubleLiteral, param);
        doubleLiteral.setLvalue(false);
        return null;
    }

    @Override
    public Type visit(IntLiteral intLiteral, Type param) {
        super.visit(intLiteral, param);
        intLiteral.setLvalue(false);
        return null;
    }

    @Override
    public Type visit(Logical logical, Type param) {
        super.visit(logical, param);
        logical.setLvalue(false);
        return null;
    }

    @Override
    public Type visit(Relational relational, Type param) {
        super.visit(relational, param);
        relational.setLvalue(false);
        return null;
    }

    @Override
    public Type visit(StructAccess structAccess, Type param) {
        super.visit(structAccess, param);
        structAccess.setLvalue(true);
        return null;
    }

    @Override
    public Type visit(UnaryMinus unaryMinus, Type param) {
        super.visit(unaryMinus, param);
        unaryMinus.setLvalue(false);
        return null;
    }

    @Override
    public Type visit(UnaryNegative unaryNegative, Type param) {
        super.visit(unaryNegative, param);
        unaryNegative.setLvalue(false);
        return null;
    }

    @Override
    public Type visit(Variable variable, Type param) {
        super.visit(variable, param);
        variable.setLvalue(true);
        return null;
    }

    /* Statements */

    @Override
    public Type visit(Assignment assignment, Type param) {
        super.visit(assignment, param);
        return null;
    }

    @Override
    public Type visit(FunctionInvocation functionInvocation, Type param) {
        super.visit(functionInvocation, param);
        functionInvocation.setLvalue(false);
        return null;
    }

    @Override
    public Type visit(If ifStm, Type param) {
        return null;
    }

    @Override
    public Type visit(Read read, Type param) {
        return null;
    }

    @Override
    public Type visit(Return returnStm, Type param) {
        return null;
    }

    @Override
    public Type visit(While whileStm, Type param) {
        return null;
    }

    @Override
    public Type visit(Write write, Type param) {
        return null;
    }

    /* Types */

    @Override
    public Type visit(ArrayType arrayType, Type param) {
        return null;
    }

    @Override
    public Type visit(CharType charType, Type param) {
        return null;
    }

    @Override
    public Type visit(DoubleType doubleType, Type param) {
        return null;
    }

    @Override
    public Type visit(FunctionType functionType, Type param) {
        return null;
    }

    @Override
    public Type visit(IntType intType, Type param) {
        return null;
    }

    @Override
    public Type visit(RecordType recordType, Type param) {
        return null;
    }

    @Override
    public Type visit(StructType structType, Type param) {
        return null;
    }

    @Override
    public Type visit(VoidType voidType, Type param) {
        return null;
    }
}