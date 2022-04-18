package es.uniovi.dlp.error;

public enum ErrorReason {
    FIELD_ALREADY_DECLARED("Field already declared in struct"),
    LVALUE_REQUIRED("Field can not be assigned a value"),
    FUNCTION_NOT_DECLARED("Function has not been declared"),
    VARIABLE_NOT_DECLARED("Variable has not been declared"),
    FUNCTION_ALREADY_DECLARED("Function has been already declared in scope"),
    VARIABLE_ALREADY_DECLARED("Variable has been already declared in scope"),
    INVALID_INDEX_EXPRESSION("Given index is not valid for indexing"),
    INVALID_INDEXING("Only array types can be indexed"),
    INVALID_CAST("Cast operation can no be applied here"),
    INVALID_ARITHMETIC("Arithmetic can not be applied"),
    NOT_LOGICAL("Given expression is not logical"),
    INVALID_LOGICAL("Logical operator can not be applied here"),
    INVALID_COMPARISON("Comparison operator can not be applied here"),
    NO_SUCH_FIELD("Field does not exist in accessed structure"),
    INVALID_DOT("Can not perform record access"),
    INCOMPATIBLE_TYPES("Types to be assigned are not compatible"),
    INVALID_RETURN_TYPE("Return type does not match function type definition"),
    INVALID_ARGS("Incorrect number of arguments for function"),
    INVALID_INVOCATION("Trying to invoke not a function");

    private final String message;

    ErrorReason(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
