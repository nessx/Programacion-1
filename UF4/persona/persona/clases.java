package persona;

public class clases {
    private int nacimiento;
    private int defuncion = -1;
    private String nombres;
    private boolean compr = false;


    int getnacimiento(){
        return nacimiento;
    }

    int getdefuncion(){
        return defuncion;
    }

    public void setdefuncion(int defuncion){
        this.defuncion=defuncion;
    }

    public void setnacimiento(int nacimineto){
        this.nacimiento=nacimineto;
    }

    boolean getcompr() {
        if (nacimiento<=0){
            compr = true;
        }
        else{
            compr = false; 
        }
        return compr;
    }
    
    public void setViu(int ano){
        defuncion = ano;
    }
}