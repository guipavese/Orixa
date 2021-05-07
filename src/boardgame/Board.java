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
	
	
	
	public int getRows() {
		return rows;
	}



	public void setRows(int rows) {
		this.rows = rows;
	}



	public int getColumns() {
		return columns;
	}



	public void setColumns(int columns) {
		this.columns = columns;
	}



	public Orixa[][] getPieces() {
		return pieces;
	}



	public void setPieces(Orixa[][] pieces) {
		this.pieces = pieces;
	}



	public void printBoard(int rows, int columns) {
		for(int i = 0; i < columns; i++) {
			for(int j = 0; j < rows; j++) {
				if(pieces[i][j] == null) {
					System.out.print(" _ ");
				}
				else {
					System.out.print(" " + pieces[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
	
}
