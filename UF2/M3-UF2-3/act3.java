import java.io.*;
 
public class act3 {

    public static int nums(int a, int b,int c, int d){
        int[] myArray = {a*b, a*c, a*d, d*b, d*c, c*b};
        int hola=0;
        for (int j=0;j<4;j++){
            if (j==0){
                hola = myArray[0];
            }
            else if (myArray[j]>hola){
                hola = myArray[j];
            }
        }
        return hola;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //######DEFINO LAS VARIABLES ######
        int array[] = new int[4];
        //#################################

        System.out.print( "============ EL NUMERO MAYOR :) ============= \n");

        for (int i=0;i<4;i++){
            System.out.print("Ingrese un numero "+ (i+1) +": ");
			String nota1 = reader.readLine();
            array[i] = Integer.parseInt(nota1);
        }
        int benito = nums(array[0],array[1],array[2],array[3]);
        System.out.println("El maximo es: "+benito);
    }
}