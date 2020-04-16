/*
public class GatPersa {
    int vides = 7;   // vides disponibles del gat Persa
    public static void main(String[] args) {
        GatPersa renat;           // declarem la referència al gat
        renat = new GatPersa();   // creem la instància del gat Persa.
        System.out.println("Al gat Renat li queden " + renat.vides + " vides");
    }
}
*/

/*public class GatPersa {
    int vides = -12;   // vides disponibles del gat Persa
    public static void main(String[] args) {
        GatPersa renat;           // declarem l'objecte (la referència) al gat
        renat = new GatPersa();   // creem la instància del gat Renat.
        System.out.println("Abans el gat Renat tenia " + renat.vides + " vides");
        //renat.vides = renat.vides - 1;  // Renat ha tingut un accident
        System.out.println("Ara el gat Renat té " + renat.vides);
    }
}*/

public class GatPersa {
    int vides = 7;   // vides disponibles del gat Persa
 
    public static void main(String[] args) {
        GatPersa renat_I;
        renat_I = new GatPersa();               // crea un primer gat Persa
        System.out.println("El gat Renat I té  " + renat_I.vides + " vides");
 
        GatPersa renat_II = new GatPersa();     // crea un segon gat Persa!
        System.out.println("El gat Renat II té " + renat_II.vides + " vides");
 
        renat_I.vides++;
        System.out.println("El gat Renat I té  " + renat_I.vides + " vides");
        System.out.println("El gat Renat II té " + renat_II.vides + " vides");
 
        renat_II = renat_I; // atenció: la instància de Renat II es perd!
        System.out.println("El gat Renat I té  " + renat_I.vides + " vides");
        System.out.println("El gat Renat II té " + renat_II.vides + " vides");
 
        renat_I.vides++;
        System.out.println("El gat Renat I té  " + renat_I.vides + " vides");
        System.out.println("El gat Renat II té " + renat_II.vides + " vides");
    }
}