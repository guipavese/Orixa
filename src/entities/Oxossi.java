package entities;

import boardgame.Board;
import boardgame.BoardException;

public class Oxossi extends Orixa{
	
	public Oxossi(Player player) {
		super(player);
		 hp = 100;
		 defesa = 50;
	 	 symbol = 'N';
	}
	
	 @Override
	 public void ataque1(Board board, Orixa target, int initDamage){
		 
		 try {
			 if(this.pos.getRow() > target.pos.getRow() || this.pos.getColumn() > target.pos.getRow()) {
				straightAttackDirection(board, target, initDamage, 7, -1);
			 }
			 else if(this.pos.getRow() < target.pos.getRow() || this.pos.getColumn() < target.pos.getRow()) {
				straightAttackDirection(board, target, initDamage, 7, 1);
			 }
		 } catch (BoardException e) {
			 e.getMessage();
		 }
	 }
	
	@Override
	public String toString() {
		return symbol + "";
	}	

}