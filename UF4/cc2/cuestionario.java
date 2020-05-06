package cc2;
import java.io.*;

public class cuestionario {
    public static void main(String[] args) throws IOException, InterruptedException {
        String nom, cognom;
        int any;
        int anyd= -1;
        int anyAct = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        persona perso = new persona();

        System.out.print("introduce el nombre: ");
        nom = reader.readLine();
        perso.setnom(nom);

        while (perso.comprovacio(nom)){
            System.out.println("El nombre no puede estar vacio!!");

            System.out.print("introduce el nombre: ");
            nom = reader.readLine();
            perso.setnom(nom);
        }

        System.out.print("introduce el apellido: ");
        cognom = reader.readLine();
        perso.setcognoms(cognom);

        while (perso.comprovacio(cognom)){
            System.out.println("El apellido no puede estar vacio!!");

            System.out.print("introduce el apellido: ");
            cognom = reader.readLine();
            perso.setcognoms(cognom);
        }

        System.out.print("introduce el año de nacimiento: ");
        String any2 = reader.readLine();
        any = Integer.parseInt(any2);
        perso.setany(any);

        while (perso.compr()){
            System.out.println("El año de nacimiento no puede ser menor que 0");

            System.out.print("introduce el año de nacimiento: ");
            any2 = reader.readLine();
            any = Integer.parseInt(any2);
            perso.setany(any);
        }

        System.out.print("Damos por hecho que la persona esta viva, lo esta? (Y/N): ");
        String viva = reader.readLine();

        while (!viva.equals("Y") && !viva.equals("N")){
            System.out.print("Damos por hecho que la persona esta viva, lo esta? (Y/N): ");
            viva = reader.readLine();
        }
        if (viva.equals("N")){
            System.out.print("introduce la fecha de defuncion: ");
            String anyd2 = reader.readLine();
            anyd = Integer.parseInt(anyd2);

            while (anyd <= any){
                System.out.println("La fecha de difuncion no puede ser igual o menor que la de nacimiento");
    
                System.out.print("introduce la fecha de difuncion: ");
                anyd2 = reader.readLine();
                anyd = Integer.parseInt(anyd2);
            }
            perso.setViu(anyd);
        }

        int edad = anyAct-perso.getany();
        int dead = perso.getany()-perso.getViu();

        if (perso.getViu() == -1){
            System.out.println(perso.getnom()+" "+perso.getcognoms()+" tiene "+ edad +" años de edad aprox.");
        }
        else{
            System.out.println(perso.getnom()+" "+perso.getcognoms()+" murio cuando tenia "+ dead +" años de edad aprox.");
        }
    }
}