package entities;

import boardgame.Position;

public class Ogum extends Orixa{
	
	public Ogum(Position pos, Player player) {
		super(pos, player);
		int hp = 100;
		int defesa = 60;
		char symbol = 'E';
	}

	@Override
	public String toString() {
		return symbol + "";
	}	
}
