package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.ASTNode;

public interface Type extends ASTNode {
    Type arithmetic(Type otherType);
    Type logical(Type otherType);
    Type indexing(Type indexType);
    Type dot(Type field);
    Type cast(Type toCast);
    Type comparison(Type otherType);

    boolean promotableTo(Type to);
    boolean isLogical();
    boolean isIndexable();
    boolean isArithmetic();
    boolean allowDot();

    int getNumberBytes();
}
