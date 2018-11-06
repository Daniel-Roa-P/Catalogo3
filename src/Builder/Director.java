
package Builder;

public class Director {
   
    private Constructor constructor;

    public void setConstructor(Constructor constructor) {
        
        this.constructor = constructor; 
        
    }
    
    public Personaje getPersonaje(){
        return constructor.getPersonaje();
    }
    
    public void construirPersonaje(){
        constructor.construirPersonaje();
        constructor.construirApariencia();
    }
    
    public void añadirArma(){
        constructor.construirArma();
    }
    
    public void añadirEscudo(){
        constructor.construirEscudo();
    }
    
    public void añadirMontura(){
        constructor.construirMontura();
    }
    
}
