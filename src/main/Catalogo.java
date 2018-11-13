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

        JButton b=new JButton("Elfo");
        JButton b2=new JButton("Humano");
        JButton b3=new JButton("Orco");
        JButton b4=new JButton("Añadir arma");
        JButton b5=new JButton("Añadir montura");
        JButton b6=new JButton("Añadir escudo");
        JButton b7=new JButton("Imprimir tropas");
        JButton b8=new JButton("Iniciar Ataque");
        
        JLabel Arma=new JLabel("Arma");
        JLabel Montura=new JLabel("Montura");
        JLabel Aspecto=new JLabel("Aspecto");
        JLabel Escudo=new JLabel("Escudo");
        JLabel Personaje=new JLabel("Personaje");
        
        JLabel Tropas=new JLabel("Tropas:");
        
        JTextField nTropas=new JTextField("10");
        
        JLabel img1=new JLabel();
        JLabel img2=new JLabel();
        JLabel img3=new JLabel();
        JLabel img4=new JLabel();
        JLabel img5=new JLabel();
        JLabel img6=new JLabel();
        JLabel img7=new JLabel();
        JLabel img8=new JLabel();
        
        Director D=new Director();
        Personaje P=new Personaje();
        String id;
        int ntropas;
                
        JPanel jpan;
        
    public static void main(String[] args) {
        
        Catalogo P=new Catalogo();
        P.setSize(1350, 730);
        P.setVisible(true);
        
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
        c.add(Tropas);
        c.add(nTropas);
        c.add(img1);
        c.add(img2);
        c.add(img3);
        c.add(img4);
        c.add(img7);
        c.add(img5);
        c.add(img8);
        c.add(img6);
        
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
        
        Tropas.setBounds(130, 490, 100, 20);
        Tropas.setForeground(Color.BLACK);
        nTropas.setBounds(250, 490, 100, 20);

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
            
            ImageIcon imgIcon = new ImageIcon(getClass().getResource("/Imagenes/"+c.recibirArma()));
            Image imgEscalada = imgIcon.getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
            Icon iconoEscalado = new ImageIcon(imgEscalada);
            img1.setBounds(300,80,130,130);
            img1.setIcon(iconoEscalado);
            
            ImageIcon imgIcon2 = new ImageIcon(getClass().getResource("/Imagenes/"+c.recibirAspecto()));
            Image imgEscalada2 = imgIcon2.getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
            Icon iconoEscalado2 = new ImageIcon(imgEscalada2);
            img2.setBounds(500,80,130,130);
            img2.setIcon(iconoEscalado2);
            
            ImageIcon imgIcon3 = new ImageIcon(getClass().getResource("/Imagenes/"+c.recibirEscudo()));
            Image imgEscalada3 = imgIcon3.getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
            Icon iconoEscalado3 = new ImageIcon(imgEscalada3);
            img3.setBounds(300,295,130,130);
            img3.setIcon(iconoEscalado3);
            
            ImageIcon imgIcon4 = new ImageIcon(getClass().getResource("/Imagenes/"+c.recibirMontura()));
            Image imgEscalada4 = imgIcon4.getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
            Icon iconoEscalado4 = new ImageIcon(imgEscalada4);
            img4.setBounds(500,295,130,130);
            img4.setIcon(iconoEscalado4);
            
            ImageIcon imgIcon5 = new ImageIcon(getClass().getResource("/Imagenes/"+c.recibirAspecto()));
            Image imgEscalada5 = imgIcon5.getImage().getScaledInstance(300,330, Image.SCALE_SMOOTH);
            Icon iconoEscalado5 = new ImageIcon(imgEscalada5);
            img5.setBounds(800,100,300,330);
            img5.setIcon(iconoEscalado5);
            
            img6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vacio.png")));
            img7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vacio.png")));
            img8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vacio.png"))); 
            
        } else if(e.getSource()==b2){
        
            id="humano";
            
            FabricaPersonajes factory2 = new FabricaHumano();
            Cliente c = new Cliente(factory2);
            
            D.setConstructor(new ConstructorHumano());
            D.construirPersonaje();
            P=D.getPersonaje();
            
            ImageIcon imgIcon = new ImageIcon(getClass().getResource("/Imagenes/"+c.recibirArma()));
            Image imgEscalada = imgIcon.getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
            Icon iconoEscalado = new ImageIcon(imgEscalada);
            img1.setBounds(300,80,130,130);
            img1.setIcon(iconoEscalado);
            
            ImageIcon imgIcon2 = new ImageIcon(getClass().getResource("/Imagenes/"+c.recibirAspecto()));
            Image imgEscalada2 = imgIcon2.getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
            Icon iconoEscalado2 = new ImageIcon(imgEscalada2);
            img2.setBounds(500,80,130,130);
            img2.setIcon(iconoEscalado2);
            
            ImageIcon imgIcon3 = new ImageIcon(getClass().getResource("/Imagenes/"+c.recibirEscudo()));
            Image imgEscalada3 = imgIcon3.getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
            Icon iconoEscalado3 = new ImageIcon(imgEscalada3);
            img3.setBounds(300,295,130,130);
            img3.setIcon(iconoEscalado3);
            
            ImageIcon imgIcon4 = new ImageIcon(getClass().getResource("/Imagenes/"+c.recibirMontura()));
            Image imgEscalada4 = imgIcon4.getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
            Icon iconoEscalado4 = new ImageIcon(imgEscalada4);
            img4.setBounds(500,295,130,130);
            img4.setIcon(iconoEscalado4);
            
            ImageIcon imgIcon5 = new ImageIcon(getClass().getResource("/Imagenes/"+c.recibirAspecto()));
            Image imgEscalada5 = imgIcon5.getImage().getScaledInstance(300,330, Image.SCALE_SMOOTH);
            Icon iconoEscalado5 = new ImageIcon(imgEscalada5);
            img5.setBounds(800,100,300,330);
            img5.setIcon(iconoEscalado5);
            
            img6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vacio.png")));
            img7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vacio.png")));
            img8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vacio.png")));

        } else if(e.getSource()==b3){
        
            id="orco";
            
            FabricaPersonajes factory3 = new FabricaOrco();
            Cliente c = new Cliente(factory3);
            
            D.setConstructor(new ConstructorOrco());
            D.construirPersonaje();
           
            P=D.getPersonaje();
            
            ImageIcon imgIcon = new ImageIcon(getClass().getResource("/Imagenes/"+c.recibirArma()));
            Image imgEscalada = imgIcon.getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
            Icon iconoEscalado = new ImageIcon(imgEscalada);
            img1.setBounds(300,80,130,130);
            img1.setIcon(iconoEscalado);
            
            ImageIcon imgIcon2 = new ImageIcon(getClass().getResource("/Imagenes/"+c.recibirAspecto()));
            Image imgEscalada2 = imgIcon2.getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
            Icon iconoEscalado2 = new ImageIcon(imgEscalada2);
            img2.setBounds(500,80,130,130);
            img2.setIcon(iconoEscalado2);
            
            ImageIcon imgIcon3 = new ImageIcon(getClass().getResource("/Imagenes/"+c.recibirEscudo()));
            Image imgEscalada3 = imgIcon3.getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
            Icon iconoEscalado3 = new ImageIcon(imgEscalada3);
            img3.setBounds(300,295,130,130);
            img3.setIcon(iconoEscalado3);
            
            ImageIcon imgIcon4 = new ImageIcon(getClass().getResource("/Imagenes/"+c.recibirMontura()));
            Image imgEscalada4 = imgIcon4.getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
            Icon iconoEscalado4 = new ImageIcon(imgEscalada4);
            img4.setBounds(500,295,130,130);
            img4.setIcon(iconoEscalado4);
            
            ImageIcon imgIcon5 = new ImageIcon(getClass().getResource("/Imagenes/"+c.recibirAspecto()));
            Image imgEscalada5 = imgIcon5.getImage().getScaledInstance(300,330, Image.SCALE_SMOOTH);
            Icon iconoEscalado5 = new ImageIcon(imgEscalada5);
            img5.setBounds(800,100,300,330);
            img5.setIcon(iconoEscalado5);
            
            img6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vacio.png")));
            img7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vacio.png")));
            img8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vacio.png")));            
            
        } else if(e.getSource()==b4){
            
            D.añadirArma();
            ImageIcon imgIcon6 = new ImageIcon(getClass().getResource("/Imagenes/"+P.getArma()));
            Image imgEscalada6;
            Icon iconoEscalado6;
            
            if(null != id)switch (id) {
                case "elfo":
                    imgEscalada6 = imgIcon6.getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
                    iconoEscalado6 = new ImageIcon(imgEscalada6);
                    img6.setIcon(iconoEscalado6);
                    img6.setBounds(850, 110, 130, 130);
                    break;
                case "humano":
                    imgEscalada6 = imgIcon6.getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
                    iconoEscalado6 = new ImageIcon(imgEscalada6);
                    img6.setIcon(iconoEscalado6);
                    img6.setBounds(850,130,130,130);
                    break;
                case "orco":
                    imgEscalada6 = imgIcon6.getImage().getScaledInstance(170,170, Image.SCALE_SMOOTH);
                    iconoEscalado6 = new ImageIcon(imgEscalada6);
                    img6.setIcon(iconoEscalado6);
                    img6.setBounds(770,100,170,170);
                    break;
                default:
                    break;
}
            
        } else if(e.getSource()==b5){
            
            D.añadirMontura();
            ImageIcon imgIcon8 = new ImageIcon(getClass().getResource("/Imagenes/"+P.getMontura()));
            Image imgEscalada8;
            Icon iconoEscalado8;
            
            if(null != id)switch (id) {
                case "elfo":
                    imgEscalada8 = imgIcon8.getImage().getScaledInstance(250,220, Image.SCALE_SMOOTH);
                    iconoEscalado8 = new ImageIcon(imgEscalada8);
                    img8.setIcon(iconoEscalado8);
                    img8.setBounds(1000, 210, 250, 220);
                    break;
                case "humano":
                    imgEscalada8 = imgIcon8.getImage().getScaledInstance(250,220, Image.SCALE_SMOOTH);
                    iconoEscalado8 = new ImageIcon(imgEscalada8);
                    img8.setIcon(iconoEscalado8);
                    img8.setBounds(950,170,250,220);
                    break;
                case "orco":
                    imgEscalada8 = imgIcon8.getImage().getScaledInstance(250,200, Image.SCALE_SMOOTH);
                    iconoEscalado8 = new ImageIcon(imgEscalada8);
                    img8.setIcon(iconoEscalado8);
                    img8.setBounds(1000,230,250,200);
                    break;
                default:
                    break;
}
            
        } else if(e.getSource()==b6){
            
            D.añadirEscudo();
            ImageIcon imgIcon7 = new ImageIcon(getClass().getResource("/Imagenes/"+P.getEscudo()));
            Image imgEscalada7;
            Icon iconoEscalado7;
            
            if(null != id)switch (id) {
                case "elfo":
                    imgEscalada7 = imgIcon7.getImage().getScaledInstance(100,100, Image.SCALE_SMOOTH);
                    iconoEscalado7 = new ImageIcon(imgEscalada7);
                    img7.setIcon(iconoEscalado7);
                    img7.setBounds(1010, 190, 130, 130);
                    break;
                case "humano":
                    imgEscalada7 = imgIcon7.getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
                    iconoEscalado7 = new ImageIcon(imgEscalada7);
                    img7.setIcon(iconoEscalado7);
                    img7.setBounds(950,230,130,130);
                    break;
                case "orco":
                    imgEscalada7 = imgIcon7.getImage().getScaledInstance(200,200, Image.SCALE_SMOOTH);
                    iconoEscalado7 = new ImageIcon(imgEscalada7);
                    img7.setIcon(iconoEscalado7);
                    img7.setBounds(950,180,200,200);
                    break;
                default:
                    break;
            }
        } else if(e.getSource()==b7){
            
            Diseñador dis;
            jpan.setLayout(null);
            jpan.removeAll();
            
            ntropas=Integer.parseInt(nTropas.getText());  
            int borde=13;
            int j = 0;
            int k = 0;
            int d = 0;
            JLabel tropas[]=new JLabel[ntropas];
            JLabel armas[]=new JLabel[ntropas];
            JLabel escudos[]=new JLabel[ntropas];
            JLabel monturas[]=new JLabel[ntropas];
            
            for(int l=0;l<ntropas;l++){
                
                if(ntropas<52*(Math.pow(4, l))){
                    d=(int) Math.pow(2, l);
                    borde=borde*d;
                    l=ntropas;
                }    
                
            }
            
            for(int i=0;i<ntropas;i++){
                
                if(i!=0 && i%borde==0){
                        j=j+1;
                        k=0;
                    }
                
                    dis=new Diseñador(P);
                    PrototipoPersonajes prot;
                    prot=dis.retrievePersonaje(id);
                    
                    ImageIcon imgIcon9 = new ImageIcon(getClass().getResource("/Imagenes/"+prot.getAspecto()));
                    Image imgEscalada9 = imgIcon9.getImage().getScaledInstance((int)60/d,(int)60/d, Image.SCALE_SMOOTH);
                    Icon iconoEscalado9 = new ImageIcon(imgEscalada9);
                
                    ImageIcon imgIcon10 = new ImageIcon(getClass().getResource("/Imagenes/"+prot.getArma()));
                    Image imgEscalada10 = imgIcon10.getImage().getScaledInstance((int)30/d,(int)30/d, Image.SCALE_SMOOTH);
                    Icon iconoEscalado10 = new ImageIcon(imgEscalada10);
                    
                    ImageIcon imgIcon11 = new ImageIcon(getClass().getResource("/Imagenes/"+prot.getEscudo()));
                    Image imgEscalada11 = imgIcon11.getImage().getScaledInstance((int)25/d,(int)25/d, Image.SCALE_SMOOTH);
                    Icon iconoEscalado11 = new ImageIcon(imgEscalada11);
                    
                    ImageIcon imgIcon12 = new ImageIcon(getClass().getResource("/Imagenes/"+prot.getMontura()));
                    Image imgEscalada12 = imgIcon12.getImage().getScaledInstance((int)35/d,(int)35/d, Image.SCALE_SMOOTH);
                    Icon iconoEscalado12 = new ImageIcon(imgEscalada12);
                    
                    tropas[i]=new JLabel();
                    tropas[i].setIcon(iconoEscalado9);
                    armas[i]=new JLabel();
                    armas[i].setIcon(iconoEscalado10);
                    escudos[i]=new JLabel();
                    escudos[i].setIcon(iconoEscalado11);
                    monturas[i]=new JLabel();
                    monturas[i].setIcon(iconoEscalado12);
                    
                    jpan.add(escudos[i]);
                    escudos[i].setBounds((int)37/d+(k*70/d),(int)22/d+(int)(j*60/d), (int)25/d,(int)25/d);
                    jpan.add(tropas[i]);
                    tropas[i].setBounds(0+(k*70/d), 0+(int)(j*60/d), (int)60/d,(int)60/d);
                    jpan.add(monturas[i]);
                    monturas[i].setBounds((int)40/d+(k*70/d),(int)20/d+(int)(j*60/d), (int)35/d,(int)35/d);
                    jpan.add(armas[i]);
                    armas[i].setBounds(0+(k*70/d),(int)5/d+(int)(j*60/d), (int)30/d,(int)30/d);
                    
                    k++;
                    
                jpan.validate();
                jpan.repaint();
                 
            }
                
            
        } else if(e.getSource()==b8){
            
            Juego J = new Juego();
            
            J.mostrar();
//            J.pintar();
        }
    
    }
}