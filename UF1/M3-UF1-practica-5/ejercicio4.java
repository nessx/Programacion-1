import java.io.*;
 
public class ejercicio4{
	
  public static void main(String[] args) throws IOException {
    int A;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("introduce un numero: ");
    String linea = reader.readLine();
    A = Integer.parseInt(linea);  // conversió de String a float
    int multi=A*A*A*A;
    System.out.println(" Resultado es " + multi );
  }
}
