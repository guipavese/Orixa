package entities;

import boardgame.Board;
import boardgame.Exceptions;
import boardgame.Position;

public class Iemanja extends Orixa{

	private int hp = 100;
	private int defesa = 30;
	private char symbol = 'W';
	
	public Iemanja() {
	}
	
	public Iemanja(int hp, int defesa, Position pos) {
		super(hp, defesa, pos);
	}
	
	@Override
	public void ataque1(Board board, Orixa orixa) {
		
	}
	
	@Override
	public String toString() {
		return symbol + "";
	}	
	
}
