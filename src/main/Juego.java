/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;

/**
 *
 * @author danbr
 */
public class Juego extends JFrame {
    
    public void mostrar(){
        
        Juego J=new Juego();
        J.setSize(1300,700);
        J.setVisible(true);
        
        
    }
    
    public Juego(){
        Container c=getContentPane();
        c.setLayout(null);
        this.getContentPane().setBackground(new Color(37,119,25));
    }
    
}
