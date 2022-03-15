package es.uniovi.dlp.ast.types.sub;

import es.uniovi.dlp.ast.types.AbstractType;
import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.visitor.AbstractVisitor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class StructType extends AbstractType {
    private List<RecordType> records;

    public StructType(int line, int column, List<RecordType> records) {
        super(line, column);
        checkRepeatedRecords(records);
        this.records = new ArrayList<RecordType>(records);
    }

    public List<RecordType> getRecords() {
        return records;
    }

    private void checkRepeatedRecords(List<RecordType> records) {
        HashSet<String> uniqueRecords = new HashSet<>();
        for(RecordType record : records) {
            if(!uniqueRecords.add(record.getName())){
                ErrorManager.getInstance().addError( new Error(getLine(), getColumn(), ErrorReason.FIELD_ALREADY_DECLARED) );
            }
        }
    }

    @Override
    public String toString() {
        String recordStr = "";
        for(RecordType record : getRecords())
            recordStr += "\n\t" + record;
        return String.format("defstruct do %s \nend", recordStr);
    }


    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }
}
