package entities;

import boardgame.Position;

public class Oxossi extends Orixa{

	private int hp = 100;
	private int defesa = 50;
	private char symbol = 'N';
	
	public Oxossi() {
	}
	
	public Oxossi(int hp, int defesa, Position pos) {
		super(hp, defesa, pos);
	}
	
	@Override
	public String toString() {
		return symbol + "";
	}	

}
