import java.io.*;
 
public class ejercicio8{
	
  public static void main(String[] args) throws IOException {
    int A;
    int B;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("introduce el primer numero: ");
    String linea = reader.readLine();
    System.out.print("introduce el segundo numero: ");
    String linea2 = reader.readLine();
    A = Integer.parseInt(linea);  // conversió de String a float
    B = Integer.parseInt(linea2);  // conversió de String a float
	int suma = A + B;
	int rest = A - B;
	int multi = A * B;
	float div = A / B;
	int mod = A % B;
    System.out.println("Este es el reultado de la suma " + suma);
	System.out.println("Este es el reultado de la Resta " + rest);
	System.out.println("Este es el reultado de la Multiplicación " + multi);
	System.out.println("Este es el reultado de la Divición " + div);
	System.out.println("Este es el reultado de la Módulo " + mod);
  }
}
