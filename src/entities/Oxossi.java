package entities;

import boardgame.Position;

public class Oxossi extends Orixa{
	
	public Oxossi(Position pos, Player player) {
		super(pos, player);
		int hp = 100;
		int defesa = 50;
	 	char symbol = 'N';
	}
	
	@Override
	public String toString() {
		return symbol + "";
	}	

}