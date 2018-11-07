
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

public class Juego extends JFrame implements ActionListener{
    
    static JPanel jpan;
    static int i=0;
    
    JButton b1 = new JButton("Correr");
    
    static JLabel tropas[][]=new JLabel[20][10];
    
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
        jpan.setBounds(0,0, 1025, 550);
        jpan.setOpaque(true);
        jpan.setBackground(new Color(37,119,255));
        
        b1.setBackground(Color.MAGENTA);
        b1.setBounds(1050, 100, 200, 30);
        b1.addActionListener(this);
        
        c.add(jpan);
        c.add(b1);
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
     
           timer.schedule(task, 1000, 1000);

        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==b1){
        
           imprimir();
                
        }
        
    }
    

}
