
package Builder;

public abstract class Constructor {
 
    protected Personaje personaje;
    
    public Personaje getPersonaje(){
        return personaje;
    }
    
    public abstract void construirPersonaje();
    public abstract void construirApariencia();
    public abstract void construirArma();
    public abstract void construirEscudo();
    public abstract void construirMontura();
    
}
