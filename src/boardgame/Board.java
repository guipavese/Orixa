package boardgame;

import entities.Orixa;

public class Board {
	
	protected int rows;
	protected int columns;
	protected Orixa[][] pieces;
	protected char[][] boardDisplay;
	
	public Board(int opt) throws BoardException {
		
		switch(opt) {
			
		case 1:
			for(int i = 0; i <= 8; i++) {
				for(int j = 0; j <= 8; j++) {
					boardDisplay[i][j] = '_';
				}
			}
			
			rows = 8;
			columns = 8;
			break;
			
		case 2:
			for(int i = 0; i <= 10; i++) {
				for(int j = 0; j <= 10; j++) {
					boardDisplay[i][j] = '_';
				}
			}
			
			boardDisplay[4][2] = '~'; boardDisplay[5][2] = '~';
			for(int i = 3; i <= 6; i++) {
				for(int j = 3; j <= 6; j++) {
					boardDisplay[i][j] = '~';
				}
			}
			boardDisplay[4][8] = '~'; boardDisplay[5][8] = '~';
			
			rows = 10;
			columns = 10;
			break;
			
		case 3:
			for(int i = 0; i <= 12; i++) {
				for(int j = 0; j <= 12; j++) {
					boardDisplay[i][j] = '~';
				}
			}
			
			boardDisplay[3][2] = '\u0278';		boardDisplay[8][2] = '\u0278';		boardDisplay[3][9] = '\u0278'; boardDisplay[4][9] = '\u0278';
			boardDisplay[3][3] = '\u0278';		boardDisplay[8][3] = '\u0278';		boardDisplay[3][10] = '\u0278';
			boardDisplay[3][4] = '\u0278';
			
			
			boardDisplay[6][8] = '\u0278'; boardDisplay[7][8] = '\u0278';		boardDisplay[9][10] = '\u0278';
			boardDisplay[6][9] = '\u0278'; boardDisplay[7][9] = '\u0278';
			
			rows = 12;
			columns = 12;
			break;
			
		default:
			throw new BoardException("Erro: Você deve escolher uma das opções: 1(Dunas de Stella Maris), 2(Lagoa do Abaeté), 3(Mata de Pituaçú)");
		}
	
	}	
	
	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}
	
	public Orixa orixaIn(int row, int column) throws BoardException {
		if (!validPosition(row, column)) {
			throw new BoardException("Essa posição não existe");
		}
		return pieces[row][column];
	}
	
	public Orixa orixaIn(Position pos) throws BoardException {
		if (!validPosition(pos)) {
			throw new BoardException("Essa posição não existe");
		}
		return pieces[pos.getRow()][pos.getColumn()];
	}
	
	public void placeOrixa(Orixa orixa, Position pos) throws BoardException {
		if (occupiedPosition(pos)) {
			throw new BoardException("Já existe uma peça na posição (" + pos + ")");
		}
		pieces[pos.getRow()][pos.getColumn()] = orixa;
		orixa.setPos(pos);
	}
	
	public Orixa removeOrixa(Position pos) throws BoardException {
		if (!validPosition(pos)) {
			throw new BoardException("Essa posição não existe");
		}
		if (orixaIn(pos) == null) {
			return null;
		}
		Orixa temp = orixaIn(pos);
		temp.setPos(null);
		pieces[pos.getRow()][pos.getColumn()] = null;
		return temp;
	}
	
	private boolean validPosition(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns && boardDisplay[row][column] != '~' && boardDisplay[row][columns] != 'Ф';
	}
	
	public boolean validPosition(Position position) {
		return validPosition(position.getRow(), position.getColumn());
	}
	
	public boolean occupiedPosition(Position position) throws BoardException {
		if (!validPosition(position)) {
			throw new BoardException("Essa posição não existe");
		}
		return orixaIn(position) != null;
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
