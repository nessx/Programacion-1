import java.io.*;

public class CSVReader {

    public static void main(String[] args) {

        String csvFile = "01001c.csv";
        BufferedReader br = null;
        String line = "";

        try {
            br = new BufferedReader(new FileReader(csvFile));
            FileWriter escritor=new FileWriter("projecte2.sql");

            while ((line = br.readLine()) != null) {

                String[] country = line.split(",");
                
                escritor.write("INSERT INTO `datos` (dato1, dato2, dato3, dato4, dato5, dato6, dato7) VALUES"+"("+country[0]+","+ country[1] + "," + country[2] + "," + country[3] + "," + country[4] + "," + country[5]+ "," + country[6]+");\n");

                //test
                System.out.println(country[0]+","+ country[1] + "," + country[2] + "," + country[3] + "," + country[4] + "," + country[5] + "," + country[6]);
            }
            escritor.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}