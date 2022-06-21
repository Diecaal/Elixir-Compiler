package es.uniovi.dlp.ast.types.sub;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.definitions.sub.VariableDefinition;
import es.uniovi.dlp.ast.types.AbstractType;
import es.uniovi.dlp.ast.types.Type;
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
                ErrorManager.getInstance().addError( new Error(record, ErrorReason.FIELD_ALREADY_DECLARED) );
            }
        }
    }

    public RecordType findRecordByName(String name) {
        return records.stream().filter(record -> record.getName().equals(name)).findFirst().orElse(null);
    }

    @Override
    public Type dot(String field, ASTNode ast) {
        for(RecordType record : getRecords()) {
            if(record.getName().equals(field))
                return record.getType();
        }

        return super.dot(field, ast);
    }

    @Override
    public boolean allowDot() {
        return true;
    }

    @Override
    public String toString() {
        String struct = "record(";
        if(!getRecords().isEmpty()) {
            struct += String.format("(%s x %s)", getRecords().get(0).getName(), getRecords().get(0).getType());
        }
        for(int i = 1; i < getRecords().size(); i++) {
            struct += String.format(" x (%s x %s)", getRecords().get(i).getName(), getRecords().get(i).getType());
        }
        struct += ")";
        return struct;
    }

    @Override
    public int getNumberBytes() {
        int numBytes = 0;
        for(RecordType record : getRecords())
            numBytes += record.getNumberBytes();
        return numBytes;
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }
}
