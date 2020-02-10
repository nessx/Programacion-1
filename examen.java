import java.io.*;


public class examen {
        
    public static String [] entradanombres(int defnum) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String funnoms [] = new String [defnum];
        for (int i=0;i<defnum;i++){
            System.out.print("Dime un nombre: "+(i+1)+":");
            funnoms[i] = reader.readLine();
        }

        return funnoms;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //String numnombres;
        int numnombre;

        //RECOGIDA DE DATOS
        System.out.print("Indroduce el numero de nombres a introducir: ");
        String numnombre1 = reader.readLine();
        numnombre = Integer.parseInt(numnombre1);

        String nombres [];
        
        nombres = entradanombres(numnombre);

        System.out.print("\n");
        for (int i=0;i<numnombre;i++){
            System.out.print(nombres[i]+",");
        }
    }
}