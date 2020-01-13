import java.io.*;
 
public class act3{
	
	public static void main(String[] args) throws IOException {
		int A;
		int B;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduce el primer numero: ");
		String A1 = reader.readLine();
		System.out.print("Introduce el segundo numero: ");
		String B1 = reader.readLine();
		
		A = Integer.parseInt(A1);
		B = Integer.parseInt(B1);  // conversió
		
		if (A<B){
			for (A = Integer.parseInt(A1)+1;A!=B;A+=1){
				System.out.println(A);
			}
		}
		else{
			if (A>B){
				for (B = Integer.parseInt(B1)+1;B!=A;B+=1){
				System.out.println(B);
				}
			}
		}
	}
}

