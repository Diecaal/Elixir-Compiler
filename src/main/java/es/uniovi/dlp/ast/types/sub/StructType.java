package es.uniovi.dlp.ast.types.sub;

import es.uniovi.dlp.ast.types.AbstractType;

import java.util.ArrayList;
import java.util.List;

public class StructType extends AbstractType {
    private List<RecordType> records;

    public StructType(int line, int column, List<RecordType> records) {
        super(line, column);
        this.records = new ArrayList<RecordType>(records);
    }

    public List<RecordType> getRecords() {
        return records;
    }

    @Override
    public String toString() {
        String recordStr = "";
        for(RecordType record : getRecords())
            recordStr += "\n\t" + record;
        return String.format("defstruct do %s \nend", recordStr);
    }
}
