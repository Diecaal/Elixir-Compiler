package es.uniovi.dlp.ast.definitions;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public interface Definition extends ASTNode {
    Type getType();
    String getName();
}
