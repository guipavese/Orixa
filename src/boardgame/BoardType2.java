package boardgame;

public class BoardType2 extends Board{
	
	public BoardType2() {
		
		char boardDisplay[][] = {{'_','_','_','_','_','_','_','_','_','_',
								  '_','_','_','_','_','_','_','_','_','_',
								  '_','_','_','_','~','~','_','_','_','_',
								  '_','_','_','~','~','~','~','_','_','_',
								  '_','_','_','~','~','~','~','_','_','_',
								  '_','_','_','~','~','~','~','_','_','_',
								  '_','_','_','~','~','~','~','_','_','_',
								  '_','_','_','_','~','~','_','_','_','_',
								  '_','_','_','_','_','_','_','_','_','_',
								  '_','_','_','_','_','_','_','_','_','_'}};
		rows = 10;
		columns = 10;
	}

}
