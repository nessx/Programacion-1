import java.io.*;
 
public class activitat3{
	
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
    int P = A * B;
	if (P==0) {
		System.out.println("El producto es igual a 0");
	} else {
		if (P>0){
		System.out.println("El producto es mas grande que 0");
		}
		else {
			if (P<0){
				System.out.println("El producto es mas pequeño que 0");
			}
		}
	}
}
}
