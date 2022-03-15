package es.uniovi.dlp.visitor;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definitions.sub.FunctionDefinition;
import es.uniovi.dlp.ast.definitions.sub.VariableDefinition;
import es.uniovi.dlp.ast.expressions.sub.*;
import es.uniovi.dlp.ast.statements.sub.*;
import es.uniovi.dlp.ast.types.sub.*;

/**
 * Motivation: stores information about how to iterate through AST node
 * @param <ReturnType>
 * @param <ParamType>
 */
public abstract class AbstractVisitor<ReturnType, ParamType> implements Visitor<ReturnType, ParamType> {

    @Override
    public ReturnType visit(Program program, ParamType param) {
        program.getDefinitions().forEach(definition -> definition.accept(this, param));
        return null;
    }

    @Override
    public ReturnType visit(FunctionDefinition funcDefinition, ParamType param) {
        funcDefinition.getType().accept(this, param);
        funcDefinition.getVariableDefinitions().forEach(varDef -> varDef.accept(this, param));
        funcDefinition.getStatements().forEach(statement -> statement.accept(this, param));
        return null;
    }

    @Override
    public ReturnType visit(VariableDefinition variableDefinition, ParamType param) {
        variableDefinition.getType().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(Arithmetic arithmetic, ParamType param) {
        arithmetic.getLeftExpression().accept(this, param);
        arithmetic.getRightExpression().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(ArrayAccess arrayAccess, ParamType param) {
        arrayAccess.getArray().accept(this, param);
        arrayAccess.getIndex().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(Cast cast, ParamType param) {
        cast.getCastType().accept(this, param);
        cast.getExpression().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(CharLiteral charLiteral, ParamType param) {
        /* No information to be given to visitor */
        return null;
    }

    @Override
    public ReturnType visit(DoubleLiteral doubleLiteral, ParamType param) {
        /* No information to be given to visitor */
        return null;
    }

    @Override
    public ReturnType visit(IntLiteral intLiteral, ParamType param) {
        /* No information to be given to visitor */
        return null;
    }

    @Override
    public ReturnType visit(Logical logical, ParamType param) {
        logical.getLeftExpression().accept(this, param);
        logical.getRightExpression().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(Relational relational, ParamType param) {
        relational.getLeftExpression().accept(this, param);
        relational.getRightExpression().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(StructAccess structAccess, ParamType param) {
        structAccess.getStruct().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(UnaryMinus unaryMinus, ParamType param) {
        unaryMinus.getExpression().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(UnaryNegative unaryNegative, ParamType param) {
        unaryNegative.getExpression().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(Variable variable, ParamType param) {
        /* No information to be given to visitor */
        return null;
    }

    @Override
    public ReturnType visit(Assignment assignment, ParamType param) {
        assignment.getLeftExpression().accept(this, param);
        assignment.getRightExpression().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(FunctionInvocation functionInvocation, ParamType param) {
        functionInvocation.getParameters().forEach(funcParam -> funcParam.accept(this, param));
        functionInvocation.getVariable().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(If ifStm, ParamType param) {
        ifStm.getCondition().accept(this, param);
        ifStm.getIfBody().forEach(statement -> statement.accept(this, param));
        if( ifStm.hasElse() ) {
            ifStm.getElseBody().forEach(statement -> statement.accept(this, param));
        }
        return null;
    }

    @Override
    public ReturnType visit(Read read, ParamType param) {
        read.getExpression().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(Return returnStm, ParamType param) {
        returnStm.getExpression().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(While whileStm, ParamType param) {
        whileStm.getCondition().accept(this, param);
        whileStm.getBody().forEach(statement -> statement.accept(this, param));
        return null;
    }

    @Override
    public ReturnType visit(Write write, ParamType param) {
        write.getExpression().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(ArrayType arrayType, ParamType param) {
        arrayType.getArrayType().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(CharType charType, ParamType param) {
        /* No information to be given to visitor */
        return null;
    }

    @Override
    public ReturnType visit(DoubleType doubleType, ParamType param) {
        /* No information to be given to visitor */
        return null;
    }

    @Override
    public ReturnType visit(FunctionType functionType, ParamType param) {
        functionType.getParameters().forEach(funcParam -> funcParam.accept(this, param));
        functionType.getReturnType().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(IntType intType, ParamType param) {
        /* No information to be given to visitor */
        return null;
    }

    @Override
    public ReturnType visit(RecordType recordType, ParamType param) {
        recordType.getType().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(StructType structType, ParamType param) {
        structType.getRecords().forEach(recordType -> recordType.accept(this, param));
        return null;
    }

    @Override
    public ReturnType visit(VoidType voidType, ParamType param) {
        /* No information to be given to visitor */
        return null;
    }
}
