import java.io.*;
 
public class ex12{
	
	public static void main(String[] args) throws IOException {
		int num1, num2, resp1, resp2, cont;
		int i =0;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("##### TITLE ######\n");
		
		System.out.print("Introduce un numero prositivo: ");
		String resp3 = reader.readLine();
		resp1 = Integer.parseInt(resp3);
		
		System.out.print("Introduce otro numero prositivo: ");
		String resp4 = reader.readLine();
		resp2 = Integer.parseInt(resp4);
		
		int array1[] = new int[10];
		int array2[] = new int[10];
		int suma[] = new int[10];
		
		for(cont=resp1;cont<resp1+10;cont++){
			array1[i]=cont;
			if (i==0){
				System.out.print("[1]\t");
			}
			if (i<9){
				System.out.print(array1[i]+", ");
			}
			else{
				System.out.print(array1[i]);
			}
			i++;
		}
		System.out.println("");
		i=0;
		
		for(cont=resp2;cont<resp2+10;cont++){
			array2[i]=cont;
			if (i==0){
				System.out.print("[2]\t");
			}
			if (i<9){
				System.out.print(array2[i]+", ");
			}
			else{
				System.out.print(array2[i]);
			}
			i++;
		}
		
		System.out.println("");
		i=0;
		for(cont=0;cont<10;cont++){
			suma[cont]=array1[cont]+array2[cont];
			if (cont==0){
				System.out.print("[1+2]\t");
			}
			if (i<9){
				System.out.print(suma[cont]+", ");
			}
			else{
				System.out.print(suma[cont]);
			}
			i++;
		}
	}
}
