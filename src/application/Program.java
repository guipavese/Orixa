package application;

import boardgame.Board;
import boardgame.Position;
import entities.Iemanja;
import entities.Orixa;

public class Program {

	public static void main(String[] args) {
		
		Board board = new Board(10, 10);
		Orixa[][] settingPieces = new Orixa[10][10];
		
		settingPieces[1][1] = new Iemanja();
		
		board.setPieces(settingPieces);
		
		
		
	}
}
