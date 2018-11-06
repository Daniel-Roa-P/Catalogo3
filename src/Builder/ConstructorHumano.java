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
    
    
    
    @Override
    public void construirPersonaje() {
        arma=new Espada();
        montura=new Caballo();
        escudo=new EscudoHumano();
        apariencia=new Humano();
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
