package application;

import boardgame.Position;
import entities.Iemanja;
import entities.Orixa;

public class Program {

	public static void main(String[] args) {
		
		Orixa iemanja = new Iemanja(100, 30, new Position(1, 3));
		
		System.out.println(iemanja);
		
	}
}
