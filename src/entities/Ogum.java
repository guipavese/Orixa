package entities;

public class Ogum extends Orixa{
	
	public Ogum(Player player) {
		super(player);
		 hp = 100;
		 defesa = 60;
		 symbol = 'E';
	}

	@Override
	public String toString() {
		return symbol + "";
	}	
}
