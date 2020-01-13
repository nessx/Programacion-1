import java.io.*;
 
public class ex9{
	
	public static void main(String[] args) throws IOException {
		int alumnos, i, mod; //declaro y inicializo la variable alumnos y la i a la vez, para que el programa sea mas corto
		int suma= 0; //declaro y inicializo la variable suma con un valor de 0
		boolean key = false;
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
		
		int notas[] = new int[50];
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
		
		for(i=0;i<alumnos;i++){
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
		
		System.out.println("INICIAL");
		for(i=0;i<alumnos;i++){
			if (i<alumnos-1){
				System.out.print(notas[i]+", ");
			}
			else{
				System.out.println(notas[i]);
			}
		}
		
		// SEGUNDA PARTE
		
		System.out.print("¿Quieres eliminar una nota? (si/no): ");
		String mod1 = reader.readLine();
		if (mod1.equals("si")){
			System.out.print("En qué posición esta la nota que quieres eliminar?: ");
			String modal1 = reader.readLine();
			modal = Integer.parseInt(modal1)-1;
			alumnos -=1;
			
			/*COSAS RECICLADAS AJENAS*/
			for (i=modal;i<=alumnos;i++){
				notas[i] = notas[i+1];
			}
			/* HASTA AQUI LLEGA LO RECICLADO*/
			
			//notas[modal] = nuevan; //le asigno un nuevo valor a una array existente
			
			suma = 0;
			min = 100;
			max = 0;
			//aca abajo vuelvo a copiar el for para volver a calcular las medias, las maximas y las minimas.
			for(i=0;i<alumnos;i++){
				suma += notas[i]; //La suma de las arrays, de las notas de los alumnos, aunque luego no la imprimo
				media = (double)suma/alumnos; 
				if (max<notas[i]){
					max = notas[i];
				}
				
				if (min>notas[i]){
					min = notas[i];
				}
			}
		}
			
		System.out.println("");
		System.out.println("La media es "+media);
		System.out.println("La nota maxima es "+max);
		System.out.println("La nota minima es "+min+"\n");
		
		System.out.println("FINAL");
		for(i=0;i<alumnos;i++){
			if (i<alumnos-1){
				System.out.print(notas[i]+", ");
			}
			else{
				System.out.print(notas[i]+"\n");
			}
		}
		System.out.println("ADIOS!!!");
	}
}
