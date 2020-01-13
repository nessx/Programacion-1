import java.io.*;
 
public class ex10{
	
	public static void main(String[] args) throws IOException {
		int alumnos, i, search; //declaro y inicializo la variable alumnos y la i a la vez, para que el programa sea mas corto
		int cont = 0;
		
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
		System.out.println("INICIAL\n");
		for(i=0;i<alumnos;i++){
			if (i<alumnos-1){
				System.out.print(notas[i]+", ");
			}
			else{
				System.out.println(notas[i]);
			}
		}
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
					System.out.print(posiciones[i]);
				}
			}
		}
	}
}
