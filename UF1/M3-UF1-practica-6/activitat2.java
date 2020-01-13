import java.io.*;
 
public class activitat2{
	
  public static void main(String[] args) throws IOException {
    int A;
    int B;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Introduce el primer numero: ");
    String A1 = reader.readLine();
    System.out.print("Introduce el segundo numero: ");
    String B1 = reader.readLine();
    A = Integer.parseInt(A1);  // conversió de String a float
    B = Integer.parseInt(B1);  // conversió de String a float
	if (A < B) {
		//si  A es mas pequeño que B, imprimo A,B
		System.out.println(A);
		System.out.println(B);
	} else {
		// si no imprimo B, A
		System.out.println(B);
		System.out.println(A);
	}
  }
}
