public class GatPersa {
    int vides = 7;   // vides disponibles del gat Persa
    public static void main(String[] args) {
        GatPersa renat;           // declarem la referència al gat
        renat = new GatPersa();   // creem la instància del gat Persa.
        System.out.println("Al gat Renat li queden " + renat.vides + " vides");
    }
}