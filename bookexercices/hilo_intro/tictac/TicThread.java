package tictac;

public class TicThread extends Thread{

	public TicThread() {
		System.out.println("Creado hilo TIC ");
	}

	@Override
	public void run() {
		while (true) {
			System.out.println("TIC");
		}
	}
}