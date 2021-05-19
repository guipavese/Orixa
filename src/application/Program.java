package application;

import boardgame.Board;
import boardgame.BoardException;
import boardgame.Position;
import entities.EntitiesException;
import entities.Iemanja;
import entities.Orixa;
import entities.Oxossi;
import entities.Player;

public class Program {

	public static void main(String[] args){

		
		Board board = new Board(3);
		board.placeOrixa(new Oxossi(Player.PLAYER1), new Position(0, 0));
		board.placeOrixa(new Oxossi(Player.PLAYER2), new Position(8, 8));
		board.printBoard();

	}
}
