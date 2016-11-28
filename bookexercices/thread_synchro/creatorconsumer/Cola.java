package creatorconsumer;

public class Cola {
	private int numero;
	private boolean disponible = false;
	
	public synchronized int get() {
		while (disponible == false) {
			try {wait();} catch (InterruptedException e) {}
		}
		disponible = false;
		notifyAll();
		return numero;
	}
	
	public synchronized void put(int valor) {
		while (disponible == true) {
			try {wait();} catch (InterruptedException e) {}
		}
		numero = valor;
		disponible = true;
		notifyAll();
	}
}
