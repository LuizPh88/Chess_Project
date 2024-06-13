package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Colour;

public class King extends ChessPiece{
    
    public King(Board board,Colour colour) {
        super(colour, board);
    }
    
    @Override
    public String toString(){
        return "K";
    }
    
}
