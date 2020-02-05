import java.io.*;
public class main3 {
    public static void main (String[] args) throws IOException  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float a,b,c,d,v1;String str;
        b=0;
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
            a = Float.parseFloat(str);
            while(a>10 || a<0){
            System.out.println("ERROR");
            System.out.print("Introdueix "+(i+1)+": ");
            str = reader.readLine();
            a = Float.parseFloat(str);
            }
            v[i]=a;
        }

      for(int i=0;i<=v.length-1;i++){
            v1 = v[i];
            b = b + v1;
      }

      c=v[0];
      d=v[0];
      for(int i=0;i<v.length;i++){
        v1 = v[i];
          if(v1>c){
              c=v[i];
          }
          if(v1<d){
              d=v[i];
          }
      }
      
      System.out.println();
      for(int i=0;i<v.length;i++){
            System.out.print(v[i]+", ");
        }
      System.out.println();
       //Imprimir 
        System.out.println("Mitja: "+b/v.length);
        System.out.println("Pitjor: "+c);
        System.out.println("Millor: "+d);
      }
}
