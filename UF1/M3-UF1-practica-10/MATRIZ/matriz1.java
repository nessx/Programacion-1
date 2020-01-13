public class matriz1 {
 
    public static void main(String[] args) {
         
        int matriz[][]=new int[5][4];
         
        //i = filas y j = columnas
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                matriz[i][j]=(i*matriz.length)+(j+1);
                //System.out.print(matriz[i][j]+" "); //imprimir los valores en numero que hay dentro de las arrays
                System.out.print(1+"  "); //imprimo basicamente 1 para los 2 for
                 
            }
            System.out.println(""); //salto de linea en blanco
        }
         
    }
     
}
