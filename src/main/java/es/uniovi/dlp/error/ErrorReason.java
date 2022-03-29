package es.uniovi.dlp.error;

public enum ErrorReason {
    FIELD_ALREADY_DECLARED("Field already declared in struct"),
    LVALUE_REQUIRED("Field can not be assigned a value"),
    FUNCTION_NOT_DECLARED("Function has not been declared"),
    VARIABLE_NOT_DECLARED("Variable has not been declared"),
    FUNCTION_ALREADY_DECLARED("Function has been already declared in scope"),
    VARIABLE_ALREADY_DECLARED("Variable has been already declared in scope"),
    INVALID_INDEX_EXPRESSION(""),
    INVALID_INDEXING(""),
    INVALID_CAST(""),
    INVALID_ARITHMETIC(""),
    NOT_LOGICAL(""),
    INVALID_LOGICAL(""),
    INVALID_COMPARISON(""),
    NO_SUCH_FIELD(""),
    INVALID_DOT(""),
    INCOMPATIBLE_TYPES(""),
    INVALID_RETURN_TYPE(""),
    INVALID_ARGS(""),
    INVALID_INVOCATION("");

    private final String message;

    ErrorReason(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
