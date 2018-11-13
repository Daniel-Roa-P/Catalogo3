package main;

import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Juego extends JFrame implements ActionListener{
    
    static JPanel jpan;
    static int i=0;
    
    JButton b1 = new JButton("Crear mapa");
    JButton b2 = new JButton("Ingresar elfo");
    JButton b3 = new JButton("Ingresar Humano");
    JButton b4 = new JButton("Ingresar Orco");
    
    JLabel personaje;
    JLabel matriz[][]=new JLabel[21][11];
    JLabel posX = new JLabel("posicion X:");
    JLabel posY = new JLabel("posicion Y:");
    JLabel elfos = new JLabel("Elfos restantes: 10");
    JLabel humanos = new JLabel("Humanos restantes: 0");
    JLabel orco = new JLabel("Orcos restantes: 0");
    static JLabel tropas[][]=new JLabel[20][10];
    
    JTextField textoX=new JTextField();
    JTextField textoY=new JTextField();
    
    javax.swing.border.Border border = LineBorder.createBlackLineBorder();
    
    public void mostrar(){
        
        Juego J=new Juego();
        J.setSize(1300,700);
        J.setVisible(true);
           
    }
    
    public Juego(){
        
        Container c=getContentPane();
        c.setLayout(null);
        this.getContentPane().setBackground(new Color(37,119,25));
        
        jpan=new JPanel();
        jpan.setBounds(0,0, 1075, 600);
        jpan.setOpaque(true);
        jpan.setBackground(new Color(37,119,255));
        
        b1.setBackground(Color.MAGENTA);
        b1.setBounds(1100, 100, 170, 30);
        b1.addActionListener(this);
        b2.setBackground(Color.ORANGE);
        b2.setBounds(1100, 400, 170, 30);
        b2.addActionListener(this);
        b3.setBackground(Color.ORANGE);
        b3.setBounds(1100, 450, 170, 30);
        b3.addActionListener(this);
        b4.setBackground(Color.ORANGE);
        b4.setBounds(1100, 500, 170, 30);
        b4.addActionListener(this);
        
        posX.setBounds(1100, 330, 100, 20);
        posY.setBounds(1100, 370, 100, 20);
        elfos.setBounds(1100, 250, 200, 20);
        humanos.setBounds(1100, 275, 200, 20);
        orco.setBounds(1100, 300, 200, 20);
 
        textoX.setBounds(1170, 330, 20, 20);
        textoY.setBounds(1170, 370, 20, 20);
        
        c.add(jpan);
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(posX);
        c.add(posY);
        c.add(elfos);
        c.add(humanos);
        c.add(orco);
        c.add(textoX);
        c.add(textoY);
    }
    
    public static void imprimir(){
        
        Timer timer=new Timer();
                
        TimerTask task;
            
        task = new TimerTask(){
            
            @Override
            public void run(){
                
                ImageIcon imgIcon1 = new ImageIcon(getClass().getResource("/Imagenes/elfo2.png"));
                Image imgEscalada1 = imgIcon1.getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH);
                Icon iconoEscalado1 = new ImageIcon(imgEscalada1);
                
                    for(int j=0;j<10;j++){
                        
                    tropas[i][j]=new JLabel();
                    tropas[i][j].setIcon(iconoEscalado1);
                    jpan.add(tropas[i][j]);
                    tropas[i][j].setBounds(50*i, 50*j, 50, 50);
                    
                    if(i>0){
                        
                    jpan.remove(tropas[i-1][j]);
                    jpan.repaint();
                    
                    }
                    }    
                    
                    
                    
                    if(i<19){
                        i++;
                    } else {
                        timer.cancel();
                    }
                    
            }
        };
     
           timer.schedule(task, 1000, 500);

        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==b1){
            
        for(int k=0;k<21;k++){
                
            for(int j=0;j<11;j++){
                    
                if(k==0){
                    
                    matriz[k][j]=new JLabel(String.valueOf(j));
                    matriz[k][j].setBackground(Color.GRAY);
                    matriz[k][j].setOpaque(true);
                    matriz[k][j].setBorder(border);
                    matriz[k][j].setHorizontalAlignment(SwingConstants.CENTER);
                    
                } else if(j==0){
                   
                    matriz[k][j]=new JLabel(String.valueOf(k)); 
                    matriz[k][j].setBackground(Color.GRAY);
                    matriz[k][j].setOpaque(true);
                    matriz[k][j].setBorder(border);
                    matriz[k][j].setHorizontalAlignment(SwingConstants.CENTER);
                    
                } else {
                
                    matriz[k][j]=new JLabel("");
                    matriz[k][j].setBorder(border);
                }
                
                jpan.add(matriz[k][j]);
                matriz[k][j].setBounds(50*k, 50*j, 50, 50);
                
            }
        } 
        }
        
    }
    
}
    
    