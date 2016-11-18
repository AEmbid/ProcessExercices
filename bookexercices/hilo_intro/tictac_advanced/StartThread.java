package tictac_advanced;

public class StartThread {

	public static void main(String[] args) {
		Turns tictac = new Turns(true);
		
		TicThread tic = new TicThread(tictac);
		TacThread tac = new TacThread(tictac);
		tic.start();
		tac.start();
	}
	
}