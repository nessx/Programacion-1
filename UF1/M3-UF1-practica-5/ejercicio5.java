import java.io.*;
 
public class ejercicio5{
	
  public static void main(String[] args) throws IOException {
    int A;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("€: ");
    String linea = reader.readLine();
    A = Integer.parseInt(linea);  // conversió de String a float
    int multi=A*166;
    System.out.println(" Resultado es " + multi + "Pts.");
  }
}
