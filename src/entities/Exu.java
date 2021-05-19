package entities;

public class Exu extends Orixa{
	
	public Exu(Player player) {
		super(player);
		 hp = 100;
		 defesa = 50;
		 symbol = 'D';
	}

	@Override
	public String toString() {
		return symbol + "";
	}	
}
