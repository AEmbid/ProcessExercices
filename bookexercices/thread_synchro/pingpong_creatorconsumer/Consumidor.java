package pingpong_creatorconsumer;

public class Consumidor extends Thread {
	private Cola cola;
	
	public Consumidor(Cola c) {
		cola = c;
	}
		
	public void run(){
		while (true) {
			String valor = cola.get();
			System.out.println(valor);		
		}
	}

}
