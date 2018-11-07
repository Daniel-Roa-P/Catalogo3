
package Builder;

import AbstractFactory.EscudoOrco;
import AbstractFactory.Javali;
import AbstractFactory.Martillo;
import AbstractFactory.Orco;

public class ConstructorOrco extends Constructor {

    @Override
    public void construirPersonaje() {
        arma=new Martillo();
        montura=new Javali();
        escudo=new EscudoOrco();
        apariencia=new Orco();    
        personaje=new Personaje();  
        
    }

    @Override
    public void construirArma() {
        
        personaje.setArma(arma.mostrar());
        
    }

    @Override
    public void construirEscudo() {
        
        personaje.setEscudo(escudo.mostrarEscudo());
                
    }

    @Override
    public void construirMontura() {
        
        personaje.setMontura(montura.mostrarMontura());
        
    }

    @Override
    public void construirApariencia() {
        personaje.setAspecto(apariencia.mostrarApariencia());
    }

    
}
