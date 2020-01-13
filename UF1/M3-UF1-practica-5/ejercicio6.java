import java.io.*;
 
public class ejercicio6{
	
  public static void main(String[] args) throws IOException {
    float A;
    float B;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Inserta la Base del Rectángulo: ");
    String linea = reader.readLine();
    System.out.print("Inserta la Altura del Rectángulo: ");
    String linea2 = reader.readLine();
    A = Float.parseFloat(linea);  // conversió de String a float
    B = Float.parseFloat(linea2);  // conversió de String a float
    float RESULT=A*B;
    System.out.println("El área de este rectángulo es: " + RESULT + "cm2" );
  }
}
