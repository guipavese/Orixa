package entities;

import boardgame.Board;

public class Iemanja extends Orixa{
	
	public Iemanja(Player player) {
		super(player);
		 hp = 100;
		 defesa = 60;
		 symbol = 'E';
	}
	
	@Override
	public void ataque1(Board board, Orixa orixa, int initDamage) {
		
	}
	
	@Override
	public String toString() {
		return symbol + "";
	}	

}
