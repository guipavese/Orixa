package entities;

import boardgame.Board;
import boardgame.Position;

public class Iemanja extends Orixa{
	
	public Iemanja(Player player) {
		super(player);
		int hp = 100;
		int defesa = 60;
		char symbol = 'E';
	}
	
	@Override
	public void ataque1(Board board, Orixa orixa, int initDamage) {
		
	}
	
	@Override
	public String toString() {
		return symbol + "";
	}	

}
