
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
        constructor.construirArma();
        constructor.construirMontura();
        constructor.construirEscudo();
        constructor.construirApariencia();
    }
    
}
