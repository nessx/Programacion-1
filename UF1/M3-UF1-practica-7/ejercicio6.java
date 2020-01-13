import java.io.*;
 
public class ejercicio6{
  public static void main(String[] args) throws IOException {
	
	int exit;
	int planta;
	int operacion;
	exit = 5;
	planta = 0;
	
	while (exit !=0) {
		
		System.out.println("----------------------- ");
		System.out.println("L'ascensor continu ");
		System.out.println("----------------------- ");
		System.out.println("");
		System.out.println(" 1: pujar un pis");
		System.out.println(" 2: pujar dos pisos");
		System.out.println(" 3: baixar un pis");
		System.out.println(" 4: baixar dos pisos");
		System.out.println(" 5: sortir de l’ascensor");
		System.out.println("----------------------- ");
		System.out.println("");
		System.out.print("Presione una de estas opciones : ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String opstring = reader.readLine();
		operacion = Integer.parseInt (opstring);
		if (operacion==1) {
			planta+=1;
			System.out.println("Estas actualmente en esta planta = "+planta);
			}
			if (planta<0||planta>2){
				planta-=1;
				System.out.println("Estas actualmente en esta planta = "+planta);
				System.out.println("Error !!! Porfavor introduzca los botones que se muestran en el panel");
			}
		
		if (operacion==2) {
			planta+=2;
			System.out.println("Estas actualmente en esta planta = "+planta);
			if (planta<0||planta>2){
				planta-=2;
				System.out.println("Error !!! Porfavor introduzca los botones que se muestran en el panel");
			}
		}
		if (operacion==3) {
			planta-=1;
			System.out.println("Estas actualmente en esta planta = "+planta);
			if (planta<0||planta>2){
				planta+=1;
				System.out.println("Error !!! Porfavor introduzca los botones que se muestran en el panel");
			}
		}
		if (operacion==4) {
			planta-=2;
			System.out.println("Estas actualmente en esta planta = "+planta);
			if (planta<0||planta>2){
				planta+=2;
				System.out.println("Error !!! Porfavor introduzca los botones que se muestran en el panel");
				
			}
		}
		
		
		if (operacion==5)
			exit=0;
		
			}
		System.out.println("Usted a salido en la planta = "+planta);
		}
	}

		
