package tictac_advanced;

public class TicThread extends Thread{
	public Turns who;

	public TicThread(Turns tictac) {
		synchronized (tictac) {
			this.who = tictac ;
		}
		System.out.println("Creado hilo TIC ");
	}

	public void run() {
		synchronized (who) {
			if (who.turn()) {
			System.out.println("TIC");
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