package es.uniovi.dlp.visitor;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definitions.sub.FunctionDefinition;
import es.uniovi.dlp.ast.definitions.sub.VariableDefinition;
import es.uniovi.dlp.ast.expressions.sub.*;
import es.uniovi.dlp.ast.statements.sub.*;
import es.uniovi.dlp.ast.types.sub.*;

public interface Visitor<ReturnType, ParamType> {
    ReturnType visit(Program program, ParamType param);

    /* Definitions */
    ReturnType visit(FunctionDefinition program, ParamType param);
    ReturnType visit(VariableDefinition program, ParamType param);

    /* Expressions */
    ReturnType visit(Arithmetic arithmetic, ParamType param);
    ReturnType visit(ArrayAccess arrayAccess, ParamType param);
    ReturnType visit(Cast cast, ParamType param);
    ReturnType visit(CharLiteral charLiteral, ParamType param);
    ReturnType visit(DoubleLiteral doubleLiteral, ParamType param);
    ReturnType visit(IntLiteral intLiteral, ParamType param);
    ReturnType visit(Logical logical, ParamType param);
    ReturnType visit(Relational relational, ParamType param);
    ReturnType visit(StructAccess structAccess, ParamType param);
    ReturnType visit(UnaryMinus unaryMinus, ParamType param);
    ReturnType visit(UnaryNegative unaryNegative, ParamType param);
    ReturnType visit(Variable variable, ParamType param);

    /* Statements */
    ReturnType visit(Assignment assignment, ParamType param);
    ReturnType visit(FunctionInvocation functionInvocation, ParamType param);
    ReturnType visit(If ifStm, ParamType param);
    ReturnType visit(Read read, ParamType param);
    ReturnType visit(Return returnStm, ParamType param);
    ReturnType visit(While whileStm, ParamType param);
    ReturnType visit(Write write, ParamType param);

    /* Types */
    ReturnType visit(ArrayType arrayType, ParamType param);
    ReturnType visit(CharType charType, ParamType param);
    ReturnType visit(DoubleType doubleType, ParamType param);
    ReturnType visit(FunctionType functionType, ParamType param);
    ReturnType visit(IntType intType, ParamType param);
    ReturnType visit(RecordType recordType, ParamType param);
    ReturnType visit(StructType structType, ParamType param);
    ReturnType visit(VoidType voidType, ParamType param);
    ReturnType visit(ErrorType errorType, ParamType param);
}
