package entities;

import boardgame.Position;

public class Ogum extends Orixa{
	
	public Ogum(Player player) {
		super(player);
		int hp = 100;
		int defesa = 60;
		char symbol = 'E';
	}

	@Override
	public String toString() {
		return symbol + "";
	}	
}
