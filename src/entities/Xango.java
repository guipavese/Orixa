package entities;

import boardgame.Position;

public class Xango extends Orixa{
	
	public Xango(Player player) {
		super(player);
		int hp = 100;
		int defesa = 60;
		char symbol = 'F';
	}
	
	@Override
	public String toString() {
		return symbol + "";
	}	

}

