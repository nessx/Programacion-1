import java.io.*;

class main2 {
public static void main(String[] args) throws IOException {
int i,r,n;
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Entra número ");
n = Integer.parseInt(reader.readLine());
while(n<=0){
System.out.print("Error");
System.out.print("Entra: ");
n = Integer.parseInt(reader.readLine());
}
r=1;
i=1;
while(i<=n){
r=r*i;
i++;
}
System.out.println(r);
}
}