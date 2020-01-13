import java.io.*;
 
public class act12{
	
	public static void main(String[] args) throws IOException {
		int B;
		int i =0;
		int f =0;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Introduce un numero: ");
		String B1 = reader.readLine();
		B = Integer.parseInt(B1);
		if (B<=0){
			System.out.print("El numero de repeticiones tiene ser mayor que 1");
		}
		else{
			for (i=0;i<B;i++){
				for (f=i+1;f>1;f--){
					System.out.print(f+",");
				}
				System.out.print(f);
				System.out.println();
			}
		}
	}
}
