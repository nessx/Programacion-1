package act8;

public class estatgat {
    public static void main(String[] args) {
        GatPersa renat = new GatPersa();

        //primera parte switchs
        renat.setestat("parado");
        System.out.println("El gat Renat ahora esta " + renat.getestat());

        renat.setestat("estirado");
        System.out.println("El gat Renat ahora esta " + renat.getestat());

        renat.setestat("sentado");
        System.out.println("El gat Renat ahora esta " + renat.getestat());

        renat.setestat("nadando");
        System.out.println("El gat Renat ahora esta " + renat.getestat());
        //end 


        if (renat.estavivo()==true){
            System.out.println("el gat Renat esta vivo y le quedan " + renat.getVides() + " vides");
        }
        else{
            System.out.println("el gato esta muerto :(");
        }

        //segundo bloque con booleanos
        renat.setestat("estirado");
        if (renat.estaAssegut()){
            System.out.println("El gat Renat ahora esta " + renat.getestat());
        }
        else if (renat.estaDret()){
            System.out.println("El gat Renat ahora esta " + renat.getestat());
        }
        else if(renat.estaAssegut()){
            System.out.println("El gat Renat ahora esta " + renat.getestat());
        }
        else{
            System.out.println("El estado es invalido!");
        }
        //end
    }
}