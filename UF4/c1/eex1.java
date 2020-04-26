package c1;

public class eex1 {
    private int segundos=0;
    private int minutos=0;
    private int hora=0;
    private boolean bol = true;
    
    int gethora(){
    return hora;
    }
    
    public void sethora(int hora){
    this.hora=hora;
    }
    
    public int getminutos(){
    return minutos;
    }
    
    public void setminutos(int minutos){
    this.minutos=minutos;
    }
    
    public  int getsegundos(){
        return segundos;
    }

    public void setsegundos(int segundos){
        this.segundos=segundos;
    }

    public void Reloj(int h, int m, int s) {
        this.hora=h %24;
        this.minutos=m % 60;
        this.segundos=s % 60;
    }

    public void incrementa(){
        segundos++;
        if (segundos==60){
            segundos=0;
            minutos++;
            if(minutos==60){
                minutos=0;
                hora=(hora+1);
            }
        }
    }
    
    /*
    public void seguent(int){

    }
    
    */

    public void decrementa(){
        segundos--;
        if(segundos<00){
            segundos=59;
            minutos--;
            if(minutos<00){
            minutos=59;
            hora=(hora-1) %24;
    
            }
        }
       }
    /*
    public void decrementa(int){

    }
    */

    /*
    public int compareTo(Hora){

    }
    */
    public String toString(){
        String hms=hora+":"+minutos+":"+segundos;
        if (hora==0 && minutos==0 && segundos==0){
            bol=false;
        }
        return (hms);
    }

    boolean getfin(){
        return bol;
    }

}