import java.io.*;
public class act1 {
    public static void main (String[] args) throws IOException  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float nota,media,nalta,nbaja;String str;
        media=0;

        System.out.print("Quanta gent: ");
        String text= reader.readLine();
        int as = Integer.parseInt(text);

        while(as>50 || as<1){
            System.out.println("ERROR");
            text= reader.readLine();
            as = Integer.parseInt(text);
        }

        float v[];v = new float[as];
        for(int i=0;i<v.length;i++){
            System.out.print("Introdueix "+(i+1)+": ");
            str = reader.readLine();
            nota = Float.parseFloat(str);
            
            while(nota>10 || nota<0){
                System.out.println("ERROR");
                System.out.print("Introdueix "+(i+1)+": ");
                str = reader.readLine();
                nota = Float.parseFloat(str);
            }
            v[i]=nota;
            System.out.println(v[i]);
        }

        for(int i=0;i<=v.length-1;i++){
            float v1 = v[i];
            media = media + v1;
        }

        nalta=v[0];
        nalta=v[0];
        for(int i=0;i<v.length;i++){
            float v1 = v[i];
            if(v1>nalta){
                nbaja=v[i];
            }
            if(v1<nbaja){
                nbaja=v[i];
            }
        }

        System.out.println();
        for(int i=0;i<v.length;i++){
            System.out.print(v[i]+", ");
        }

        System.out.println();
        //Imprimir 
        System.out.println("Mitja: "+media/v.length);
        System.out.println("Pitjor: "+nbaja);
        System.out.println("Millor: "+nalta);
    }
}