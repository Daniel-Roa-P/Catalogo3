/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author danbr
 */
public class FabricaHumano extends FabricaPersonajes {

    @Override
    public ArmaAbstracta crearArma() {
        return new Espada();
    }

    @Override
    public MonturaAbstracta crearMontura() {
        return new Caballo();
    }

    @Override
    public EscudoAbstracto crearEscudo() {
        return new EscudoHumano();
    }

    @Override
    public AparienciaAbstracta crearApariencia() {
        return new Humano();
    }
    
}
