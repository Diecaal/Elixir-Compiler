package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.definitions.sub.FunctionDefinition;
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
    public Type visit(FunctionDefinition funcDefinition, Type param) {
        Type functionType = funcDefinition.getType().accept(this, param);
        /* Function return type passed to function statements to check consistency, ie: return statement match function type */
        funcDefinition.getStatements().forEach(statement -> statement.accept(this, functionType));
        return null;
    }

    /* Expressions -> determine their Lvalue (true/false) */

    @Override
    public Type visit(Arithmetic arithmetic, Type param) {
        super.visit(arithmetic, param);
        arithmetic.setLvalue(false);

        arithmetic.setType( arithmetic.getLeftExpression().getType().arithmetic(arithmetic.getRightExpression().getType(), arithmetic) );

        if(arithmetic.getType() instanceof ErrorType)
            ErrorManager.getInstance().addError( new Error(arithmetic.getOperatorLine(), arithmetic.getOperatorColumn(), ErrorReason.INVALID_ARITHMETIC) );

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

        if(logical.getType().isError())
            ErrorManager.getInstance().addError(new Error(logical.getOperatorLine(), logical.getOperatorColumn(), ErrorReason.INVALID_LOGICAL));

        return null;
    }

    @Override
    public Type visit(Relational relational, Type param) {
        super.visit(relational, param);
        relational.setLvalue(false);

        Type leftExpressionType = relational.getLeftExpression().getType();
        Type rightExpressionType = relational.getRightExpression().getType();
        relational.setType( leftExpressionType.comparison(rightExpressionType, relational) );

        if(relational.getType().isError())
            ErrorManager.getInstance().addError(new Error(relational.getOperatorLine(), relational.getOperatorColumn(), ErrorReason.INVALID_COMPARISON));

        return null;
    }

    @Override
    public Type visit(StructAccess structAccess, Type param) {
        super.visit(structAccess, param);
        structAccess.setLvalue(true);

        Type structType = structAccess.getStruct().getType();
        structAccess.setType(structType.dot(structAccess.getField(), structAccess));

        if(structAccess.getType().isError()) {
            if(!structType.allowDot())
                ErrorManager.getInstance().addError(new Error(structAccess.getStruct(), ErrorReason.INVALID_DOT));
            else
                ErrorManager.getInstance().addError(new Error(structAccess.getStruct(), ErrorReason.NO_SUCH_FIELD));
        }

        return null;
    }

    @Override
    public Type visit(UnaryMinus unaryMinus, Type param) {
        super.visit(unaryMinus, param);
        unaryMinus.setLvalue(false);
        if(!unaryMinus.getExpression().getType().isArithmetic()) {
            unaryMinus.setType( new ErrorType(unaryMinus.getExpression()) );
            ErrorManager.getInstance().addError(new Error(unaryMinus.getExpression(), ErrorReason.INVALID_ARITHMETIC));
        }
        else
            unaryMinus.setType( unaryMinus.getExpression().getType());
        return null;
    }

    @Override
    public Type visit(UnaryNegative unaryNegative, Type param) {
        super.visit(unaryNegative, param);
        unaryNegative.setLvalue(false);
        if(!unaryNegative.getExpression().getType().isLogical()) {
            unaryNegative.setType( new ErrorType(unaryNegative.getExpression()) );
            ErrorManager.getInstance().addError(new Error(unaryNegative.getExpression(), ErrorReason.NOT_LOGICAL));
        }
        return null;
    }

    @Override
    public Type visit(Variable variable, Type param) {
        super.visit(variable, param);
        variable.setLvalue(true);
        if(variable.getDefinition() != null) //TODO: pass from identification -> type checking with errors? (variables)
            variable.setType(variable.getDefinition().getType());
        return null;
    }

    @Override
    public Type visit(FunctionInvocation functionInvocation, Type param) {
        super.visit(functionInvocation, param);
        functionInvocation.setLvalue(false);

        Type invocationType = functionInvocation.getVariable().getType();

        if(invocationType == null) return null; //TODO: pass from identification -> type checking with errors? (variables)

        functionInvocation.setType(invocationType.invocation(functionInvocation.getParameters(), functionInvocation));

        if(functionInvocation.getType().isError()) {
            /* Error is produced due to invoking on a variable not defined as function */
            if(!invocationType.isInvocable())
                ErrorManager.getInstance().addError(new Error(functionInvocation, ErrorReason.INVALID_INVOCATION));
            else {
                /* Error is produced due to mismatch number of arguments */
                if( ((FunctionType)invocationType).getParameters().size() != functionInvocation.getParameters().size() )
                    ErrorManager.getInstance().addError(new Error(functionInvocation, ErrorReason.INVALID_ARGS));

                /* Error is produced due to incompatibility of some argument with function signature */
                functionInvocation.getParameters().forEach(parameter -> {
                    if(parameter.getType().isError())
                        ErrorManager.getInstance().addError(new Error(functionInvocation, ErrorReason.INVALID_ARGS));
                });
            }
        }
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

        if(leftType == null) return null; //TODO: pass from identification -> type checking with errors? (variables)

        /* If an error is already detected in right or left part, we stop evaluation */
        if(rightType.isError() || leftType.isError())
            return null;

        Type assignmentType = leftType.assignment(rightType, assignment);
        assignment.getLeftExpression().accept(this, assignmentType);


        if(leftType.assignment(rightType, assignment).isError())
            ErrorManager.getInstance().addError(new Error(assignment, ErrorReason.INCOMPATIBLE_TYPES));

        return null;
    }

    @Override
    public Type visit(If ifStm, Type param) {
        super.visit(ifStm, param);
        if(!ifStm.getCondition().getType().isLogical() && !ifStm.getCondition().getType().isError()) {
            ifStm.getCondition().setType(new ErrorType(ifStm.getCondition().getLine(), ifStm.getCondition().getColumn()));
            ErrorManager.getInstance().addError(new Error(ifStm.getCondition(), ErrorReason.NOT_LOGICAL));
        }
        return null;
    }

    @Override
    public Type visit(While whileStm, Type param) {
        super.visit(whileStm, param);
        if(!whileStm.getCondition().getType().isLogical() && !whileStm.getCondition().getType().isError()) {
            whileStm.getCondition().setType(new ErrorType(whileStm.getCondition().getLine(), whileStm.getCondition().getColumn()));
            ErrorManager.getInstance().addError(new Error(whileStm.getCondition(), ErrorReason.NOT_LOGICAL));
        }
        return null;
    }

    @Override
    public Type visit(Read read, Type param) {
        super.visit(read, param);
        if(!read.getExpression().getLvalue()) {
            ErrorManager.getInstance().addError( new Error(read.getExpression(), ErrorReason.LVALUE_REQUIRED) );
        }
        return null;
    }

    @Override
    public Type visit(Return returnStm, Type param) {
        super.visit(returnStm, param);
        /* Param: type coming from function return type SIGNATURE */
        if(returnStm.getExpression().getType().typesMatch(param, returnStm).isError()) {
            ErrorManager.getInstance().addError(new Error(returnStm.getExpression(), ErrorReason.INVALID_RETURN_TYPE));
        }
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
        functionType.getParameters().forEach(funcParam -> funcParam.accept(this, param));
        /* Returned so funcDefinition can access to it */
        return functionType.getReturnType();
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
