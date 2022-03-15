package es.uniovi.dlp.ast.expressions.sub;

import es.uniovi.dlp.ast.expressions.AbstractExpression;
import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class StructAccess extends AbstractExpression {
    private Expression struct;
    private String field;

    public StructAccess(int line, int column, Expression struct, String field) {
        super(line, column);
        this.struct = struct;
        this.field = field;
    }

    public Expression getStruct() {
        return struct;
    }

    public String getField() {
        return field;
    }

    @Override
    public String toString() {
        return struct.toString() + "." + field;
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }
}
