import java.io.*;  

public class hola {  
    public static void main(String args[]){    
         try{
            Reader reader = new FileReader("01001c.csv");
            int datos = reader.read();
            FileWriter fw=new FileWriter("projecte2.sql");
            while(datos != -1){
              System.out.print((char) datos);
              datos = reader.read();
              fw.write(datos);
            } 
            fw.close();
            reader.close();
          }catch(Exception e){
            System.out.println("ERROR"); 
          }   
     }    
}  