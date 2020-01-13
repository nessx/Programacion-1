import java.io.*;
 
public class act13{
	
	public static void main(String[] args) throws IOException {
		int D;
		int i =0;
		int f =0;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Introduce un numero: ");
		String D1 = reader.readLine();
		D = Integer.parseInt(D1);
		if (D<=0){
			System.out.print("El numero de repeticiones tiene ser mayor que 1");
		}
		else{
			for (i=D;i>0;i++){
				for (f=1;f<i;f++){
					//System.out.print(f+", ");
				}
				System.out.print(f);
				System.out.println();
			}
		}
	}
}
