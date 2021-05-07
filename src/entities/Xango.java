package entities;

import boardgame.Position;

public class Xango extends Orixa{

	private int hp = 100;
	private int defesa = 70;
	private char symbol = 'F';
	
	public Xango() {
	}
	
	public Xango(int hp, int defesa, Position pos) {
		super(hp, defesa, pos);
	}
	
	@Override
	public String toString() {
		return symbol + "";
	}	

}
