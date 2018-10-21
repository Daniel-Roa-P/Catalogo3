/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;


public class Cliente {
    
    private final ArmaAbstracta arma;
    private final EscudoAbstracto escudo;
    private final MonturaAbstracta montura;
    private final AparienciaAbstracta aspecto;

    public Cliente(FabricaPersonajes factory) {
        
        arma=factory.crearArma();
        aspecto=factory.crearApariencia();
        escudo=factory.crearEscudo();
        montura=factory.crearMontura();
        
    }

    public String recibirArma() {
        
        return arma.mostrar();

    }
    public String recibirAspecto() {
        
        return aspecto.mostrarApariencia();

    }
    public String recibirMontura() {
        
        return montura.mostrarMontura();

    }
    public String recibirEscudo() {
        
        return escudo.mostrarEscudo();

    }
    
}
