import java.io.*;
 
public class ejercicio12{
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("En que color esta el semaforo?: ");
		String A1 = reader.readLine();
		if (A1.equals("verde")){ //equals sirve para comparar unicamente strings
			System.out.println("Pasa");
		}
		else if (A1.equals("amarillo")){
			System.out.println("Corre");
		}
		else if (A1.equals("rojo")){
			System.out.println("Espera!!");
		}
	}
}
