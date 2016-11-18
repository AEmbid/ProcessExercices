package sumNum;

import java.util.*;

public class Operation {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		int a = teclado.nextInt();
		System.out.println("Introduce otro numero");
		int b = teclado.nextInt();
		
		System.out.println("El resultado es "+ (a+b) );
	}

}
