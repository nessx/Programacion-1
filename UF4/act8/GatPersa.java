package act7;

public class GatPersa {
    private String estat;

    public void setestat(String estat) {
        switch(estat){ 
            case "parado":
                this.estat = "parado"; 
				break; 
            case "estirado":
                this.estat = "estirado";
                break;
            case "sentado":
                this.estat = "sentado";
				break; 
			default: 
                this.estat = "ERROR: estado incorrecto!"; 
        } 
    }

    public String getestat() { // mètode que retorna el nombre de vides
        return estat;
    }
}