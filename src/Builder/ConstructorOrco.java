
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
        
    }

    @Override
    public void construirArma() {
        
        personaje.setArma(arma.mostrar());
        personaje.setConjunto();
    }

    @Override
    public void construirEscudo() {
        
        personaje.setEscudo(escudo.mostrarEscudo());
        personaje.setConjunto();      
    }

    @Override
    public void construirMontura() {
        
        personaje.setMontura(montura.mostrarMontura());
        personaje.setConjunto();
    }

    @Override
    public void construirApariencia() {
        
        personaje.setAspecto(apariencia.mostrarApariencia());
        personaje.setConjunto();
    }

    
}
