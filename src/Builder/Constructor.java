
package Builder;

import AbstractFactory.AparienciaAbstracta;
import AbstractFactory.ArmaAbstracta;
import AbstractFactory.EscudoAbstracto;
import AbstractFactory.MonturaAbstracta;

public abstract class Constructor {
 
    protected Personaje personaje=new Personaje();
    protected ArmaAbstracta arma;
    protected EscudoAbstracto escudo;
    protected MonturaAbstracta montura;
    protected AparienciaAbstracta apariencia;
    
    
    public Personaje getPersonaje(){
        return personaje;
    }
    
    public abstract void construirPersonaje();
    public abstract void construirApariencia();
    public abstract void construirArma();
    public abstract void construirEscudo();
    public abstract void construirMontura();
    
}
