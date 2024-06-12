package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece  extends Piece {
    private Colour colour;

    public ChessPiece(Colour colour, Board board) {
        super(board);
        this.colour = colour;
    }

    public Colour getColour() {
        return colour;
    }

 
    
    
}
