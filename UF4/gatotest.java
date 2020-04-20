
public class gatotest {
    public static void main(String[] args) {
        GatPersa renat = new GatPersa();
        System.out.println("Al gat Renat li queden " + renat.getVides() + " vides");
        renat.setVides(-12);
        System.out.println("Al gat Renat li queden " + renat.getVides() + " vides");
        renat.setVides(12);
        System.out.println("Al gat Renat li queden " + renat.getVides() + " vides");

        renat.setestat("acostado");
        System.out.println("El gato persa ahora esta " + renat.getestat());
    }
}