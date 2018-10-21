
package Prototype;

import Builder.Personaje;

public class Diseñador {
    
    private ElfoConcreto elfo;
    private HumanoConcreto humano;
    private OrcoConcreto orco;
    private Personaje p;
    
    public Diseñador(Personaje p){
        
        this.p=p;
        
        elfo=new ElfoConcreto();
        humano=new HumanoConcreto();
        orco=new OrcoConcreto();
        
        
        elfo.setAspecto(p.getAspecto());
        elfo.setArma(p.getArma());
        elfo.setEscudo(p.getEscudo());
        elfo.setMontura(p.getMontura());
        
        humano.setAspecto(p.getAspecto());
        humano.setArma(p.getArma());
        humano.setEscudo(p.getEscudo());
        humano.setMontura(p.getMontura());
        
        orco.setAspecto(p.getAspecto());
        orco.setArma(p.getArma());
        orco.setEscudo(p.getEscudo());
        orco.setMontura(p.getMontura());
    }
 
    public PrototipoPersonajes retrievePersonaje(String id) {
        if (null != id) switch (id) {
            case "elfo":
                return (PrototipoPersonajes) elfo.clone();
            case "humano":
                return (PrototipoPersonajes) humano.clone();
            case "orco":
                return (PrototipoPersonajes) orco.clone();
            default:
                break;
        }

        return null;
    } // method retrieveAnimal
}