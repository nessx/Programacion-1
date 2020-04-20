package act9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class estatgat {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        GatPersa renat = new GatPersa();

        boolean bool = true;

        while (bool){
            System.out.println("\nMiau!, soy el gato renat, que quieres que haga?");
            System.out.println("0. tirarme de un edificio");
            System.out.println("1. levantarse");
            System.out.println("2. sentarse");
            System.out.println("3. estirarse\n");

            System.out.print("-> ");
            String opt1 = reader.readLine();
            int opt = Integer.parseInt(opt1);

            switch(opt) {
                case 0 :
                    renat.test();
                    bool=false;
                    break;
                case 1 :
                    renat.aixecat();
                    break; 
                case 2 :
                    renat.seu();
                    break; 
                case 3 :
                    renat.estirat();
                    break;
                default :
                    System.out.print("== Lo siento no puedo hacer eso. :( ==\n");
            }
        }
    }
}