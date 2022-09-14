package Schack;

public class Square {
    final Position position;
    final Piece piece;
    final Colour colour;

    public Square(Position position) {
        this.position = position;
        this.piece = null;
        this.colour = this.positionToColour();
    }
    public Square(Position position, Piece piece) {
        this.position = position;
        this.piece = piece;
        this.colour = this.positionToColour();
    }

    private Colour positionToColour() {
        int row = this.position.getRow();
        int column = (int)this.position.getColumn() - (int) 'A';

        if (row % 2 == 0) {
            if (column % 2 == 0) {
                return Colour.White;
            } else {
                return Colour.Black;
            }
        } else {
            if (column % 2 == 0) {
                return Colour.Black;
            } else {
                return Colour.White;
            }
        }
    }

    @Override
    public String toString() {
        String piece;
        if(this.piece == null) {
            piece = " ";
        } else {
            piece = this.piece.toString();
        }
        return "[" + piece + "]";
    }
}
