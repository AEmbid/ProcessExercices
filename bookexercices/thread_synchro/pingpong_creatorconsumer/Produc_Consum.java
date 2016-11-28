package pingpong_creatorconsumer;

public class Produc_Consum {

	public static void main(String[] args) {
		Cola cola = new Cola();
		Productor p = new Productor(cola, 1);
		Consumidor c = new Consumidor(cola);
		p.start();
		c.start();
	}
}