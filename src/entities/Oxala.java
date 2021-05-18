package entities;

import boardgame.Position;

public class Oxala extends Orixa{
	
	public Oxala(Position pos, Player player) {
		super(pos, player);
		int hp = 100;
		int defesa = 30;
		char symbol = 'A';
	}
	
	@Override
	public String toString() {
		return symbol + "";
	}	
}