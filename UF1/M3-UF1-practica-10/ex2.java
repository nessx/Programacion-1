import java.io.*;
 
public class ex2{
	
	public static void main(String[] args) throws IOException {
		int alumnos;
		int i;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Cuantos alumnos tienes este año: ");
		String alumnos1 = reader.readLine();
		alumnos = Integer.parseInt(alumnos1);
		
		while (alumnos <0 || alumnos >50){
			System.out.print ("Tiene que ser un valor entre 0 y 50\n");
				
			System.out.print("Cuantos alumnos tienes este año: ");
			String alumnos2 = reader.readLine();
			alumnos = Integer.parseInt(alumnos2);
			
			
		}
		
		int notas[] = new int[alumnos];

		
		for (i=0;i<alumnos;i++){
			System.out.print("Introduce la nota final del alumno"+ (i+1) +":");
			String nota1 = reader.readLine();
			notas[i] = Integer.parseInt(nota1);
			int n = notas[i];
			while (n<0 || n>10){
				System.out.print("La nota tiene que estar entre un rango de 0 y 10\n");
				System.out.print("Introduce la nota final del alumno "+ (i+1) +":");
				String nota2 = reader.readLine();
				notas[i] = Integer.parseInt(nota2);
				n = notas[i];
			}  
		}
		
		for(i=0;i<notas.length;i++){
			if (i<notas.length-1){
				System.out.print(notas[i]+",");
			}
			else{
				System.out.print(notas[i]);
			}
		}
	}
}
