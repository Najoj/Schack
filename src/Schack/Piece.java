package Schack;

public class Piece {
    private final Type type;
    private final Colour colour;

    public Piece(Type t, Colour c) {
        this.type = t;
        this.colour = c;
    }

    @Override
    public String toString() {
        String character = " ";
        if(this.colour == Colour.Black) {
            if (this.type == Type.King)
                character = "♚";
            else if (this.type == Type.Queen)
                character = "♛";
            else if (this.type == Type.Rook)
                character = "♜";
            else if (this.type == Type.Bishop)
                character = "♝";
            else if (this.type == Type.Knight)
                character = "♞";
            else if (this.type == Type.Pawn)
                character = "♟";
        } else {
            if (this.type == Type.King)
                character = "♔";
            else if (this.type == Type.Queen)
                character = "♕";
            else if (this.type == Type.Rook)
                character = "♖";
            else if (this.type == Type.Bishop)
                character = "♗";
            else if (this.type == Type.Knight)
                character = "♘";
            else if (this.type == Type.Pawn)
                character = "♙";
        }
        return character;
    }
}