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
public class FabricaOrco extends FabricaPersonajes{

    @Override
    public ArmaAbstracta crearArma() {
        return new Martillo();
    }

    @Override
    public MonturaAbstracta crearMontura() {
        return new Javali();
    }

    @Override
    public EscudoAbstracto crearEscudo() {
        return new EscudoOrco();
    }

    @Override
    public AparienciaAbstracta crearApariencia() {
        return new Orco();
    }
    
}
