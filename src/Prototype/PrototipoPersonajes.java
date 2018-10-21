
package Prototype;

/**
 *
 * @author danielroa
 */
public class PrototipoPersonajes implements Cloneable{
    
    private String aspecto;
    private String arma;
    private String escudo;
    private String montura;
    
    public void setAspecto(String aspecto){
        this.aspecto=aspecto;
    }
    
    public void setArma(String arma){
        this.arma=arma;
    }
    
    public void setEscudo(String escudo){
        this.escudo=escudo;
    }
    
    public void setMontura(String montura){
        this.montura=montura;
    }
    
    public String getAspecto(){
        return aspecto;
    }
    
    public String getArma(){
        return arma;
    }
    
    public String getEscudo(){
        return escudo;
    }
    
    public String getMontura(){
        return montura;
    }
    
    @Override
    public PrototipoPersonajes clone(){
    
        PrototipoPersonajes clonedPrototipoPersonajes=null;
        
        try {
            clonedPrototipoPersonajes = (PrototipoPersonajes) super.clone();
            clonedPrototipoPersonajes.setAspecto(aspecto);
            clonedPrototipoPersonajes.setArma(arma);
            clonedPrototipoPersonajes.setEscudo(escudo);
            clonedPrototipoPersonajes.setMontura(montura);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } // catch	
        return clonedPrototipoPersonajes;
        
    }
    
}
