package tictac;

public class TacThread extends Thread{
	
	public TacThread() {
		System.out.println("Creado hilo TAC ");
	}
	
	@Override
	public void run() {
		while (true) {
			System.out.println("TAC");
		}
	}
}
