package UF2;

import java.io.*;

 
public class ex{
    //variables única para todas las instancias (objetos) de la clase (ocupa un único lugar en memoria)
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static int i,contador=0;

  public static void main(String[] args) throws IOException {
      char [] palabra=new char[15];

      //le asigno a palabra lo que recibe de la funcion que pregunta en este caso getpalabra()  
      palabra=getpalabra();

      //envia todo lo que es palabra a compararcaracteres
      compararcaracteres(palabra);
    }

    //funcion encargada de preguntar la palabra y retornarla a la array de caracteres
    public static char[] getpalabra() throws IOException{
        System.out.printf("Diguem una paraula?: ");

        return reader.readLine().toCharArray();
    }

    //es la funcion encargada de comparar los caracteres
    public static void compararcaracteres (char [] palabra){

        for (i = 0 ;i < palabra.length ; i++){
            if (palabra[i]=='a'){
                contador++;
                if (contador>=3){    
                    verinfo(palabra[i], palabra, contador);
                    break;
                }
            }
            if (palabra[i]=='e'){
                contador++;
                if (contador>=3){    
                    verinfo(palabra[i], palabra, contador);
                   break;
               }
            }
            if (palabra[i]=='i'){
                contador++;
                if(contador>=3){
                    verinfo(palabra[i], palabra, contador);
                break;
                }
            }
            if (palabra[i]=='o'){
                contador++;
                if(contador>=3){
                    verinfo(palabra[i], palabra, contador);
                break;
                }
            }
            if (palabra[i]=='u'){
                contador++;
                if(contador>=3){
                    verinfo(palabra[i], palabra, contador);
                break;
                }
            }
        }
    }

    //esta solo hace de printer
    public static void verinfo(char letra, char[] palabra, int contador){
        System.out.print("el nom de ");
        for (i = 0 ;i < palabra.length ; i++){
            System.out.print(palabra[i]); 
        }
        System.out.print(" conte " + contador + " " +letra);
    }
    //end
}