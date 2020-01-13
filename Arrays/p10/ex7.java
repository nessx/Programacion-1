import java.io.*;
 
public class ex7{
	
	public static void main(String[] args) throws IOException {
		int alumnos, i ; //declaro y inicializo la variable alumnos y la i a la vez, para que el programa sea mas corto
		int suma= 0; //declaro y inicializo la variable suma con un valor de 0
		int susp= 0;
		int apro= 0;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("##### NOTAS ALUMNOS ######\n");
		System.out.print("Cuantos alumnos tienes este año: ");
		String alumnos1 = reader.readLine();
		alumnos = Integer.parseInt(alumnos1);
		
		while (alumnos <1 || alumnos >50){
			System.out.print ("Tiene que ser un valor entre 1 y 50\n");
				
			System.out.print("Cuantos alumnos tienes este año: ");
			String alumnos2 = reader.readLine();
			alumnos = Integer.parseInt(alumnos2);
			
			
		}
		
		int notas[] = new int[alumnos];
		double media = 0; //Double es como un float con la diferencia de que este guarda el doble de bits 64.
		int min =100;
		int max =0;
		
		for (i=0;i<alumnos;i++){
			System.out.print("Introduce la nota final del alumno"+ (i+1) +":");
			String nota1 = reader.readLine();
			notas[i] = Integer.parseInt(nota1);
			int n = notas[i]; // Pasando a integer y pasandola a una variable el contenido de las arrays
			while (n<0 || n>10){
				System.out.print("La nota tiene que estar entre un rango de 1 y 10\n");
				System.out.print("Introduce la nota final del alumno "+ (i+1) +":");
				String nota2 = reader.readLine();
				notas[i] = Integer.parseInt(nota2);
				n = notas[i];
			}  
		}
		
		for(i=0;i<notas.length;i++){
			suma += notas[i]; //La suma de las arrays, de las notas de los alumnos, aunque luego no la imprimo
			media = (double)suma/notas.length; 
			if (notas[i]<=4){
				notas[i]=5;
			}
			if (max<notas[i]){
				max = notas[i];
			}
			
			if (min>notas[i]){
				min = notas[i];
			}
			if (notas[i]>=5){
				apro +=1;
			}
			if (notas[i]<4){
				susp +=1;
			}
		}
		System.out.println("");
		System.out.println("La media es "+media);
		System.out.println("La nota maxima es "+max);
		System.out.println("La nota minima es "+min);
		System.out.println("Han suspendido "+susp+" alumnos");
		System.out.println("Han aprobado "+apro+" alumnos");
	}
}
