import java.io.*;
 
public class act14{
	
	public static void main(String[] args) throws IOException {
		int D;
		int i =0;
		int f =0;
		int u =0;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Introduce un numero: ");
		String D1 = reader.readLine();
		D = Integer.parseInt(D1);
		if (D<=0){
			System.out.print("El numero de repeticiones tiene ser mayor que 1");
		}
		else{
			for (u=1;u<=D;u++){
				for (i=1;i<=10;i++){ //mientras se a <= 10 se repite todo el rato y va sumando 1; ya que estas viendo esto acuerdate de comentar.
					for (f=1;f<=10-i;f++){ //acuerdate que i en este caso son las filas, se que te poner nervioso pero el primer for sienpre son las filas ok?
						System.out.print(".");
					}
					for (f=10-i;f<=9;f++){ //f=10-i a f quitandole la fila
						System.out.print(f);
					}
					for (f=8;f>=10-i;f--){
						if (i != 1){
							System.out.print(f);
						}
					}
					for (f=10-i;f>=1;f--){ //es lo mismo, para completar la otra fila, pero intercambias el valor del medio por el primero
						System.out.print(".");
					}
					System.out.println("");
				}
				
			}
		}
	}
}
