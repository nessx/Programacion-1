package act8;

public class GatPersa {
    private String estat;
    private int vides = 7;

    public int getVides() {  // mètode que retorna el nombre de vides
        return vides;
    }
    public String getestat() { // mètode que retorna el nombre de vides
        return estat;
    }

    //
    public boolean estaDret() {
        if (estat=="parado"){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean estaAssegut() {
        if (estat=="sentado"){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean estaEstirat() {
        if (estat=="estirado"){
            return true;
        }
        else{
            return false;
        }
    }
    //end

    public boolean estavivo(){
        GatPersa renat = new GatPersa();
        if (renat.getVides()<0){
            return false;
        }
        else{
            return true;
        }
    }

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

    public void setVides(int vides) {
        // modifica el nombre de vides del gat si el paràmetre vides conté un valor vàlid
        if (vides >= 0) {
            this.vides = vides;   // de moment passem per alt aquest "this"
        }
    }
}