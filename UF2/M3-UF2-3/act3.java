import java.io.*;
 
public class act3 {

    public static int [] nums(int a, int b,int c, int d){
        int[] myArray = {a*b, a*c, a*d, d*b, d*c, c*b};
        return();
    }


    public static int numeros(int a, int b, int c, int d){
        for (int i=0;i<3;i++){
            int[] myArray = {a*b, a*c, a*d, d*b, d*c, c*b};
            System.out.print(myArray);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //######DEFINO LAS VARIABLES ######
        int array[] = new int[3];
        //#################################

        System.out.print( "============ SUMA HORA MINUTOS Y SEGUNDOS ============= \n");

        for (int i=0;i<4;i++){
            System.out.print("Ingrese un numero"+ (i+1) +": ");
			String nota1 = reader.readLine();
			array[i] = Integer.parseInt(nota1);
        }

    }
}