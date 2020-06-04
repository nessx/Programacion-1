package UF2;

import java.io.*;

/**
 *Este programa lo que hace es recibir una entrada de una palabra y devuelve una cuenta de cuantas vocales tiene

 * @author: Nestor Santana

 * @version: V1.0
 * @see <a href="https://github.com/nessx/Programacion-1/tree/master/RECUPERACION%20M5/UF2">GitHub</a>
 */
 
public class M5_UF2_RECUPERATION{
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static int i, acontador=0, econtador = 0, icontador = 0, ocontador = 0, ucontador = 0, counter = 0 ;

    public static void main(String[] args) throws IOException {
        char [] palabra=new char[15];
      
        //le asigno a palabra lo que recibe de la funcion que pregunta en este caso getpalabra()  
        palabra=getpalabra();

        //envia todo lo que es palabra a compararcaracteres
        compararcaracteres(palabra);
    }
     /**

     * Metodo que devuelve la palabra introducida por el usuario

     * @return La palabra introducida por el usuario.

     */
    //funcion encargada de preguntar la palabra y retornarla a la array de caracteres
    public static char[] getpalabra() throws IOException{
        System.out.printf("Diguem una paraula?: ");
        return reader.readLine().toCharArray();
    }
    /**
     * Metodo que compara los caracteres recibidos por del metodo getpalabra

     * @param palabra recibe toda la informacion dentro de la array de caracteres

     */
    //es la funcion encargada de comparar los caracteres
    public static void compararcaracteres (char [] palabra){
        try {
            for (int i = 0 ;i < palabra.length ; i++){
                if (palabra[i]=='a'){
                    acontador++;
                    if (acontador>=1 && i == palabra.length-1){  
                        counter++;  
                        verinfo(palabra[i], palabra, acontador, counter);
                    }
                }
                if (palabra[i]=='e'){
                    econtador++;
                    if (econtador>=1){   
                        counter++;   
                        verinfo(palabra[i], palabra, econtador, counter);
                    }
                }
                if (palabra[i]=='i'){
                    icontador++;
                    if(icontador>=1){
                        counter++;  
                        verinfo(palabra[i], palabra, icontador, counter);
                    }
                }
                if (palabra[i]=='o'){
                    ocontador++;
                    if(ocontador>=1){
                        counter++;  
                        verinfo(palabra[i], palabra, ocontador, counter);
                    }
                }
                if (palabra[i]=='u'){
                    ucontador++;
                    if(ucontador>=1){
                        counter++;  
                        verinfo(palabra[i], palabra, ucontador, counter);
                    }
                }
            }
        }catch (Exception e) {
            System.out.println("Algo funciona mal...");
        }
    }
    /**
    * Metodo que imprime la comparacion
    
    * @param letra Recibe la letra introducida

    * @param palabra Recibe toda la informacion dentro de la array de caracteres

    * @param count Recibe un contador

    * @param counter Recibe un contador

    */
    //esta solo hace de printer
    public static void verinfo(char letra, char[] palabra, int count, int counter){
        try {
            if (counter == 1) {
                System.out.print("La palabra");
            }
            System.out.print(" ");
            for (int i = 0 ;i < palabra.length ; i++){
                System.out.print(palabra[i]); 
            }
            if (counter > 1) {
                System.out.println(" tiene " +count + " "+letra);
            }else{
                System.out.println(" tiene " +count + " "+letra);
            }
        }catch (Exception e) {
            System.out.println("Algo funciona mal con la impresion...");
        }
    }
    //fin
}