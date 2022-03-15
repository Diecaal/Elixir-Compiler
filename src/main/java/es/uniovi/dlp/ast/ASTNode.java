package es.uniovi.dlp.ast;

import es.uniovi.dlp.visitor.AbstractVisitor;

public interface ASTNode {
    int getLine();
    int getColumn();

    <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param);
}
