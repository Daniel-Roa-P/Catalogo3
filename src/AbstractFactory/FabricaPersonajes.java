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
public abstract class FabricaPersonajes {
    
    public abstract ArmaAbstracta crearArma();
    public abstract MonturaAbstracta crearMontura();
    public abstract EscudoAbstracto crearEscudo();
    public abstract AparienciaAbstracta crearApariencia();
    
    
}
