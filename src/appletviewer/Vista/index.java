package appletviewer.Vista;

import java.awt.*;
import javax.swing.*;

public class index extends JFrame{
    Color colorBlanck = new Color(47, 56, 64);//color negro
    JPanel p1, p2, p3, p4;
    JButton bGuardar;
    
    public index(){
        setTitle("Comprar Tiquetes");
        setSize(300, 600);
        setLayout(null);
        
        getContentPane().setBackground(colorBlanck);//Fondo
        
        //Panel 1
        
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(20, 25, 255, 80);
        this.add(p1);
        
        //Panel 2
        
        p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(20, 130, 255, 80);
        this.add(p2);
        
        //Panel 3
        
        p3 = new JPanel();
        p3.setLayout(null);
        p3.setBounds(20, 235, 255, 80);
        this.add(p3);
       
        //Panel 4
        
        p3 = new JPanel();
        p3.setLayout(null);
        p3.setBounds(20, 340, 255, 120);
        this.add(p3);
        
        //Button
        
        bGuardar = new JButton();
     
        bGuardar.setBounds(100, 490, 100, 50);
        this.add(bGuardar);
        
        
        setLocationRelativeTo(this);
        setVisible(true);
        this.setResizable(false);
        setDefaultCloseOperation(3);
    }
}
