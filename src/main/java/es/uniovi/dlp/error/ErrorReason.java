package es.uniovi.dlp.error;

public enum ErrorReason {
    FIELD_ALREADY_DECLARED("Field already declared in struct"),
    LVALUE_REQUIRED("Field can not be assigned a value")
    ;

    private final String message;

    ErrorReason(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
