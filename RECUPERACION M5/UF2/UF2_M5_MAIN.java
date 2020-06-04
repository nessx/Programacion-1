package UF2;

import java.io.*;

/**

 *Este programa lo que hace es recibir una entrada de una palabra y devuelve una cuenta de cuantas vocales tiene

 * @author: Nestor Santana

 * @version: V1.0

 */
 
public class UF2_M5_MAIN{
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
     /**

     * Método que devuelve el número de ítems (números aleatorios) existentes en la serie

     * @return La palabra introducida por el usuario.

     */
    public static char[] getpalabra() throws IOException{
        System.out.printf("Diguem una paraula?: ");
        return reader.readLine().toCharArray();
    }

    //es la funcion encargada de comparar los caracteres
    /**
     * Constructor para la serie de números aleatorios

     * @param palabra recibe toda la informacion dentro de la array de caracteres

     */
    public static void compararcaracteres (char [] palabra){
        try {
            for (i = 0 ;i < palabra.length ; i++){
                if (palabra[i]=='a'){
                    contador++;
                    if (contador>1){    
                        verinfo(palabra[i], palabra, contador);
                        break;
                    }
                }
                if (palabra[i]=='e'){
                    contador++;
                    if (contador>1){    
                        verinfo(palabra[i], palabra, contador);
                        break;
                    }
                }
                if (palabra[i]=='i'){
                    contador++;
                    if(contador>1){
                        verinfo(palabra[i], palabra, contador);
                        break;
                    }
                }
                if (palabra[i]=='o'){
                    contador++;
                    if(contador>1){
                        verinfo(palabra[i], palabra, contador);
                        break;
                    }
                }
                if (palabra[i]=='u'){
                    contador++;
                    if(contador>1){
                        verinfo(palabra[i], palabra, contador);
                        break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Algo funciona mal...");
        }
    }
    
    //esta solo hace de printer
    /**
    * Constructor para la serie de números aleatorios
    
    * @param letra Recive la letra introducida

    * @param palabra Recibe toda la informacion dentro de la array de caracteres

    * @param contador Recibe el contador

    */
    public static void verinfo(char letra, char[] palabra, int contador){
        try {
            System.out.print("el nom de ");
            for (i = 0 ;i < palabra.length ; i++){
                System.out.print(palabra[i]); 
            }
            System.out.print(" conte " + contador + " " +letra);
        } catch (Exception e) {
            System.out.println("Algo funciona mal con la impresion...");
        }
    }
    //fin
}