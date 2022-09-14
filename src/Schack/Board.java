package Schack;

public class Board {
    final Square[][] squares = new Square[8][8];

    public Board() {
        /* White pieces */
        squares[0][0] = new Square(
                new Position(8, 'A'),
                new Piece(Type.Rook, Colour.White)
        );
        squares[0][1] = new Square(
                new Position(8,'B'),
                new Piece(Type.Knight, Colour.White)
        );
        squares[0][2] = new Square(
                new Position(8,'C'),
                new Piece(Type.Bishop, Colour.White)
        );
        squares[0][3] = new Square(
                new Position(8,'E'),
                new Piece(Type.King, Colour.White)
        );
        squares[0][4] = new Square(
                new Position(8,'E'),
                new Piece(Type.Queen, Colour.White)
        );
        squares[0][5] = new Square(
                new Position(8,'F'),
                new Piece(Type.Bishop, Colour.White)
        );
        squares[0][6] = new Square(
                new Position(8,'G'),
                new Piece(Type.Knight, Colour.White)
        );
        squares[0][7] = new Square(
                new Position(8,'H'),
                new Piece(Type.Rook, Colour.White)
        );
        /* White pawns */
        for(int i = 0; i < 8; i++) {
            char col = (char) ((int)'A' + i);
            squares[1][i] = new Square(
                    new Position(8, col),
                    new Piece(Type.Rook, Colour.White)
            );

            i++;
            col = (char) ((int)'A' + i);
            squares[1][i] = new Square(
                    new Position(8, col),
                    new Piece(Type.Rook, Colour.White)
            );
        }

        /* Empty pieces */
        for(int i = 2; i < 6; i++) {
            for(int j = 0; j < 8; j++) {
                char character = (char)((int)'A' + j);
                squares[i][j] = new Square(
                        new Position(i,character)
                );
            }
        }
        /* Black pieces */
        squares[7][0] = new Square(
                new Position(8,'A'),
                new Piece(Type.Rook, Colour.Black)
        );
        squares[7][1] = new Square(
                new Position(8,'A'),
                new Piece(Type.Knight, Colour.Black)
        );
        squares[7][2] = new Square(
                new Position(8,'A'),
                new Piece(Type.Bishop, Colour.Black)
        );
        squares[7][3] = new Square(
                new Position(8,'A'),
                new Piece(Type.Queen, Colour.Black)
        );
        squares[7][4] = new Square(
                new Position(8,'A'),
                new Piece(Type.Knight, Colour.Black)
        );
        squares[7][5] = new Square(
                new Position(8,'A'),
                new Piece(Type.Bishop, Colour.Black)
        );
        squares[7][6] = new Square(
                new Position(8,'A'),
                new Piece(Type.Knight, Colour.Black)
        );
        squares[7][7] = new Square(
                new Position(8,'A'),
                new Piece(Type.Rook, Colour.Black)
        );
        /* Black pawns */
        for(int i = 0; i < 8; i++) {
            char col = (char) ((int)'A' + i);
            squares[6][i] = new Square(
                    new Position(1, col),
                    new Piece(Type.Rook, Colour.Black)
            );

            i++;
            col = (char) ((int)'A' + i);
            squares[6][i] = new Square(
                    new Position(1, col),
                    new Piece(Type.Rook, Colour.Black)
            );
        }
    }

    @Override
    public String toString() {
        StringBuilder board = new StringBuilder();
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                board.append(squares[row][col].toString());
            }
            board.append("\n");
        }
        return board.toString();
    }
}
