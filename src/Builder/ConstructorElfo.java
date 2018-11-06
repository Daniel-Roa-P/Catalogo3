/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import AbstractFactory.Arco;
import AbstractFactory.ArmaAbstracta;
import AbstractFactory.Elfo;
import AbstractFactory.EscudoElfo;
import AbstractFactory.Reno;

/**
 *
 * @author danbr
 */
public class ConstructorElfo extends Constructor {

    
    
    
    @Override
    public void construirPersonaje() {
       
        arma=new Arco();
        montura=new Reno();
        escudo=new EscudoElfo();
        apariencia=new Elfo();
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
