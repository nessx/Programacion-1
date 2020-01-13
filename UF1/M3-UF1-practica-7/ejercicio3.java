import java.io.*;

public class ejercicio3{
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int A;
		int B;
		B = 7;
		A = 0;
		System.out.println("Pulsa 0 para salir");
		while (B !=0){
			System.out.println("Introduce un numero: ");
			String B1 = reader.readLine();
			B = Integer.parseInt(B1); //Conversion de string a integer
			A+=B;
		}
		System.out.print("El resultado es "+ A);
	}
}
