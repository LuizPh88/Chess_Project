package application;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner myKb = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.println("Source:");
            ChessPosition source = UI.readChessPosition(myKb);
            
            System.out.println();
            System.out.println("Target: ");
            ChessPosition target = UI.readChessPosition(myKb);
            
            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
                    
        }
    }

}
