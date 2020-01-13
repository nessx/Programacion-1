import java.io.*;
 
public class ejercicio9{
	
  public static void main(String[] args) throws IOException {
    int R;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Introduce el radio de la circumferéncia: ");
    String linea = reader.readLine();
    R = Integer.parseInt(linea);  // conversió de String a float
	int RA2 = R * R;
	float A = (float)Math.PI * (float)RA2;
	float P = 2 * (float)Math.PI * R;
    System.out.println("Esta es el Area " + A);
    System.out.println("Esta es el Perimetro " + P);

  }
}
