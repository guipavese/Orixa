package entities;

public class Xango extends Orixa{
	
	public Xango(Player player) {
		super(player);
		hp = 100;
	    defesa = 60;
	    symbol = 'F';	
	}
	
	@Override
	public String toString() {
		return symbol + "";
	}	

}

