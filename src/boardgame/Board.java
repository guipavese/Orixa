package boardgame;

import entities.Orixa;

public class Board {
	
	protected int rows;
	protected int columns;
	public Orixa[][] pieces = new Orixa[12][12];
	public char[][] boardDisplay = new char[12][12];
	
	public Board(int opt) throws BoardException {
		
		switch(opt) {
		
		case 1:
			
			rows = 8;
			columns = 8;
			
			for(int i = 0; i < 8; i++) {
				for(int j = 0; j < 8; j++) {
					boardDisplay[i][j] = '_';
				}
			}
			
			break;
			
		case 2:
			
			rows = 10;
			columns = 10;
			
			for(int i = 0; i < 10; i++) {
				for(int j = 0; j < 10; j++) {
					boardDisplay[i][j] = '_';
				}
			}
			
			boardDisplay[2][4] = '~'; boardDisplay[2][5] = '~';
			for(int i = 3; i <= 7; i++) {
				for(int j = 3; j <= 6; j++) {
					boardDisplay[i][j] = '~';
				}
			}
			boardDisplay[8][4] = '~'; boardDisplay[8][5] = '~';
			
			break;
			
		case 3:
			
			rows = 12;
			columns = 12;
			
			for(int i = 0; i < 12; i++) {
				for(int j = 0; j < 12; j++) {
					boardDisplay[i][j] = '_';
				}
			}
			
			boardDisplay[2][3] = '\u0278';		boardDisplay[2][8] = '\u0278';		boardDisplay[9][3] = '\u0278'; boardDisplay[9][4] = '\u0278';
			boardDisplay[3][3] = '\u0278';		boardDisplay[3][8] = '\u0278';		boardDisplay[10][3] = '\u0278';
			boardDisplay[4][3] = '\u0278';
			
			
			boardDisplay[8][6] = '\u0278'; boardDisplay[8][7] = '\u0278';		boardDisplay[10][9] = '\u0278';
			boardDisplay[9][6] = '\u0278'; boardDisplay[9][7] = '\u0278';
			
			System.out.println("TESTE 3");
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
	
	public Orixa orixaIn(int row, int column)  {
		if (!validPosition(row, column)) {
			throw new BoardException("Essa posição não existe");
		}
		return pieces[row][column];
	}
	
	public Orixa orixaIn(Position pos) {
		if (!validPosition(pos)) {
			throw new BoardException("Essa posição não existe");
		}
		return pieces[pos.getRow()][pos.getColumn()];
	}
	
	public void placeOrixa(Orixa orixa, Position pos) {
		if (occupiedPosition(pos)) {
			throw new BoardException("Já existe uma peça na posição (" + pos + ")");
		}
		pieces[pos.getRow()][pos.getColumn()] = orixa;
		boardDisplay[pos.getRow()][pos.getColumn()] = orixa.getSymbol();
		orixa.setPos(pos);
	}
	
	public Orixa removeOrixa(Position pos) {
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
		return row >= 0 && row < rows && column >= 0 && column < columns && boardDisplay[row][column] != '~' && boardDisplay[row][column] != '\u0278';
	}
	
	public boolean validPosition(Position position) {
		return validPosition(position.getRow(), position.getColumn());
	}
	
	public boolean occupiedPosition(Position position) {
		if (!validPosition(position)) {
			throw new BoardException("Essa posição não existe");
		}
		return orixaIn(position) != null;
	}

	public void printBoard() {
		for(int i = 0; i < columns; i++) {
			for(int j = 0; j < rows; j++) {
				System.out.print(" " + boardDisplay[i][j] + " ");
			}
			System.out.println();
		}
	}
}
