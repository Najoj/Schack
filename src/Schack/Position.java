package Schack;

public class Position {
    private final int row;
    private final char column;

    Position(int row, char column) {
        column = Character.toUpperCase(column);

        if (row < 0 || row > 8) {
            System.err.println("Illegal row: " + row);
        }
        if (column < 'A' || row > 'H') {
            System.err.println("Illegal column: " + column);
        }
        this.row = row;
        this.column = column;
    }

    public char getColumn() {
        return this.column;
    }

    public int getRow() {
        return this.row;
    }
}
