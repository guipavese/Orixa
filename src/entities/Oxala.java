package entities;

import boardgame.Position;

public class Oxala extends Orixa{

	private int hp = 100;
	private int defesa = 30;
	private char symbol = 'A';
	
	public Oxala() {
	}
	
	public Oxala(int hp, int defesa, Position pos) {
		super(hp, defesa, pos);
	}
	
	@Override
	public String toString() {
		return symbol + "";
	}	
}
