package pingpong_creatorconsumer;

public class Cola {
	private String numero;
	private boolean disponible = false;
	
	public synchronized String get() {
		while (disponible == false) {
			try {wait();} catch (InterruptedException e) {}
		}
		disponible = false;
		notifyAll();
		return numero;
	}
	
	public synchronized void put(String valor) {
		while (disponible == true) {
			try {wait();} catch (InterruptedException e) {}
		}
		numero = valor;
		disponible = true;
		notifyAll();
	}
}
