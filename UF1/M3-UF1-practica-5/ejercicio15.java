import java.io.*;
 
public class ejercicio15{
	
  public static void main(String[] args) throws IOException {
    int SEG;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Introduce los segundos: ");
    String SEG1 = reader.readLine();
    SEG = Integer.parseInt(SEG1);  // conversió de String a float
    int H = SEG/3600;
    int M = SEG/60;
    System.out.println(H + " Horas" );
    System.out.println(M + " Minutos");
    System.out.println(SEG + " Segundos");
  }
}
