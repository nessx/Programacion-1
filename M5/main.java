 
import java.io.*;
import java.sql.*;

public class main{
	public static void main(String[] args) throws IOException {
			
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduce tu Nombre y tu Apellido: ");
		String nombre = reader.readLine();
		
		// Texto que vamos a buscar
		String sTextoBuscado = " ";
		
		// Contador de ocurrencias 
	    int contador = 0;
	    int cont=0;
	    
	    //cuento todas los caracteres
		for (int i=0;i<nombre.length();i++){
			cont++;
		}
		
		while (nombre.indexOf(sTextoBuscado) > -1) {
	      nombre = nombre.substring(nombre.indexOf(sTextoBuscado)+sTextoBuscado.length(),nombre.length());
	      contador++; 
	    }
	    int ntotal = cont - contador;
			
		while (ntotal>50){
			// Texto que vamos a buscar
			sTextoBuscado = " ";
			
			// Contador de ocurrencias 
			contador = 0;
			cont=0;
			
			System.out.println("El campo Nombre y Apellidos no puede contener mas de 50 caracteres\n");
			System.out.print("Introduce tu Nombre y tu Apellido: ");
			nombre = reader.readLine();
			
			//cuento todas los caracteres
			for (int i=0;i<nombre.length();i++){
				cont++;
			}
			
			while (nombre.indexOf(sTextoBuscado) > -1) {
			  nombre = nombre.substring(nombre.indexOf(sTextoBuscado)+sTextoBuscado.length(),nombre.length());
			  contador++; 
			}
			
			ntotal = cont - contador;
		}
		
		System.out.print("Introduce tu Edad: ");
		String B1 = reader.readLine();
		int edad = Integer.parseInt(B1);
		
		while (edad<18 || edad >120){
			if (edad<18){
				System.out.println("Tienes que ser mayor que 18!!");
			}
			else if (edad>120){
				System.out.println("WTF!!, Como tienes mas de 120 años???");
			}
			System.out.print("Introduce tu Edad: ");
			B1 = reader.readLine();
			edad = Integer.parseInt(B1);
			
		}
		
		System.out.print("Introduce tu Sexo (M/F): ");
		String S = reader.readLine();
		
		while (!(S.equals("F") || S.equals("M") || S.equals("f") || S.equals("m"))){
			System.out.println("una de las dos opciones please :)");
			System.out.print("Introduce tu Sexo (M/F): ");
			S = reader.readLine();
		}
		System.out.println("Los datos se han introducido correctamente!");
		
	}
}