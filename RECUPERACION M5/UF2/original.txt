import java.io.*;

 
public class p{
  public static void main(String[] args) throws IOException {
	  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      
       char [] string=new char[15];
        int i,xyz=0,n=0,contador=1;
        
        System.out.printf("Diguem una paraula?\n");
        
        string=reader.readLine().toCharArray();
        
        for (i=0;string.length>i-2;i++){
            if (string[i]=='a'){
                xyz++;
                if (xyz>=3){    
                    System.out.printf("el %s conte %d a",string,xyz);
                    break;
                }
            }
            if (string[i]=='e'){
                n++;
                if (xyz>=3){    
                    System.out.printf("el %s conte %d e",string,xyz);
                   break;
       }            }
            if (string[i]=='i'){
				xyz++;
				if(xyz>=3){
				System.out.printf("el nom de %s conte %d i",string,xyz);
				break;
				}
			}
            if (string[i]=='o'){
				xyz++;
				if(xyz>=3){
				System.out.printf("el nom de %s conte %d o",string,xyz);
				break;
				}
			}
			if (string[i]=='u'){
				xyz++;
				if(xyz>=3){
				System.out.printf("el nom de %s conte %d u",string,xyz);
				break;
				}
			}
        }

}}