package es.uniovi.dlp.error;

public record Location(int line, int column) implements Comparable<Location>  {
    @Override
    public int compareTo(Location location) {
        int comparison = 0;
        comparison = this.line > location.line ? 1 : -1;
        if(comparison == 0) comparison = this.column > location.column ? 1 : -1;
        return comparison;
    }

    @Override
    public String toString() {
        return "line: " + line + ", column: " + column;
    }
}
