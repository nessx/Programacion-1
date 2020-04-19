public class estatgat {
    public static void main(String[] args) {
        GatPersa renat = new GatPersa();
        System.out.println("Al gat Renat li queden " + renat.vides + " vides");
        System.out.println("El gat Renat esta actualment " + renat.estat);

        renat.estat = "assegut";
        System.out.println("Al gat Renat li queden " + renat.vides + " vides");
        System.out.println("El gat Renat ahora esta " + renat.estat);
    }
}