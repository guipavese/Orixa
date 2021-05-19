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

		
		Board board = new Board(1);
		board.placeOrixa(new Oxossi(Player.PLAYER1), new Position(2, 2));
		board.placeOrixa(new Oxossi(Player.PLAYER2), new Position(6, 6));
		board.printBoard();

	}
}
