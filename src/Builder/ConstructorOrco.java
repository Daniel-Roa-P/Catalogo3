
package Builder;

import AbstractFactory.EscudoOrco;
import AbstractFactory.Javali;
import AbstractFactory.Martillo;
import AbstractFactory.Orco;

public class ConstructorOrco extends Constructor {

    Martillo m=new Martillo();
    Javali j=new Javali();
    EscudoOrco e=new EscudoOrco();
    Orco o=new Orco();
    
    @Override
    public void construirPersonaje() {
        
        personaje=new Personaje();  
        
    }

    @Override
    public void construirArma() {
        
        personaje.setArma(m.mostrar());
        
    }

    @Override
    public void construirEscudo() {
        
        personaje.setEscudo(e.mostrarEscudo());
                
    }

    @Override
    public void construirMontura() {
        
        personaje.setMontura(j.mostrarMontura());
        
    }

    @Override
    public void construirApariencia() {
        personaje.setAspecto(o.mostrarApariencia());
    }

    
}
