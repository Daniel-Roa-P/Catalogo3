/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import AbstractFactory.Caballo;
import AbstractFactory.EscudoHumano;
import AbstractFactory.Espada;
import AbstractFactory.Humano;

/**
 *
 * @author danbr
 */
public class ConstructorHumano extends Constructor{
    
    Espada espada=new Espada();
    Caballo caballo=new Caballo();
    EscudoHumano escudo=new EscudoHumano();
    Humano humano=new Humano();
    
    @Override
    public void construirPersonaje() {
        
        personaje=new Personaje();  
        
    }

    @Override
    public void construirArma() {
        
        personaje.setArma(espada.mostrar());
        
    }

    @Override
    public void construirEscudo() {
        
        personaje.setEscudo(escudo.mostrarEscudo());
                
    }

    @Override
    public void construirMontura() {
        
        personaje.setMontura(caballo.mostrarMontura());
        
    }

    @Override
    public void construirApariencia() {
        personaje.setAspecto(humano.mostrarApariencia());
    }
    
}
