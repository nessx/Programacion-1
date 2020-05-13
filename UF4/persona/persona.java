package persona;

import java.io.*;

public class persona {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        clases personas = new clases();

        System.out.print("introduce el nombre y el apellido de la persona: ");
        String nombres = reader.readLine();

        System.out.print("introduce el año de nacimiento ");
        String naci1 = reader.readLine();
        int naci = Integer.parseInt(naci1);
        personas.setnacimiento(naci);
        
        while (personas.getcompr()){
            System.out.println("Fecha de nacimiento incorrecta o invalida!");

            System.out.print("introduce el año de nacimiento ");
            naci1 = reader.readLine();
            naci = Integer.parseInt(naci1);
            personas.setnacimiento(naci);
        }
        

        System.out.print(personas.getnacimiento());
    }

}