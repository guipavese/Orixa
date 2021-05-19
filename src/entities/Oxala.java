package entities;

import boardgame.Position;

public class Oxala extends Orixa{
	
	public Oxala(Player player) {
		super(player);
		int hp = 100;
		int defesa = 30;
		char symbol = 'A';
	}
	
	@Override
	public String toString() {
		return symbol + "";
	}	
}