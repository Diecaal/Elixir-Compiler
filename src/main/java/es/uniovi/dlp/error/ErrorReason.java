package es.uniovi.dlp.error;

public enum ErrorReason {
    FIELD_ALREADY_DECLARED("Field already declared in struct"),
    LVALUE_REQUIRED("Field can not be assigned a value"),
    FUNCTION_NOT_DECLARED("Function has not been declared"),
    VARIABLE_NOT_DECLARED("Variable has not been declared"),
    FUNCTION_ALREADY_DECLARED("Function has been already declared in scope"),
    VARIABLE_ALREADY_DECLARED("Variable has been already declared in scope"),
    ;

    private final String message;

    ErrorReason(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
