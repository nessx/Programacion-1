import java.io.*;
 
public class ejercicio1{
	
  public static void main(String[] args) throws IOException {
    int A;
    int B;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("introduce el primer numero: ");
    String linea = reader.readLine();
    System.out.print("introduce el segundo numero: ");
    String linea2 = reader.readLine();
    A = Integer.parseInt(linea);  // conversió de String a float
    B = Integer.parseInt(linea2);  // conversió de String a float
    B = A - B;
    A = A - B;
    B = A + B;
    System.out.println(" Resultado de A= " +A );
    System.out.println(" Resultado de B= " +B );
  }
}
