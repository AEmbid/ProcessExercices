package pingpong_creatorconsumer;

public class Productor extends Thread {
	private Cola cola;
	private int n;
	
	public Productor(Cola c, int n) {
		cola = c;
		this.n = n;
	}
	
	public void run() {
		while (true) {
			if (n%2 != 0) { cola.put("PING");
			} else { cola.put("PONG");}
			n++;
			try {sleep(100);} 
			catch (InterruptedException e) {}
			}
	}
}
