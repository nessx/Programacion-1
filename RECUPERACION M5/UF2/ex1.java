package UF2;

import java.io.*;

 
public class ex1{
  public static void main(String[] args) throws IOException {
	  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      
       char [] paraula=new char[15];
       int i,acontador=0,econtador=0,icontador=0,ocontador=0,ucontador=0;

        System.out.printf("Diguem una paraula?: ");
        paraula=reader.readLine().toCharArray();
        
        for (i=0;paraula.length>i;i++){
            if (paraula[i]=='a'){
                acontador++;
                if (acontador>0){    
                    System.out.printf("el %s conte %d a\n",paraula[i],acontador);
                }
            }if (paraula[i]=='e'){
                econtador++;
                if (econtador>0){    
                    System.out.printf("el %s conte %d e\n",paraula[i],econtador);
                }        
            }if (paraula[i]=='i'){
				icontador++;
				if(icontador>0){
                    System.out.printf("el nom de %s conte %d i\n",paraula[i],icontador);
				}
			}if (paraula[i]=='o'){
				ocontador++;
				if(ocontador>0){
                    System.out.printf("el nom de %s conte %d o\n",paraula[i],ocontador);
				}
			}if (paraula[i]=='u'){
				ucontador++;
				if(ucontador>0){
                    System.out.printf("el nom de %s conte %d u\n",paraula[i],ucontador);
				}
			}
        }
    }
}