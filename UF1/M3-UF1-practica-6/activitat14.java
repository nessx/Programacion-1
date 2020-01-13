import java.io.*;
 
public class activitat14{
	public static void main(String[] args) throws IOException {
		int A;
		int B;
	
		System.out.println("#### MENU ####\n"  );
		System.out.println("+ SUMA"  );
		System.out.println("- RESTA"  );
		System.out.println("* MULTIPLICAR"  );
		System.out.println("/ DIVIDIR"  );
	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Elige una opción: "  );
		String A1 = reader.readLine();
	
		switch ( A1 ){
			case "+":
			System.out.print("Introduce el primer numero: "  );
			String A2 = reader.readLine();
			A = Integer.parseInt(A2);  // conversió de String a Integer
		
			System.out.print("Introduce el segundo numero: "  );
			String B2 = reader.readLine();
			B = Integer.parseInt(B2);  // conversió de String a Integer
		
			int result = A + B;
		
			System.out.print("El resultado es-> "+ result  );
			break;
			
			case "-":
			System.out.print("Introduce el primer numero: "  );
			String A3 = reader.readLine();
			A = Integer.parseInt(A3);  // conversió de String a Integer
		
			System.out.print("Introduce el segundo numero: "  );
			String B3 = reader.readLine();
			B = Integer.parseInt(B3);  // conversió de String a Integer
		
			int resultr = A - B;
		
			System.out.print("El resultado es-> "+ resultr  );
			break;
			
			case "*":
			System.out.print("Introduce el primer numero: "  );
			String A4 = reader.readLine();
			A = Integer.parseInt(A4);  // conversió de String a Integer
		
			System.out.print("Introduce el segundo numero: "  );
			String B4 = reader.readLine();
			B = Integer.parseInt(B4);  // conversió de String a Integer
		
			int resultm = A * B;
		
			System.out.print("El resultado es-> "+ resultm  );
			break;
			
			case "/":
			System.out.print("Introduce el primer numero: "  );
			String A5 = reader.readLine();
			A = Integer.parseInt(A5);  // conversió de String a Integer
		
			System.out.print("Introduce el segundo numero: "  );
			String B5 = reader.readLine();
			B = Integer.parseInt(B5);  // conversió de String a Integer
		
			int resultd = A / B;
		
			System.out.print("El resultado es-> "+ resultd  );
			break;
			
			default:
			System.out.print("==== Error, aprende a leer. ====");
		}
	}
}
