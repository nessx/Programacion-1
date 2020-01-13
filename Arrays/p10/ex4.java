import java.io.*;
 
public class ex4{
	
	public static void main(String[] args) throws IOException {
		int alumnos, i ; //declaro y inicializo la variable alumnos y la i a la vez, para que el programa sea mas corto
		
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
		
		for (i=0;i<alumnos;i++){
			System.out.print("Introduce la nota final del alumno"+ (i+1) +":");
			String nota1 = reader.readLine();
			notas[i] = Integer.parseInt(nota1);
			int n = notas[i]; // Pasando a integer y pasandola a una variable el contenido de las arrays
			while (n<1 || n>10){
				System.out.print("La nota tiene que estar entre un rango de 1 y 10\n");
				System.out.print("Introduce la nota final del alumno "+ (i+1) +":");
				String nota2 = reader.readLine();
				notas[i] = Integer.parseInt(nota2);
				n = notas[i];
			}  
		}
		
		for(i=0;i<notas.length;i++){

		}
	}
}
