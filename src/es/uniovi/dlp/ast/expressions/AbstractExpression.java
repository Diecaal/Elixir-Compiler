package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.AbstractASTNode;

public abstract class AbstractExpression extends AbstractASTNode {

    public AbstractExpression(int line, int column) {
        super(line, column);
    }
}
