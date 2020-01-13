import java.io.*;

public class activitat10{
	public static void main(String[] args) throws IOException {
		int num1;
		int num2;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduce el precio inical: ");
		String num1s = reader.readLine();
		System.out.print("Introduce el precio pagado: ");
		String num2s = reader.readLine();		
		
		num1 = Integer.parseInt(num1s);  // conversió de String a int
		num2 = Integer.parseInt(num2s);  // conversió de String a int

		int num4 = num2-num1;
		int num5 = num1+num2;
		
		if (num1>num2){
			System.out.println("Error le faltan "+ num4 +"€");	
		}
		else if (num2<num1){
			System.out.println("Le sobran "+ num5 + "€");	
		}
		else if (num2>num1){
			System.out.println("Le sobran "+ num4 + "€");	
		}
		else if (num1==num2){
			System.out.println("El pago de "+ num1 +"€ se ha realizado con exito");	
		}
		
	}
}

