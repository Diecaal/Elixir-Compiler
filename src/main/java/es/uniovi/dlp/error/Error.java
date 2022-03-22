package es.uniovi.dlp.error;

import es.uniovi.dlp.ast.ASTNode;

public record Error(Location location, ErrorReason reason, String extraMessage) implements Comparable<Error> {
    public Error(Location location, ErrorReason reason) {
        this(location, reason, "");
    }

    public Error(ASTNode node, ErrorReason reason) {
        this(new Location(node.getLine(), node.getColumn()), reason, "");
    }

    public Error(int line, int column, ErrorReason reason) {
        this(new Location(line, column), reason, "");
    }

    @Override
    public int compareTo(Error error) {
        return location.compareTo(error.location);
    }

    @Override
    public String toString() {
        return "An error exists at " + location
                + ". Cause of the error: " + reason.getMessage() + ". "
                + extraMessage;
    }
}
