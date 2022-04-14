package es.uniovi.dlp.visitor.semantic;

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

        arithmetic.setType( arithmetic.getLeftExpression().getType().arithmetic(arithmetic.getRightExpression().getType(), arithmetic) );

        if(arithmetic.getType() instanceof ErrorType)
            ErrorManager.getInstance().addError( new Error(arithmetic.getRightExpression(), ErrorReason.INVALID_ARITHMETIC) );

        return null;
    }

    @Override
    public Type visit(ArrayAccess arrayAccess, Type param) {
        super.visit(arrayAccess, param);
        arrayAccess.setLvalue(true);

        Type arrayType = arrayAccess.getArray().getType();
        Type indexingType = arrayAccess.getIndex().getType();
        arrayAccess.setType( arrayType.indexing(indexingType,arrayAccess) );

        if(arrayAccess.getType().isError()) {
            Type err = arrayAccess.getType();
            if(!arrayAccess.getIndex().getType().isIndexable())
                ErrorManager.getInstance().addError(new Error(arrayAccess.getIndex().getLine(), arrayAccess.getIndex().getColumn(), ErrorReason.INVALID_INDEX_EXPRESSION));
            else
                ErrorManager.getInstance().addError(new Error(err.getLine(), err.getColumn(), ErrorReason.INVALID_INDEXING));
        }

        return null;
    }

    @Override
    public Type visit(Cast cast, Type param) {
        super.visit(cast, param);
        cast.setLvalue(false);

        Type fromCastType = cast.getExpression().getType();
        Type toCastType = cast.getCastType();
        cast.setType(fromCastType.cast(toCastType, cast));

        if(cast.getType().isError()) {
            Type err = cast.getType();
            ErrorManager.getInstance().addError(new Error(err.getLine(), err.getColumn(), ErrorReason.INVALID_CAST));
        }

        return null;
    }

    @Override
    public Type visit(CharLiteral charLiteral, Type param) {
        super.visit(charLiteral, param);
        charLiteral.setLvalue(false);
        charLiteral.setType( new CharType(charLiteral.getLine(), charLiteral.getColumn()));
        return null;
    }

    @Override
    public Type visit(DoubleLiteral doubleLiteral, Type param) {
        super.visit(doubleLiteral, param);
        doubleLiteral.setLvalue(false);
        doubleLiteral.setType( new DoubleType(doubleLiteral.getLine(), doubleLiteral.getColumn()));
        return null;
    }

    @Override
    public Type visit(IntLiteral intLiteral, Type param) {
        super.visit(intLiteral, param);
        intLiteral.setLvalue(false);
        intLiteral.setType( new IntType(intLiteral.getLine(), intLiteral.getColumn()));
        return null;
    }

    @Override
    public Type visit(Logical logical, Type param) {
        super.visit(logical, param);
        logical.setLvalue(false);

        Type left = logical.getLeftExpression().getType();
        Type right = logical.getRightExpression().getType();
        logical.setType(left.logical(right, logical));

        if(logical.getType().isError()) {
            Type err = logical.getType();
            if(!logical.getLeftExpression().getType().isLogical() || !logical.getRightExpression().getType().isLogical())
                ErrorManager.getInstance().addError(new Error(err.getLine(), err.getColumn(), ErrorReason.NOT_LOGICAL));
            else
                ErrorManager.getInstance().addError(new Error(err.getLine(), err.getColumn(), ErrorReason.INVALID_LOGICAL));
        }
        return null;
    }

    @Override
    public Type visit(Relational relational, Type param) {
        super.visit(relational, param);
        relational.setLvalue(false);

        relational.setType( relational.getLeftExpression().getType().comparison(relational.getRightExpression().getType(), relational) );

        return null;
    }

    @Override
    public Type visit(StructAccess structAccess, Type param) {
        super.visit(structAccess, param);
        structAccess.setLvalue(true);

        structAccess.setType(structAccess.getStruct().getType().dot(structAccess.getField(), structAccess));

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
        variable.setType(variable.getDefinition().getType());
        //System.out.println(String.format("assigned %s -> %s", variable.getName(), variable.getType()));
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
        if(!assignment.getLeftExpression().getLvalue())
            ErrorManager.getInstance().addError( new Error(assignment.getLeftExpression(), ErrorReason.LVALUE_REQUIRED) );

        Type leftType = assignment.getLeftExpression().getType();
        Type rightType = assignment.getRightExpression().getType();

        return null;
    }

    @Override
    public Type visit(If ifStm, Type param) {
        super.visit(ifStm, param);
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
        super.visit(returnStm, param);
        return null;
    }

    @Override
    public Type visit(While whileStm, Type param) {
        return null;
    }

    @Override
    public Type visit(Write write, Type param) {
        super.visit(write, param);
        return null;
    }

    /* Types */

    @Override
    public Type visit(ArrayType arrayType, Type param) {
        super.visit(arrayType, param);
        return null;
    }

    @Override
    public Type visit(CharType charType, Type param) {
        super.visit(charType, param);
        return null;
    }

    @Override
    public Type visit(DoubleType doubleType, Type param) {
        super.visit(doubleType, param);
        return null;
    }

    @Override
    public Type visit(FunctionType functionType, Type param) {
        super.visit(functionType, param);
        return null;
    }

    @Override
    public Type visit(IntType intType, Type param) {
        super.visit(intType, param);
        return null;
    }

    @Override
    public Type visit(RecordType recordType, Type param) {
        super.visit(recordType, param);
        return null;
    }

    @Override
    public Type visit(StructType structType, Type param) {
        super.visit(structType, param);
        return null;
    }

    @Override
    public Type visit(VoidType voidType, Type param) {
        super.visit(voidType, param);
        return null;
    }
}
