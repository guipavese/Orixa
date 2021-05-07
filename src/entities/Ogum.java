package entities;

import boardgame.Position;

public class Ogum extends Orixa{

	private int hp = 100;
	private int defesa = 60;
	private char symbol = 'E';
	
	public Ogum() {
	}
	
	public Ogum(int hp, int defesa, Position pos) {
		super(hp, defesa, pos);
	}

	@Override
	public String toString() {
		return symbol + "";
	}	
}
