package tictac_advanced;

public class TacThread extends Thread{
	public Turns who;
	
	public TacThread(Turns tictac) {
		synchronized (tictac) {
			this.who = tictac;
		}
		System.out.println("Creado hilo TAC ");
	}
	
	public void run() {
		synchronized (who) {
			if (who.turn()) {
			System.out.println("TAC");
			who.change();}
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
