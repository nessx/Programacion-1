package UF2;

import java.io.*;

 
public class ex{
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static int i,contador=0;

  public static void main(String[] args) throws IOException {
      char [] palabra=new char[15];

      palabra=getpalabra();
      compararcaracteres(palabra);
    }

    //funcion encargada de preguntar la palabra y retornarla
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

            //testeo de switch es una prueba no es definitivo
            /*
            char word = palabra[i]; 
            switch(word){ 
                case 'a':
                    contador++;
                    verinfo(palabra[i], palabra, contador);
                    break; 
                case 'e':
                    contador++;
                    verinfo(palabra[i], palabra, contador); 
                    break; 
                case 'i':
                    contador++;
                    verinfo(palabra[i], palabra, contador); 
                    break;
                case 'o': 
                    contador++;
                    verinfo(palabra[i], palabra, contador); 
                    break;
                case 'u':
                    contador++;
                    verinfo(palabra[i], palabra, contador); 
                    break;
                default: 
                    System.out.print("Vocal no valida"); 
            }*/
        }
    }

    //esta solo hace de printer
    public static void verinfo(char letra, char[] palabra, int contador){

        System.out.println("el nom de "+ palabra + " conte " + contador + " " +letra);
    }
}