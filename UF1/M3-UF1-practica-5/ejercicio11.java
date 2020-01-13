import java.io.*;
 
public class ejercicio11{
	
  public static void main(String[] args) throws IOException {
    float A;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Introduce el precio del producto: ");
    String linea = reader.readLine();
    A = Integer.parseInt(linea);  // conversió de String a float
	float IVA = 21*A/100;
	float IMP = IVA + A;
    System.out.println("IVA 21% "+ IVA +"€");
    System.out.println("Cantidad a pagar " + IMP +"€");

  }
}
