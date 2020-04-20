public class GatPersa {
    int vides = 7;   // vides disponibles del gat Persa
    String estat;
    
    public int getVides() {  // mètode que retorna el nombre de vides
        return vides;
    }
    public String getestat() { // mètode que retorna el nombre de vides
        return estat;
    }

    public void setestat(String estat) {
        switch(estat){ 
            case "parado":
                this.estat = "parado"; 
				break; 
            case "acostado":
                this.estat = "acostado";
                break;

            case "sentado":
                this.estat = "sentado";
				break; 
			default: 
                this.estat = "ERROR: estado incorrecto!"; 
		} 
    }

    public void setVides(int vides) {
        // modifica el nombre de vides del gat si el paràmetre vides conté un valor vàlid
        if (vides >= 0) {
            this.vides = vides;   // de moment passem per alt aquest "this"
        }
    }
}