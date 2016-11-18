package tictac;

public class StartThread {

	public static void main(String[] args) {
		TicThread tic = new TicThread();
		TacThread tac = new TacThread();
		tic.start();
		tac.start();
	}
	
}