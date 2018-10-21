/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import AbstractFactory.Arco;
import AbstractFactory.Elfo;
import AbstractFactory.EscudoElfo;
import AbstractFactory.Reno;

/**
 *
 * @author danbr
 */
public class ConstructorElfo extends Constructor {

    Arco a=new Arco();
    Reno r=new Reno();
    EscudoElfo e=new EscudoElfo();
    Elfo E=new Elfo();
    
    @Override
    public void construirPersonaje() {
        
        personaje=new Personaje();  
        
    }

    @Override
    public void construirArma() {
        
        personaje.setArma(a.mostrar());
        
    }

    @Override
    public void construirEscudo() {
        
        personaje.setEscudo(e.mostrarEscudo());
                
    }

    @Override
    public void construirMontura() {
        
        personaje.setMontura(r.mostrarMontura());
        
    }

    @Override
    public void construirApariencia() {
        personaje.setAspecto(E.mostrarApariencia());
    }

}
