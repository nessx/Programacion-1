import java.io.*;
 
public class act2 {

    public static int [] hora(int defhoras, int defmin,int defs){
        //#### DEVUELVE HORAS SEGUNDOS Y MINUTOS #######
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
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //######DEFINO LAS VARIABLES ######
        int [] houra;
        //#################################

        //LA KEY ES IGUAL A 1 PARA OBLIGAR AL USUARIO A ENTRAR AL WHILE
        //#OPCION 1
        System.out.print( "============ SUMA HORA MINUTOS Y SEGUNDOS ============= \n");

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

        //SEGUNDA RECOGIDA DE DATOS
        System.out.print("\n");
        System.out.println("SEGUNDA RONDA :)");
        System.out.print("\n");

        //RECOGIDA HORAS2
        System.out.print("Indroduce las horas: ");
        String H3 = reader.readLine();
        H+= Integer.parseInt(H3);

        //RECOGIDA MINUTOS2
        System.out.print("Indroduce los minutos: ");
        String M3 = reader.readLine();
        M+= Integer.parseInt(M3);

        //RECOGIDA SEGUNDOS2
        System.out.print("Indroduce los segundos: ");
        String S3 = reader.readLine();
        S+= Integer.parseInt(S3);
        

        houra=hora(S,M,H);

        System.out.print("\n");
        System.out.println("RESULTADO: "+H+":"+M+":"+S);
        

    }
}
