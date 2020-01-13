import java.io.*;
 
public class ejercicio14{
	
  public static void main(String[] args) throws IOException {
    int N;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Introduce un numero: ");
    String N1 = reader.readLine();
    N = Integer.parseInt(N1);  // conversió de String a float
    int O=N%10;
    System.out.println(" El ultimo es: " + O );
  }
}
