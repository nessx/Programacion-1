import java.io.*;
 
public class ex11{
	
	public static void main(String[] args) throws IOException {
		int alumnos, i, search, j, preg; //declaro y inicializo la variable alumnos y la i a la vez, para que el programa sea mas corto
		int suma= 0; //declaro y inicializo la variable suma con un valor de 0
		int pos = 0;
		int cont = 0;
		int min = 0;
		int max = 0;
		int media = 0;
		int key = 1;
		
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
		while (key != 0){
			System.out.println("######## MENU ########");
			System.out.println("1-Media");
			System.out.println("2-Mostrar todas las notas");
			System.out.println("3-Corregir nota");
			System.out.println("4-Ver estadisticas");
			System.out.println("5-Agregar nueva nota");
			System.out.println("6-Eliminar una nota");
			System.out.println("7-Buscar una nota\n");
			System.out.println("0-Salir");
			
			System.out.print("Que decea hacer: ");
			String preg1 = reader.readLine();
			preg = Integer.parseInt(preg1);
			
			//SECCION DE LA OPCION 1
			if (preg == 1){
				System.out.print("\033[H\033[2J");  //en windows no me funciona esto de hacer el flush no se si en Linux si
				System.out.flush(); 
				System.out.println("######## MEDIA ########\n");
				suma = 0;
				min = 100;
				max = 0;
				media = 0;
				//aca abajo vuelvo a copiar el for para volver a calcular las medias, las maximas y las minimas.
				for(i=0;i<alumnos;i++){
					suma += notas[i]; //La suma de las arrays, de las notas de los alumnos, aunque luego no la imprimo
					media = suma/alumnos; 
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
			}
			
			//SECCION DE LA OPCION 2
			if (preg==2){
				System.out.print("\033[H\033[2J");  //en windows no me funciona esto de hacer el flush no se si en Linux si
				System.out.flush(); 
				System.out.println("######## NOTAS ########\n");
				for(i=0;i<notas.length;i++){
					pos +=1;
					System.out.println("La nota del alumno"+(i+1)+" es "+notas[i]);
				}
			}
			
			//SECCION DE LA OPCION 3
			int modal = 0;
			int nuevan = 0;
			if (preg==3){
				System.out.print("\033[H\033[2J");  //en windows no me funciona esto de hacer el flush no se si en Linux si
				System.out.flush();
				System.out.println("######## CORREGIR NOTA ########");
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
			
			//SECCION DE LA OPCION 4
			int susp= 0;
			int apro= 0;
			min = 100;
			max = 0;
			if (preg==4){
				System.out.print("\033[H\033[2J");  //en windows no me funciona esto de hacer el flush no se si en Linux si
				System.out.flush();
				System.out.println("######## VER ESTADISTICAS ########\n");
				for(i=0;i<notas.length;i++){
					suma += notas[i]; //La suma de las arrays, de las notas de los alumnos, aunque luego no la imprimo
					media = suma/notas.length; 
					if (max<notas[i]){
						max = notas[i];
					}
					
					if (min>notas[i]){
						min = notas[i];
					}
					if (notas[i]>5){
						apro +=1;
					}
					if (notas[i]<5){
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
			
			//SECCION DE LA OPCION 5
			if (preg==5){
				System.out.print("\033[H\033[2J");  //en windows no me funciona esto de hacer el flush no se si en Linux si
				System.out.flush();
				System.out.println("######## AGREGAR NUEVA NOTA ########\n");
				/*System.out.print("En qué posición quieres insertar la nota?: ");
				String modal1 = reader.readLine();
				modal = Integer.parseInt(modal1);
				alumnos +=1;*/
				
				System.out.print("Introduce la nueva nota :");
				String nuevan1 = reader.readLine();
				nuevan = Integer.parseInt(nuevan1);
				while (nuevan<0 || nuevan>10){
					System.out.print("La nota tiene que estar entre un rango de 0 y 10\n");
					System.out.print("Introduce la nueva nota :" );
					String nuevan2 = reader.readLine();
					nuevan = Integer.parseInt(nuevan2);
				}
				
				/*COSAS RECICLADAS AJENAS*/
				for (i=alumnos;i>modal-2;i--){
					notas[i+1] = notas[i];
				}
				notas[modal-1] =nuevan;
				/* HASTA AQUI LLEGA LO RECICLADO*/
				
				suma = 0;
				min = 100;
				max = 0;
				//aca abajo vuelvo a copiar el for para volver a calcular las medias, las maximas y las minimas.
				for(i=0;i<alumnos;i++){
					suma += notas[i]; //La suma de las arrays, de las notas de los alumnos, aunque luego no la imprimo
					media = suma/alumnos; 
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
			//SECCION DE LA OPCION 6
			media = 0;
			min =100;
			max =0;
			if (preg==6){
				System.out.print("\033[H\033[2J");  //en windows no me funciona esto de hacer el flush no se si en Linux si
				System.out.flush();
				System.out.println("######## NOTAS ########\n");
				for(i=0;i<notas.length;i++){
					pos +=1;
					System.out.println("La nota del alumno"+(i+1)+" es "+notas[i]+" y esta en la posicion "+pos);
				}
				System.out.println("######## ELIMINAR NOTA ########\n");
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
					media = suma/alumnos; 
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
			
			//SECCION DE LA OPCION 7
			if (preg==7){
				System.out.print("\033[H\033[2J");  //en windows no me funciona esto de hacer el flush no se si en Linux si
				System.out.flush();
				System.out.println("######## BUSCAR NOTAS ########\n");
				System.out.print("Introduce la nota que desea buscar: ");
				String search1 = reader.readLine();
				search = Integer.parseInt(search1);
				
				for(i=0;i<notas.length;i++){
					if (notas[i] == search){
						posiciones[cont]+=i+1;
						cont +=1;
					}
				}
				
				if (cont == 0){
					System.out.print("No hay ninguna nota con el valor de "+search);
				}
				else if (cont == 1){
					System.out.print("Hay "+cont+" nota con el valor "+search+" en la posicion "+posiciones[0]);
				}
				else if (cont >= 2){
					System.out.print("Hay "+cont+" notas con el valor "+search+" en la posicion ");
					for (i=0;i<=cont;i++){
						if (i<cont-2){
							System.out.print(posiciones[i]+", ");
						}
						if (i==cont-2){
							System.out.print(posiciones[i]+" y ");
						}
						if (i==cont-1){
							System.out.print(posiciones[i]+"\n");
						}
					}
				}
			}
			//SALIR
			if (preg==0){
				key=0;
			}
			else{
				key = 1;
			}
		}
	}
}
