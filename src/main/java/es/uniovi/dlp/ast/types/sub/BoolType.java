package es.uniovi.dlp.ast.types.sub;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.types.AbstractType;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class BoolType extends AbstractType {

    public BoolType(int line, int column) {
        super(line, column);
    }

    @Override
    public boolean isLogical() {
        return true;
    }

    @Override
    public Type logical(Type otherType, ASTNode ast) {
        if(otherType.isLogical())
            return this;
        return super.logical(otherType, ast);
    }

    @Override
    public Type assignment(Type otherType, ASTNode ast) {
        if(otherType instanceof BoolType)
            return this;
        return super.assignment(otherType, ast);
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }
}
