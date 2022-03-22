package es.uniovi.dlp.error;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ErrorManager {
    private static final ErrorManager instance = new ErrorManager();

    private static List<Error> errors;

    private ErrorManager() {
        errors = new ArrayList<>();
    }

    public static ErrorManager getInstance() {
        if(errors == null)
            errors = new ArrayList<>();
        return instance;
    }

    public void addError(Error error) {
        errors.add(error);
    }

    public void clearErrors() {
        errors.clear();
    }

    public List<Error> getErrors() {
        return errors;
    }

    public boolean hasErrors() {
        return getErrors().size() > 0;
    }
}
