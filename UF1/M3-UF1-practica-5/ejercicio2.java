import java.io.*;
 
public class ejercicio2{
	
  public static void main(String[] args) throws IOException {
    float A;
    float B;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("introduce el primer numero: ");
    String linea = reader.readLine();
    System.out.print("introduce el segundo numero: ");
    String linea2 = reader.readLine();
    A = Float.parseFloat(linea);  // conversió de String a float
    B = Float.parseFloat(linea2);  // conversió de String a float
    float suma=A+B;
    System.out.println(" Resultado " + suma );
  }
}
