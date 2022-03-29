package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definitions.sub.FunctionDefinition;
import es.uniovi.dlp.ast.definitions.sub.VariableDefinition;
import es.uniovi.dlp.ast.expressions.sub.*;
import es.uniovi.dlp.ast.statements.sub.*;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.ast.types.sub.*;
import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class TypeCheckingVisitor extends AbstractVisitor<Type, Type> {

    /* Definitions */

    @Override
    public Type visit(VariableDefinition variableDefinition, Type param) {
        return super.visit(variableDefinition, param);
    }

    @Override
    public Type visit(FunctionDefinition funcDefinition, Type param) {
        return super.visit(funcDefinition, param);
    }

    /* Expressions -> determine their Lvalue (true/false) */

    @Override
    public Type visit(Arithmetic arithmetic, Type param) {
        super.visit(arithmetic, param);
        arithmetic.setLvalue(false);

        arithmetic.setType( arithmetic.getLeftExpression().getType().arithmetic(arithmetic.getRightExpression().getType()) );

        if(!arithmetic.getType().isArithmetic())
            ErrorManager.getInstance().addError( new Error(arithmetic, ErrorReason.INVALID_ARITHMETIC) );

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

        cast.setType( cast.getCastType().cast(cast.getExpression().getType()) );
        if( cast.getType() instanceof ErrorType )
            ErrorManager.getInstance().addError(new Error(cast, ErrorReason.INVALID_CAST));

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

        relational.setType( relational.getLeftExpression().getType().comparison(relational.getRightExpression().getType()) );

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

    @Override
    public Type visit(FunctionInvocation functionInvocation, Type param) {
        super.visit(functionInvocation, param);
        functionInvocation.setLvalue(false);
        return null;
    }

    /* Statements */

    @Override
    public Type visit(Assignment assignment, Type param) {
        super.visit(assignment, param);
        if(!assignment.getLeftExpression().getLvalue()) {
            ErrorManager.getInstance().addError( new Error(assignment.getLeftExpression(), ErrorReason.LVALUE_REQUIRED) );
        }
        return null;
    }

    @Override
    public Type visit(If ifStm, Type param) {
        return null;
    }

    @Override
    public Type visit(Read read, Type param) {
        super.visit(read, param);
        if(!read.getExpression().getLvalue()) {
            read.getExpression();
            ErrorManager.getInstance().addError( new Error(read.getExpression(), ErrorReason.LVALUE_REQUIRED) );
        }
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
