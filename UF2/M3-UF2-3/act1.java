import java.io.*;
 
public class act1 {

    public static int [] hora(int defs){
        //#### DEVUELVE HORAS SEGUNDOS Y MINUTOS #######
        int defmin = 0;
        int defhoras = 0;
        while (defs > 50){
            if (defs > 59){
                defs -= 60;
                defmin += 1;
            }
            if (defmin > 59){
                defmin -= 60;
                defhoras += 1;
            }
        }
        int hour []= {defhoras, defmin, defs};
        return hour;
    }

    public static int segundos(int defseg, int defmin, int defhoras){

        while (defhoras!=0){
            if (defhoras>0){
                defhoras -= 1;
                defmin += 60;
            }
        }
        while (defmin!=0){
            if (defmin>0){
                defmin -= 1;
                defseg += 60;
            }
        }
        return defseg;

    }
    public static void impr(){
        System.out.println( "====== CONVERSOR ======\n");
        System.out.println( "1. Conversor de Segundos a Horas Minutos y Segundos");
        System.out.println( "2. Conversor de Horas Minutos y Segundos a Segundos");
        System.out.println( "3. Salir\n");
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //######DEFINO LAS VARIABLES ######
        int [] houra;
        int seg = 0;
        int horas = 0;
        int min = 0;
        //#################################

        //LA KEY ES IGUAL A 1 PARA OBLIGAR AL USUARIO A ENTRAR AL WHILE
        int key = 1;
        impr();
        int m =0 ,h = 0;
        int opc;

        //PRIMERA PREGUNTA
        System.out.print("Que desea hacer?: ");
        String opc2 = reader.readLine();
        opc = Integer.parseInt(opc2);

        //LA SALIDA DEL WHILE
        while (key != 2){

        //#OPCION 1
            if (opc == 1){
                System.out.print( "============ DE SEGUNDOS A HORAS MINUTOS Y SEGUNDOS ============= \n");
                System.out.print("Indroduce los segundos: ");
                String s2 = reader.readLine();
                int s = Integer.parseInt(s2);

                houra=hora(s); //falta meterlo en otro array aparte del que ya existe
                System.out.println(houra[0]+":"+houra[1]+":"+houra[2]);

                key = 2; //para salir del while es provisional
            }
            //#OPCION 2
            else if (opc == 2){
            System.out.print( "============ DE HORA MINUTOS Y SEGUNDOS A SEGUNDOS ============= \n");

                //RECOGIDA HORAS
                System.out.print("Indroduce las horas: ");
                String H2 = reader.readLine();
                int H = Integer.parseInt(H2);

                //RECOGIDA MINUTOS
                System.out.print("Indroduce los minutos: ");
                String M2 = reader.readLine();
                int M = Integer.parseInt(M2);

                //RECOGIDA SEGUNDOS
                System.out.print("Indroduce los segundos: ");
                String S2 = reader.readLine();
                int S = Integer.parseInt(S2);

                S=segundos(S,M,H);

                System.out.print("");
                System.out.println(S+" Segundos");

                key = 2; //para salir del while es provisional
            }
            //#OPCION 3 
            else if (opc == 3){
                System.out.println( "======== HAS ELEGIDO SALIR ========\n");
                System.out.println( "ADIOS....\n");
                key = 2;
            }

            //#SI EL USUARIO NO PONE UNA DE LAS TRES OPCIONES LE LANZARA UN ERROR Y LE VONVERA A PREGUNTAR
            else {
                System.out.println("------------------------------------------------------------------------------");
                System.out.println( "\n###### La opcion selecionada no pertenece a ninguna operacion :) ######\n");
                System.out.println( "------------------------------------------------------------------------------");
                impr();
                System.out.print("\nQue desea hacer?:  ");
                String opc3 = reader.readLine();
                opc = Integer.parseInt(opc3);
            }
        }
    }
}
