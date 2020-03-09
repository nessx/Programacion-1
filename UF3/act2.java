import java.io.*;
 
public class act2{

	public static void main(String[] args) throws IOException {
		int alumnos, i, search, j, preg; //declaro y inicializo la variable alumnos y la i a la vez, para que el programa sea mas corto
		int suma= 0; //declaro y inicializo la variable suma con un valor de 0
		int pos = 0;
		int cont = 0;
		int min = 0;
		int max = 0;
		int media = 0;
		
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
		//defino y inicializo las arrays, con el valor de alumnos
		
		int notas[] = new int[alumnos];
		int posiciones[] = new int[alumnos];
		
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
		
		//mostrar notas iniciales
		System.out.print("\033[H\033[2J");  //en windows no me funciona esto de hacer el flush no se si en Linux si
		System.out.flush();
		System.out.println("Ha introducido\n");
		for(i=0;i<alumnos;i++){
			if (i<alumnos-1){
				System.out.print(notas[i]+", ");
			}
			else{
				System.out.println(notas[i]);
			}
		}
		
		//SECCION DE LA OPCION 3
		int modal = 0;
		int nuevan = 0;
		System.out.print("\033[H\033[2J");  //en windows no me funciona esto de hacer el flush no se si en Linux si
		System.out.flush();
		System.out.println("######## NOTAS ########\n");
		for(i=0;i<notas.length;i++){
			pos +=1;
			System.out.println("La nota del alumno"+(i+1)+" es "+notas[i]);
		}
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
			media = suma/notas.length; 
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
		
		System.out.println("######## NOTAS ########\n");
		for(i=0;i<notas.length;i++){
			pos +=1;
			System.out.println("La nota del alumno"+(i+1)+" es "+notas[i]);
		}
	}
}
