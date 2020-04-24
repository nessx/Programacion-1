import java.io.*;
import java.util.logging.*;


public class project {

    public static void main(String[] args) {
        //declaracion y inicializacion de variables
        BufferedReader br = null;
        String line = "";
        boolean key = true;
        

        //archivo log
        Logger logger = Logger.getLogger("MyLog");  
        FileHandler fh; 

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            //area del log
            fh = new FileHandler("file.log");  
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();  
            fh.setFormatter(formatter);
            //END
            
            System.out.print("Cual es el nombre del archivo csv (sin extension)?: ");
            String file = reader.readLine();

            //comprobacion de existencia del archivo
            File f = new File(file+".csv");

            while (key){

                if(!f.exists()){
                    System.out.println("El archivo "+f+" no existe!!");
    
                    System.out.print("Cual es el nombre del archivo csv (sin extension)?: ");
                    file = reader.readLine();
                    f = new File(file+".csv");
                }
                else{
                    key=false;
                }
            }
            //END

            
            //Preguntas
            System.out.print("Que nombre desea darle al archivo sql (sin extension): ");
            String salidasql = reader.readLine();
            
            System.out.print("Como le quiere llamar a la base de datos?: ");
            String bbddname = reader.readLine();

            System.out.print("Como le quiere llamar a la tabla?: ");
            String tablename = reader.readLine();
            
            String csvFile = file+".csv";
            br = new BufferedReader(new FileReader(csvFile));
            //END

            //crear el archivo sql
            FileWriter escritor=new FileWriter(salidasql+".sql");

            //informo en el archivo log que el fichero se ha creado correctamente
            logger.log(Level.INFO, "El archivo "+salidasql+".sql"+" ha sido creado correctamente!!");

            //Crear base de datos
            escritor.write("CREATE DATABASE "+bbddname+";\n");

            //informo en el archivo log que la base de datos se ha creado correctamente
            logger.log(Level.INFO, "La base de datos "+bbddname+" ha sido creada correctamente!!");

            //uso la base de datos 
            escritor.write("USE `"+bbddname+"`;\n");

            //creando tablas
            escritor.write("CREATE TABLE `"+tablename+"` (\n");
            escritor.write("`id` int(11) NOT NULL AUTO_INCREMENT,\n");
            escritor.write("`anos` int (11) NOT NULL,\n");
            escritor.write("`dato1` decimal(6,3) NOT NULL,\n");
            escritor.write("`dato2` int (11) NOT NULL,\n");
            escritor.write("`dato3` decimal(6,3) NOT NULL,\n");
            escritor.write("`dato4` int (11) NOT NULL,\n");
            escritor.write("`dato5` decimal(6,3) NOT NULL,\n");
            escritor.write("`dato6` int (11) NOT NULL,\n");
            escritor.write("PRIMARY KEY (`id`));\n");

            //informo en el archivo log que la tabla se ha creado correctamente
            logger.log(Level.INFO, "La tabla "+tablename+" ha sido creada correctamente!!");

            //loop para repetir las tablas
            while ((line = br.readLine()) != null) {

                String[] datos = line.split(",");
                try{
                    //insertar tablas
                    escritor.write("INSERT INTO `"+tablename+"` (anos, dato1, dato2, dato3, dato4, dato5, dato6) VALUES"+" ("+datos[0].trim()+","+ datos[1] + "," + datos[2] + "," + datos[3] + "," + datos[4] + "," + datos[5]+ "," + datos[6]+");\n");
                }
                catch(ArrayIndexOutOfBoundsException excepcion){
                    System.out.println(" Error de índice en un array");
                    logger.log(Level.WARNING, "Error de índice en un array");
                    continue;
		         }
            }

            //informo en el archivo log que los datos se han insertado correctamente
            logger.log(Level.INFO, "Los datos se han insertado correctamente en la tabla "+tablename);

            System.out.println("EL PROGRAMA SE HA EJECUTADO CORRECTAMENTE!!");
            escritor.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            logger.log(Level.WARNING, "Ocurrio un error de acceso en 0xFF");
        } catch (IOException e) {
            e.printStackTrace();
            logger.log(Level.WARNING, "Se ha producido un error en la entrada/salida");
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    logger.log(Level.WARNING, "Se ha producido un error en la entrada/salida");
                }
            }
        }

    }

}