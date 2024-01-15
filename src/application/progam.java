package application;

import chess.ChessMatch;

public class progam {

	public static void main(String[] args) {

		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPiece());
		
	}

}
