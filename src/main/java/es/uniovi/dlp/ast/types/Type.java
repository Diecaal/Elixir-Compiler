package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.ASTNode;

public interface Type extends ASTNode {
    Type arithmetic(Type otherType, ASTNode ast);
    Type logical(Type otherType, ASTNode ast);
    Type indexing(Type indexType, ASTNode ast);
    Type dot(String field, ASTNode ast);
    Type cast(Type toCast, ASTNode ast);
    Type comparison(Type otherType, ASTNode ast);
    Type assignment(Type rightType, ASTNode ast);

    boolean promotableTo(Type to);
    boolean isLogical();
    boolean isIndexable();
    boolean isArithmetic();
    boolean allowDot();
    boolean isError();

    int getNumberBytes();
}
