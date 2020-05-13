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

        System.out.print(nombres+" Esta vivo/a (Y/N)? ");
        String res = reader.readLine();

        if (res.equals("N") || res.equals("n")) {

            System.out.print("introduce el año de defuncion: ");
            String def1 = reader.readLine();
            int def = Integer.parseInt(def1);
            personas.setViu(def);
        }
        

        System.out.println("nacimiento "+personas.getnacimiento());
        System.out.print("defuncion "+personas.getdefuncion());
    }

}