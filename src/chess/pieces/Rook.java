package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Colour;

public class Rook extends ChessPiece{
    
    public Rook(Board board,Colour colour) {
        super(colour, board);
    }
    
    @Override
    public String toString(){
        return "R";
    }
    
      @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
    
}
