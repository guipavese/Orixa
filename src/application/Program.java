package application;

import java.util.Scanner;
import boardgame.Board;
import boardgame.BoardException;
import boardgame.Position;
import entities.EntitiesException;
import entities.Iemanja;
import entities.Orixa;
import entities.Oxossi;
import entities.Player;

public class Program {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int i, j;
		Position pos;
		
		Board board = new Board(1);
		board.placeOrixa(new Oxossi(Player.PLAYER1), new Position(3, 0));
		board.placeOrixa(new Oxossi(Player.PLAYER2), new Position(3, 5));
		board.printBoard();
		
		System.out.print("Escolha as coordenadas do Orixá que vai fazer o ataque(linha)(columa): ");
		i = sc.nextInt();
		j = sc.nextInt();
		pos = new Position(i, j);
		Orixa attacker = board.orixaIn(i, j);
	
		System.out.print("Escolha as coordenadas do Orixá que vai ser atacado(linha)(columa): ");
		i = sc.nextInt();
		j = sc.nextInt();
		pos = new Position(i, j);
		Orixa target = board.orixaIn(i, j);
		
		System.out.println("O hp desse Orixa é: " + board.pieces[i][j].getHp() + ". Deseja atacar(s/n)?");
		Character opt = sc.next().charAt(0);
		opt = Character.toLowerCase(opt);
		
		switch(opt) {
		
		case 's':
			attacker.ataque1(board, target, 70);
			System.out.println("A vida do Orixá que você atacou agora é: " + target.getHp());
		}
		
		
		
	}
}
