package hiloIntro;

public class hiloscontador extends Thread {
	private int c;
	private int hilo;
	
	public hiloscontador(int hilo) {
		this.hilo = hilo;
		System.out.println("Creando hilo: "+this.hilo);
	}
	
	@Override
	public void run() {
			c = 0;
			while (c <= 5) {
				System.out.println("Hilo " + hilo + ": C = "+c);
				c++;
			}
			System.out.println("Cerrando hilo "+ hilo);
		}
	
	public static void main(String[] args) {
		hiloscontador h = null;
		for (int n=0;n<3;n++) {
			h = new hiloscontador(n+1);
			h.start();
		}
		System.out.println("3 hilos creados");
	}
}
