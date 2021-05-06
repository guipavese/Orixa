package boardgame;

import entities.Orixa;

public class Board {
	
	private int rows;
	private int columns;
	private Orixa[][] pieces;
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
	}
	
	public void printBoard(int rows, int columns) {
		for(int i = 0; i < columns; i++) {
			for(int j = 0; j < rows; j++) {
				if(pieces[i][j] == null) {
					System.out.println("_");
				}
				else {
					System.out.println(pieces[i][j]);
				}
			}
		}
	}
	
}
