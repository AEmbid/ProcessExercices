import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SecondP28 {

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
		
		int exitVal;
		try {
			exitVal = p.waitFor();
			System.out.println("Valor de salida: "+exitVal);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

