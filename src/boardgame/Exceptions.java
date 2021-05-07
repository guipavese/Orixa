package boardgame;

import entities.Orixa;

public class Exceptions {

	public static boolean emptyPosition(Board board, Orixa orixa) {
		return board.getPieces()[orixa.getPos().getX()][orixa.getPos().getY()] != null;
	}
}
