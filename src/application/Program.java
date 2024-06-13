package application;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner myKb = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            try {
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.print("Source:");
                ChessPosition source = UI.readChessPosition(myKb);

                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(myKb);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);

            } catch (ChessException e) {
                System.out.println(e.getMessage());
                myKb.nextLine();
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                myKb.nextLine();
            }
        }

    }
}
