import java.io.*;

public class Exer1d4P29 {

	public static void main(String[] args) {
		Process p = null;
		String comando = "cmd /c dir";
		Runtime r = Runtime.getRuntime();
		
		try {
			
			p = r.exec(comando);
			InputStream is = p.getInputStream();
			BufferedReader br = new BufferedReader (new InputStreamReader (is));
			
			String linea;
			while ((linea= br.readLine()) != null) {
				System.out.println(linea);
			}
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//MENSAJES DE ERROR
		try {
			
			InputStream er = p.getErrorStream();
			BufferedReader brer = new BufferedReader(new InputStreamReader(er));
			
			String liner = null;
			while ((liner = brer.readLine()) != null) {
				System.out.println("ERROR> " + liner);
			}
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		//COMPROBACION DE ERRORES
		int exitVal;
		try {
			
			exitVal = p.waitFor();
			System.out.println("Valor de salida: "+exitVal);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}




