package entities;

import boardgame.Position;

public class Iemanja extends Orixa{

	private char symbol = 'W';
	
	public Iemanja(int hp, int defesa, Position pos) {
		super(hp, defesa, pos);
	}
	
	public void ataque1(Orixa orixa) {
		System.out.println("MARÉ CHEIA");
		
		
	}
	
}
