import java.io.*;
 
public class act10{
	
	public static void main(String[] args) throws IOException {
		int A;
		int B;
		int i =0;
		int f =0;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduce un numero: ");
		String A1 = reader.readLine();
		A = Integer.parseInt(A1);
		
		System.out.print("cuantas veces quieres que se repita: ");
		String B1 = reader.readLine();
		B = Integer.parseInt(B1);
		if (B<=0){
			System.out.print("El numero de repeticiones tiene ser mayor que 1");
		}
		else{
			for (i=0;i<B;i++){
				for (f=1;f<A+1;f++){
					System.out.print(f);
				}
				System.out.println();
			}
		}
	}
}
