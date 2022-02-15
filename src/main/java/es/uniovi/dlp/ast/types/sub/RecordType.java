package es.uniovi.dlp.ast.types.sub;

import es.uniovi.dlp.ast.types.AbstractType;
import es.uniovi.dlp.ast.types.Type;

public class RecordType extends AbstractType {
    private Type type;
    private String name;

    public RecordType(int line, int column, Type type, String name) {
        super(line, column);
        this.type = type;
        this.name = name;
    }
}
