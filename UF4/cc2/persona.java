package cc2;

public class persona {
    private String nom;
    private String cognoms;
    private int any=0;
    private int anyd=-1;


    int getViu(){
        return anyd;
    }

    public void setViu(int anyd){
        this.anyd=anyd;
    }

    int getany(){
        return any;
    }

    public int setany(int any) {
        this.any=any;
        return any;
    }

    public boolean compr(){
        if (any<=0){
            return true;
        }
        return false;
    }

    String getnom(){
        return nom;
    }

    public boolean comprovacio (String variable){
        if(variable != null && !variable.isEmpty()){
            return false;
        }
        return true;
    }
    
    public void setnom(String nom){
        this.nom=nom;
    }

    String getcognoms(){
        return cognoms;
    }
    public void setcognoms(String cognoms){
        this.cognoms=cognoms;
    }


}