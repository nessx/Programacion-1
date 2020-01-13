import java.io.*;
 
public class ejercicio13{
	
  public static void main(String[] args) throws IOException {
    int cola;
    float cp;
    float toronja;
    float tp;
    float limon;
    float lp;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Introduce numero de ventas de producto cola: ");
    String cola1 = reader.readLine();
    System.out.print("Introduce el precio de cola: ");
    String cp1 = reader.readLine();
    System.out.print("Introduce numero de ventas de producto toronja:: ");
    String toronja1 = reader.readLine();
    System.out.print("Introduce el precio de toronja: ");
    String tp1 = reader.readLine();
    System.out.print("Introduce numero de ventas de producto limon: ");
    String limon1 = reader.readLine();
    System.out.print("Introduce el precio de limon: ");
    String lp1 = reader.readLine();
    cola = Integer.parseInt(cola1);
    cp = Float.parseFloat(cp1);
    toronja = Float.parseFloat(toronja1);
    tp = Float.parseFloat(tp1);
    limon = Float.parseFloat(limon1);
    lp = Float.parseFloat(lp1);  // conversió de String a float
	float totalc = cola*cp;
	float totalt = toronja*tp;
	float totall = limon*lp;
	float total = totalc+totalt+totall;
    System.out.println	("-------------------------------------------------");
	System.out.println	("Producto	Ventas	Precio		Total\t");
	System.out.println	("-------------------------------------------------\n");
	System.out.println	("Cola		"+cola+"	"+cp+"		"+totalc+"\n");
	System.out.println	("Toronja	\t"+toronja+"	"+tp+"	\t"+totalt+"\n");
	System.out.println	("Limon		"+limon+"	"+lp+"		"+totall+"\n");
	System.out.println	("-------------------------------------------------\n");

	System.out.println  ("TOTAL\t\t\t\t\t"+total);		

  }
}
