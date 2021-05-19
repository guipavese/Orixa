package entities;

public class Oxala extends Orixa{
	
	public Oxala(Player player) {
		super(player);
		 hp = 100;
		 defesa = 30;
		 symbol = 'A';
	}
	
	@Override
	public String toString() {
		return symbol + "";
	}	
}