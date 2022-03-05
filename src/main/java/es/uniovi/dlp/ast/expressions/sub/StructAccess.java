package es.uniovi.dlp.ast.expressions.sub;

import es.uniovi.dlp.ast.expressions.AbstractExpression;
import es.uniovi.dlp.ast.expressions.Expression;

public class StructAccess extends AbstractExpression {
    private Expression struct;
    private String field;

    public StructAccess(int line, int column, Expression struct, String field) {
        super(line, column);
        this.struct = struct;
        this.field = field;
    }

    @Override
    public String toString() {
        return struct.toString() + "." + field;
    }
}
