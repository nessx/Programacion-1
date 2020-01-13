import java.io.*;
 
public class ejercicio3{
	
  public static void main(String[] args) throws IOException {
    int A;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("introduce tu edad: ");
    String linea = reader.readLine();
    A = Integer.parseInt(linea);  // conversió de String a float
    int suma=A+25;
    System.out.println(" Resultado mas un cuarto de siglo es " + suma );
  }
}
