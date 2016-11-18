package threadInterrupt;

public class HiloEjemploInterrupt extends Thread {
	public void run() {
		try {
			while(!isInterrupted()) {
				System.out.println("En el Hilo");
				Thread.sleep(10);
			} 
		} catch (InterruptedException e) {e.printStackTrace();}
		System.out.println("FIN DEL HILO");
	} 
	
	public void interrumpir() {
		interrupt();
	}
	
	public static void main(String[] args) {
		HiloEjemploInterrupt h = new HiloEjemploInterrupt();
		h.start();
		for (int i=0;i<10000000;i++);
		h.interrumpir();
	}
} 
