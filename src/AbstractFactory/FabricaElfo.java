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
public class FabricaElfo extends FabricaPersonajes{

    @Override
    public ArmaAbstracta crearArma() {
        return new Arco();
    }

    @Override
    public MonturaAbstracta crearMontura() {
        return new Reno();
    }

    @Override
    public EscudoAbstracto crearEscudo() {
        return new EscudoElfo();
    }

    @Override
    public AparienciaAbstracta crearApariencia() {
        return new Elfo();
    }
    
}
