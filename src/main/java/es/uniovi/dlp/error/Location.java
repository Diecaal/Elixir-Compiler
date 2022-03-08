package es.uniovi.dlp.error;

public record Location(int line, int column) implements Comparable<Location>  {
    @Override
    public int compareTo(Location location) {
        return this.compareTo(location);
    }

    @Override
    public String toString() {
        return "line: " + line + ", column: " + column;
    }
}
