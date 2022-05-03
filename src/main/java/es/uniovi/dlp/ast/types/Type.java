package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.expressions.Expression;

import java.util.List;

public interface Type extends ASTNode {
    Type arithmetic(Type otherType, ASTNode ast);
    Type logical(Type otherType, ASTNode ast);
    Type indexing(Type indexType, ASTNode ast);
    Type dot(String field, ASTNode ast);
    Type cast(Type toCast, ASTNode ast);
    Type comparison(Type otherType, ASTNode ast);
    Type assignment(Type rightType, ASTNode ast);
    Type invocation(List<Expression> parameters, ASTNode ast);
//    Type typesMatch(Type otherType, ASTNode ast);

    boolean isLogical();
    boolean isIndexable();
    boolean isArithmetic();
    boolean allowDot();
    boolean isError();
    boolean isInvocable();

    int getNumberBytes();

    Type getIntermediateType(Type to);
    boolean isPromotableTo(Type to);
}
