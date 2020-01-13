import java.io.*;
 
public class activitat5{
	
	public static void main(String[] args) throws IOException {
		float A;
		float B;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduce el precio original: ");
		String A1 = reader.readLine();
		System.out.print("Introduce el precio pagado: ");
		String B1 = reader.readLine();
		
		A = Float.parseFloat(A1);  // conversió de String a float
		B = Float.parseFloat(B1);  // conversió de String a float
		
		float O = B*100.0f/A;
		float P = A-B;
		
		System.out.println("Has pagado el "+O+"%"  );
		System.out.println("Te has ahorrado "+P+"€" );
	}
}
