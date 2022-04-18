package es.uniovi.dlp.ast.types.sub;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.types.AbstractType;
import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class ErrorType extends AbstractType {
    private ErrorReason errorReason;

    public ErrorType(int line, int column) {
        super(line, column);
    }

    public ErrorType(int line, int column, ErrorReason errorReason) {
        super(line, column);
        this.errorReason = errorReason;
    }

    public ErrorType(ASTNode ast) {
        super(ast.getLine(), ast.getColumn());
    }

    public ErrorReason getErrorReason() {
        return errorReason;
    }

    @Override
    public boolean isError() {
        return true;
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }
}
