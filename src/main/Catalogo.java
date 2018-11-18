package main;

import AbstractFactory.Cliente;
import AbstractFactory.FabricaElfo;
import AbstractFactory.FabricaHumano;
import AbstractFactory.FabricaOrco;
import AbstractFactory.FabricaPersonajes;
import Builder.ConstructorElfo;
import Builder.ConstructorHumano;
import Builder.ConstructorOrco;
import Builder.Director;
import Builder.Personaje;
import Prototype.Diseñador;
import Prototype.PrototipoPersonajes;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Catalogo extends JFrame implements ActionListener {

        private final JButton b=new JButton("Elfo");
        private final JButton b2=new JButton("Humano");
        private final JButton b3=new JButton("Orco");
        private final JButton b4=new JButton("Añadir arma");
        private final JButton b5=new JButton("Añadir montura");
        private final JButton b6=new JButton("Añadir escudo");
        private final JButton b7=new JButton("Imprimir tropas");
        private final JButton b8=new JButton("Iniciar Ataque");
        
        private final JLabel Arma=new JLabel("Arma");
        private final JLabel Montura=new JLabel("Montura");
        private final JLabel Aspecto=new JLabel("Aspecto");
        private final JLabel Escudo=new JLabel("Escudo");
        private final JLabel Personaje=new JLabel("Personaje");
        private final JLabel Tropas=new JLabel("Tropas:");
        private final JLabel Texto1=new JLabel("Numero Elfos:");
        private final JLabel Texto2=new JLabel("Numero Humanos:");
        private final JLabel Texto3=new JLabel("Numero Orcos:");
        
        private final JLabel img1=new JLabel();
        private final JLabel img2=new JLabel();
        private final JLabel img3=new JLabel();
        private final JLabel img4=new JLabel();
        private final JLabel img5=new JLabel();
        
        public Icon iconoElfo;
        public Icon iconoHumano;
        public Icon iconoOrco;

        private final JTextField cantidadElfos=new JTextField("1");
        private final JTextField cantidadHumanos=new JTextField("1");
        private final JTextField cantidadOrcos=new JTextField("1");
        
        private final Director D=new Director();
        private Personaje P=new Personaje();
        private Personaje Pe,Ph,Po;
        
        public String id;
        public int nElfos,nHumanos,nOrcos,ntropas;
         
        public static Catalogo catalogo;
        
        JPanel jpan;
        
    public static void main(String[] args) {
        
        catalogo=new Catalogo();
        catalogo.setSize(1350, 730);
        catalogo.setVisible(true);
        
    }
    
    public Catalogo(){
        
        Container c=getContentPane();
        c.setLayout(null);
        this.getContentPane().setBackground(Color.darkGray);

        jpan=new JPanel();
        jpan.setBounds(400, 425, 900, 245);
        jpan.setOpaque(true);
        jpan.setBackground(Color.DARK_GRAY);
        add(jpan);
        
        c.add(b);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);
        c.add(b6);
        c.add(b7);
        c.add(b8);
        c.add(Arma);
        c.add(Montura);
        c.add(Escudo);
        c.add(Aspecto);
        c.add(Personaje);
        c.add(Texto1);
        c.add(Texto2);
        c.add(Texto3);
        c.add(img1);
        c.add(img2);
        c.add(img3);
        c.add(img4);
        c.add(img5);
        c.add(cantidadElfos);
        c.add(cantidadHumanos);
        c.add(cantidadOrcos);
        
        b.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        
        b.setBounds(130, 50, 100, 35);
        b.setBackground(Color.CYAN);
        b2.setBounds(130, 200, 100, 35);
        b2.setBackground(Color.CYAN);
        b3.setBounds(130, 350, 100, 35);
        b3.setBackground(Color.CYAN);
        b4.setBounds(700, 50, 150, 35);
        b4.setBackground(Color.YELLOW);
        b5.setBounds(875, 50, 150, 35);
        b5.setBackground(Color.YELLOW);
        b6.setBounds(1050, 50, 150, 35);
        b6.setBackground(Color.YELLOW);
        b7.setBounds(130, 580, 150, 30);
        b7.setBackground(Color.ORANGE);
        b8.setBounds(130, 650, 150, 30);
        b8.setBackground(Color.PINK);
        
        Arma.setBounds(300, 50, 100, 20);
        Arma.setForeground(Color.WHITE);
        Arma.setFont(new java.awt.Font("ALGERIAN", 1, 20));
        Escudo.setBounds(300, 270, 100, 20);
        Escudo.setForeground(Color.WHITE);
        Escudo.setFont(new java.awt.Font("ALGERIAN", 1, 20));
        Aspecto.setBounds(500, 50, 100, 20);
        Aspecto.setForeground(Color.WHITE);
        Aspecto.setFont(new java.awt.Font("ALGERIAN", 1, 20));
        Montura.setBounds(500, 270, 100, 20);
        Montura.setForeground(Color.WHITE);
        Montura.setFont(new java.awt.Font("ALGERIAN", 1, 20));
        Personaje.setBounds(5, 205, 150, 20);
        Personaje.setForeground(Color.red);
        Personaje.setFont(new java.awt.Font("ALGERIAN", 1, 20));
        Personaje.setBackground(Color.cyan);
        
        Texto1.setBounds(130, 430, 150, 20);
        Texto1.setForeground(Color.BLACK);
        Texto2.setBounds(130, 480, 150, 20);
        Texto2.setForeground(Color.BLACK);
        Texto3.setBounds(130, 530, 150, 20);
        Texto3.setForeground(Color.BLACK);
        
        cantidadElfos.setBounds(250, 430, 30, 20);
        cantidadHumanos.setBounds(250, 480, 30, 20);
        cantidadOrcos.setBounds(250, 530, 30, 20);
    }
    
    private void pintar(Cliente c){
        
            ImageIcon imgIcon = new ImageIcon(getClass().getResource("/Imagenes/"+c.recibirArma()+".png"));
            Image imgEscalada = imgIcon.getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
            Icon iconoEscalado = new ImageIcon(imgEscalada);
            img1.setBounds(300,80,130,130);
            img1.setIcon(iconoEscalado);
            
            ImageIcon imgIcon2 = new ImageIcon(getClass().getResource("/Imagenes/"+c.recibirAspecto()+".png"));
            Image imgEscalada2 = imgIcon2.getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
            Icon iconoEscalado2 = new ImageIcon(imgEscalada2);
            img2.setBounds(500,80,130,130);
            img2.setIcon(iconoEscalado2);
            
            ImageIcon imgIcon3 = new ImageIcon(getClass().getResource("/Imagenes/"+c.recibirEscudo()+".png"));
            Image imgEscalada3 = imgIcon3.getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
            Icon iconoEscalado3 = new ImageIcon(imgEscalada3);
            img3.setBounds(300,295,130,130);
            img3.setIcon(iconoEscalado3);
            
            ImageIcon imgIcon4 = new ImageIcon(getClass().getResource("/Imagenes/"+c.recibirMontura()+".png"));
            Image imgEscalada4 = imgIcon4.getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
            Icon iconoEscalado4 = new ImageIcon(imgEscalada4);
            img4.setBounds(500,295,130,130);
            img4.setIcon(iconoEscalado4);
            
    }
    
    public void validarIcono(){
       
        ImageIcon imgIcon5 = new ImageIcon(getClass().getResource("/Imagenes/"+P.getConjunto()+".png"));
        Image imgEscalada5 = imgIcon5.getImage().getScaledInstance(300,330, Image.SCALE_SMOOTH);
        Icon iconoEscalado5  = new ImageIcon(imgEscalada5);
            
        img5.setBounds(800,100,300,330);
        img5.setIcon(iconoEscalado5);
        
        ImageIcon imgIcon6 = new ImageIcon(getClass().getResource("/Imagenes/"+P.getConjunto()+".png"));
        Image imgEscalada6 = imgIcon6.getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH);
        Icon iconoEscalado6  = new ImageIcon(imgEscalada6);
        
        if(id.equals("elfo")){
                iconoElfo=iconoEscalado6;
            } else if(id.equals("humano")){
                iconoHumano=iconoEscalado6;
            } else if(id.equals("orco")){
                iconoOrco=iconoEscalado6;
            }
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==b){
        
            id="elfo";
            
            FabricaPersonajes factory1 = new FabricaElfo();
            Cliente c = new Cliente(factory1);
            
            D.setConstructor(new ConstructorElfo());
            D.construirPersonaje();
            P=D.getPersonaje();
            Pe=D.getPersonaje();
            
            pintar(c);
            validarIcono();
            
        } else if(e.getSource()==b2){
        
            id="humano";
            
            FabricaPersonajes factory2 = new FabricaHumano();
            Cliente c = new Cliente(factory2);
            
            D.setConstructor(new ConstructorHumano());
            D.construirPersonaje();
            P=D.getPersonaje();
            Ph=D.getPersonaje();
            
            pintar(c);
            validarIcono();
            
        } else if(e.getSource()==b3){
        
            id="orco";
            
            FabricaPersonajes factory3 = new FabricaOrco();
            Cliente c = new Cliente(factory3);
            
            D.setConstructor(new ConstructorOrco());
            D.construirPersonaje();
           
            P=D.getPersonaje();
            Po=D.getPersonaje();
            
            pintar(c);        
            validarIcono();
            
        } else if(e.getSource()==b4){
            
            D.añadirArma();
            validarIcono(); 
            
        } else if(e.getSource()==b5){
            
            D.añadirMontura();
            validarIcono();  
            
        } else if(e.getSource()==b6){
            
            D.añadirEscudo();
            validarIcono(); 
            
        } else if(e.getSource()==b7){
            
            Diseñador dis = null;
            PrototipoPersonajes prot;
            
            jpan.setLayout(null);
            jpan.removeAll();
            
            nElfos=Integer.parseInt(cantidadElfos.getText());
            nHumanos=Integer.parseInt(cantidadHumanos.getText());
            nOrcos=Integer.parseInt(cantidadOrcos.getText());
            
            ntropas= nElfos+nHumanos+nOrcos; 
            int borde=13;
            int j = 0;
            int k = 0;
            int d = 0;
          
            JLabel tropas[]=new JLabel[ntropas];
            
            for(int l=0;l<ntropas;l++){
                
                if(ntropas<52*(Math.pow(4, l))){
                    d=(int) Math.pow(2, l);
                    borde=borde*d;
                    l=ntropas;
                }    
                
            }
            
            for(int i=0;i<ntropas;i++){
                
                if(i<nElfos){
                    dis=new Diseñador(Pe);
                    id="elfo";
                } else if(i>=nElfos && i<(nElfos+nHumanos)) {
                    dis=new Diseñador(Ph);
                    id="humano";
                } else if(i>=(nElfos+nHumanos) && i<(ntropas)){
                    dis=new Diseñador(Po);
                    id="orco";
                }
                
                prot=dis.retrievePersonaje(id);
            
                String armado=prot.getAspecto()+prot.getArma()+prot.getMontura()+prot.getEscudo()+".png";
                
                if(i!=0 && i%borde==0){
                        j=j+1;
                        k=0;
                    }
                                  
                    ImageIcon imgIcon9 = new ImageIcon(getClass().getResource("/Imagenes/"+armado));
                    Image imgEscalada9 = imgIcon9.getImage().getScaledInstance((int)60/d,(int)60/d, Image.SCALE_SMOOTH);
                    Icon iconoEscalado9 = new ImageIcon(imgEscalada9);
                    
                    tropas[i]=new JLabel();
                    tropas[i].setIcon(iconoEscalado9);

                    jpan.add(tropas[i]);
                    tropas[i].setBounds(0+(k*70/d), 0+(int)(j*60/d), (int)60/d,(int)60/d);
                    
                    k++;
                    
                jpan.validate();
                jpan.repaint();
                 
            }
            
        } else if(e.getSource()==b8){
            
            Juego J = new Juego();
            J.mostrar();
        }
    
    }
}