package act7;

public class estatgat {
    public static void main(String[] args) {
        GatPersa renat = new GatPersa();

        renat.setestat("parado");
        System.out.println("El gat Renat ahora esta " + renat.getestat());

        renat.setestat("estirado");
        System.out.println("El gat Renat ahora esta " + renat.getestat());

        renat.setestat("sentado");
        System.out.println("El gat Renat ahora esta " + renat.getestat());

        renat.setestat("nadando");
        System.out.println("El gat Renat ahora esta " + renat.getestat());
    }
}