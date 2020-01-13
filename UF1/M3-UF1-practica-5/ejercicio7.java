import java.io.*;
 
public class ejercicio7{
	
  public static void main(String[] args) throws IOException {
    //float A;
    //float B;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Inserta tu edad: ");
    String linea = reader.readLine();
    System.out.print("Inserta tu nombre: ");
    String linea2 = reader.readLine();
    //A = Float.parseFloat(linea);  // conversió de String a float
    //B = Float.parseFloat(linea2);  // conversió de String a float
    System.out.println("Hola " + linea2 + ", tu edad es " + linea + " años.");
  }
}
