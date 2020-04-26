package c1;

import java.io.*;

public class ex1 {
    public static void main(String[] args) throws IOException, InterruptedException {
        int hor,min,seg;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        eex1 reloj1 = new eex1();

        System.out.print("introduce las horas ");
        String hor2 = reader.readLine();
        hor = Integer.parseInt(hor2);  // conversió de String a float
        reloj1.sethora(hor);

        System.out.print("introduce los minutos ");
        String min2 = reader.readLine();
        min = Integer.parseInt(min2);  // conversió de String a float
        reloj1.setminutos(min);

        System.out.print("introduce los segundos ");
        String seg2 = reader.readLine();
        seg = Integer.parseInt(seg2);  // conversió de String a float
        reloj1.setsegundos(seg);

        while(reloj1.getfin()){
            System.out.println(reloj1.toString());
            reloj1.incrementa();
        }
    }

}