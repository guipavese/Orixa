package entities;

import boardgame.Board;
import boardgame.Position;

public abstract class Orixa {
	
	protected int hp;
	protected int defesa;
	protected Position pos;
	protected char symbol;
	
	public Orixa() {
	}
	
	public Orixa(int hp, int defesa, Position pos) {
		super();
		this.hp = hp;
		this.defesa = defesa;
		this.pos = pos;
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



	public void ataque1(Board board, Orixa orixa) {
		
	}
	
	public void especial(Orixa orixa) {
	
	}
	
	@Override
	public String toString() {
		return symbol + "";
	}	
}
