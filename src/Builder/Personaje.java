
package Builder;

public class Personaje {
    
    private String arma="vacio";
    private String escudo="vacio";
    private String montura="vacio";
    private String aspecto="";

    public String getConjunto() {
        return conjunto;
    }

    public void setConjunto() {
        this.conjunto = aspecto+arma+montura+escudo;
    }
    private String conjunto;
    
    public void setArma(String Arma){
       this.arma=Arma; 
    }
    

    public String getArma() {
        return arma;
    }
    
    public void setEscudo(String Escudo){
       this.escudo=Escudo; 
    }
    

    public String getEscudo() {
        return escudo;
    }
    
    public void setMontura(String Montura){
       this.montura=Montura; 
    }
    

    public String getMontura() {
        return montura;
    }

    public void setAspecto(String Aspecto){
       this.aspecto=Aspecto; 
    }
    

    public String getAspecto() {
        return aspecto;
    }
}
