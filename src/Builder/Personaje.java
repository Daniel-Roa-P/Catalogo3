
package Builder;

public class Personaje {
    
    private String arma="vacio.png";
    private String escudo="vacio.png";
    private String montura="vacio.png";
    private String aspecto="vacio.png";
    
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
