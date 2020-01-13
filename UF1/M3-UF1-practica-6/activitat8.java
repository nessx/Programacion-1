import java.io.*;

public class activitat8{
	public static void main(String[] args) throws IOException {
		int num1;
		int num2;
		int num3;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduce el primer numero: ");
		String num1s = reader.readLine();
		System.out.print("Introduce el segundo numero: ");
		String num2s = reader.readLine();		
		System.out.print("Introduce el tercer numero: ");
		String num3s = reader.readLine();
		
		num1 = Integer.parseInt(num1s);  // conversió de String a int
		num2 = Integer.parseInt(num2s);  // conversió de String a int
		num3 = Integer.parseInt(num3s);  // conversió de String a int
		
		if (num1>num2&&num2>num3){
			System.out.println(num3+","+ num2+","+ num1);
		}
		else if (num1>num3&&num3>num2){
			System.out.println(num2+","+ num3+","+ num1);
		}
		else if (num2>num1&&num1>num3){
			System.out.println(num3+","+ num1+","+ num2);
		}
		else if (num2>num3&&num3>num1){
			System.out.println(num1+","+ num3+","+ num2);
		}
		else if (num3>num1&&num1>num1){
			System.out.println(num1+","+ num1+","+ num3);
		}
		else if (num3>num2&&num2>num1){
			System.out.println(num1+","+ num2+","+ num3);
		}
	}
}

