package entities;

import boardgame.Board;
import boardgame.Position;

public class Iemanja extends Orixa{
	
	public Iemanja(Position pos, Player player) {
		super(pos, player);
		int hp = 100;
		int defesa = 60;
		char symbol = 'E';
	}
	
	@Override
	public void ataque1(Board board, Orixa orixa) {
		
	}
	
	@Override
	public String toString() {
		return symbol + "";
	}	

}
