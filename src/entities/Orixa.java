package entities;

import boardgame.Board;
import boardgame.BoardException;
import boardgame.Position;

public abstract class Orixa {
	
	protected int hp;
	protected int defesa;
	protected Position pos;
	protected char symbol;
	protected Player player;
	
	public Orixa(Player player) {
		this.setPlayer(player);
	}
	
	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}

	public Position getPos() {
		return pos;
	}

	public void setPos(Position pos) {
		this.pos = pos;
	}

	public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}

	public void ataque1(Board board, Orixa alvo, int initDamage) {
		
	}
	
	public void especial(Orixa orixa) {
	
	}
	
	public void straightAttackDirection(Board board, Orixa target, int initDamage, int range,  int direction) throws BoardException {
		
		boolean hitVerif = false;
		
		try {
		
			if(this.pos.getRow() == target.pos.getRow()) {
				
				for(int j = 1; j < range && hitVerif == false; j += direction){
					
					if(board.occupiedPosition(new Position(this.pos.getRow(), j))) {
						
						hitVerif = true;
						
						if (target.getDefesa() < initDamage){
			      			int damage = initDamage - target.getDefesa();
			      			target.setHp(target.getHp() - damage);
			    		}
					}
					
					else if(board.boardDisplay[this.pos.getRow()][j] == '\u0278') {
						hitVerif = true;
					}
					
		    		initDamage -= 10;
				}
			}
			
			else if(this.pos.getColumn() == target.pos.getColumn()) {
				
				for(int i = 1; i < range && hitVerif == false; i += direction) {
					
					if(board.occupiedPosition(new Position(i, this.pos.getColumn()))) {
						
						hitVerif = true;
						
						if (target.getDefesa() < initDamage){
			      			int damage = initDamage - target.getDefesa();
			      			target.setHp(target.getHp() - damage);
			    		}
					}
					
					else if(board.boardDisplay[i][this.pos.getColumn()] == '\u0278') {
						hitVerif = true;
					}
					
		    		initDamage -= 10;
					
				}
			}
		}
		catch(BoardException e) {
			e.getMessage();
		}
	}
	
	@Override
	public String toString() {
		return symbol + "";
	}	
}

