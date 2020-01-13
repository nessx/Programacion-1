import java.io.*;
 
public class act5{
	
	public static void main(String[] args) throws IOException {
		int B;
		int C=0;
		String S="";
		int D;
		int E=0;
		int R=0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while (!S.equals("no")){
			System.out.print("Introduce tu nombre: ");
			String A = reader.readLine();
			while (A.equals("")){
				System.out.println("El nombre no puede estar en blanco!! ");
				System.out.print("Introduce tu nombre: ");
				String A2 = reader.readLine();
				A=A2;
			}
			System.out.print("Introduce tu edad: ");
			String B1 = reader.readLine();
			B = Integer.parseInt(B1);
		
			while (B<=-1){
				System.out.println("No puedes introducir un valor negativo");
				System.out.print("Introduce tu edad: ");
				String B2 = reader.readLine();
				B = Integer.parseInt(B2);
			}
				
			if (B>1){
				System.out.print("Introduce el año actual: ");
				String C1 = reader.readLine();
				C = Integer.parseInt(C1);  // conversió de string a integer
			}
			while (C<1900){
				System.out.println("No puedes introducir un año menor al 1900");
				System.out.print("Introduce el año actual: ");
				String C2 = reader.readLine();
				C = Integer.parseInt(C2);
			}
			if (B==0){
				System.out.print("el usuario ha nacido este año");
			}
			D = C-B;
			E = 0;
			System.out.println("En "+ D +" Naciste "+ A);
			for(R=D+1;R<C;R++){
				if(R>D){
					E+=1;
					System.out.println("En "+ R +" Tenias "+ E +" Años");
				}
			}
			System.out.println("Adios "+A);
			System.out.print("quieres continuar? si/no: ");
			S = reader.readLine();
		System.out.print("\033[H\033[2J");
		System.out.flush();
		System.out.print("=====Comenzamos de nuevo====\n");
		}
	}
}

