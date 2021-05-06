package entities;

import boardgame.Position;

public abstract class Orixa {
	
	protected int hp;
	protected int defesa;
	protected Position pos;
	protected char symbol;
	
	public Orixa(int hp, int defesa, Position pos) {
		super();
		this.hp = hp;
		this.defesa = defesa;
		this.pos = pos;
	}
	
	public void ataque1(Orixa orixa) {
		
	}
	
	public void especial(Orixa orixa) {
	
	}
	
	@Override
	public String toString() {
		return symbol + "";
	}
	
}
