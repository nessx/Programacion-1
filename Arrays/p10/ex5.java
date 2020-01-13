import java.io.*;
 
public class ex5{
	
	public static void main(String[] args) throws IOException {
		int alumnos, i; //declaro y inicializo la variable alumnos y la i a la vez, para que el programa sea mas corto
		int suma= 0; //declaro y inicializo la variable suma con un valor de 0
		int modal = 0;
		int nuevan = 0;
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
				System.out.print("La nota tiene que estar entre un rango de 0 y 10\n");
				System.out.print("Introduce la nota final del alumno "+ (i+1) +":");
				String nota2 = reader.readLine();
				notas[i] = Integer.parseInt(nota2);
				n = notas[i];
			}  
		}
		
		for(i=0;i<notas.length;i++){
			suma += notas[i]; //La suma de las arrays, de las notas de los alumnos, aunque luego no la imprimo
			media = (double)suma/notas.length; 
			if (max<notas[i]){
				max = notas[i];
			}
			
			if (min>notas[i]){
				min = notas[i];
			}
		}
		System.out.println("");
		System.out.println("La media es "+media);
		System.out.println("La nota maxima es "+max);
		System.out.println("La nota minima es "+min+"\n");
		System.out.print("Quieres modificar, alguna de las notas anteriores? (si/no): ");
		String mod1 = reader.readLine();
		if (mod1.equals("si")){
			System.out.print("Por favor introduzca el numero del alumno que quieres modificar: ");
			String modal1 = reader.readLine();
			modal = Integer.parseInt(modal1)-1;
			while (modal<0 || modal>alumnos-1){ //Comproción de usuarios
				System.out.println("El alumno no existe en la base de datos! ");
				
				System.out.print("Por favor introduzca el numero del alumno que quieres modificar: ");
				String modal2 = reader.readLine();
				modal = Integer.parseInt(modal2)-1;
			}
			
			System.out.print("Por favor introduzca la nueva nota que quieres asignar al alumno numero "+(modal+1)+":" );
			String nuevan1 = reader.readLine();
			nuevan = Integer.parseInt(nuevan1);
			while (nuevan<0 || nuevan>10){
				System.out.print("La nota tiene que estar entre un rango de 0 y 10\n");
				System.out.print("Por favor introduzca la nueva nota que quieres asignar al alumno numero "+(modal+1)+":" );
				String nuevan2 = reader.readLine();
				nuevan = Integer.parseInt(nuevan2);
			} 
			notas[modal] = nuevan; //le asigno un nuevo valor a una array existente
			suma = 0;
			min = 100;
			max = 0;
			//aca abajo vuelvo a copiar el for para volver a calcular las medias, las maximas y las minimas.
			for(i=0;i<notas.length;i++){
				suma += notas[i]; //La suma de las arrays, de las notas de los alumnos, aunque luego no la imprimo
				media = (double)suma/notas.length; 
				if (max<notas[i]){
					max = notas[i];
				}
				
				if (min>notas[i]){
					min = notas[i];
				}
			}
			
		System.out.println("");
		System.out.println("La media es "+media);
		System.out.println("La nota maxima es "+max);
		System.out.println("La nota minima es "+min+"\n");
		System.out.println("ADIOS!!!");
			
		}
	}
}
