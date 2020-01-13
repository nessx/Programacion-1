import java.io.*;
 
public class act4{
	
	public static void main(String[] args) throws IOException {
		int A;
		int B;
		int C;
		B=0;
		C=0;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduce el primer numero: ");
		String A1 = reader.readLine();
		
		A = Integer.parseInt(A1);
		while (B!=A){
			B+=1;
			C+=B;
		}
		
		System.out.println(C);

	}
}
