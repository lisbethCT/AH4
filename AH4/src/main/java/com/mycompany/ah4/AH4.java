

package com.mycompany.ah4;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class AH4 {
JFrame f = new JFrame();
JPanel p = new JPanel();

    public void form(){
        f.setTitle("AH4");
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setBounds(300, 200, 450, 400);
        f.setVisible(true);
        
        p.setBackground(Color.cyan);
        p.setLayout(null);
        f.add(p);
        
        //CODIGO
        JLabel l1= new JLabel("Codigo:");
        l1.setBounds(50, 50, 100, 25);//x,y,w,h
        p.add(l1); 
        
        JTextField tfCodigo = new JTextField();
        tfCodigo.setBounds(300, 50, 100, 25);
        p.add(tfCodigo);
        
        //Nombre del producto
        JLabel l2= new JLabel("Nombre del producto:");
        l2.setBounds(50, 100, 200, 25);
        p.add(l2); 
        
        JTextField tfNomPro = new JTextField();
        tfNomPro.setBounds(300, 100, 100, 25);
        p.add(tfNomPro);
       
        //Cantidad del producto
        JLabel l3= new JLabel("Cantidad del producto:");
        l3.setBounds(50, 150, 200, 25);
        p.add(l3); 
        
        JTextField tfCantP = new JTextField();
        tfCantP.setBounds(300, 150, 100, 25);
        p.add(tfCantP);
        
        //Lugar de fabricacion o produccion
        JLabel l4= new JLabel("Lugar de fabricacion o produccion:");
        l4.setBounds(50, 200, 350, 25);
        p.add(l4); 
        
        JTextField tfLugarFP = new JTextField();
        tfLugarFP.setBounds(300, 200, 100, 25);
        p.add(tfLugarFP);
        
        //Fecha de ingreso del producto
        JLabel l5= new JLabel("Fecha de ingreso del producto:");
        l5.setBounds(50, 250, 350, 25);
        p.add(l5); 
        
        JTextField tfFechaP = new JTextField();
        tfFechaP.setBounds(300, 250, 100, 25);
        p.add(tfFechaP);
        
        //Boton
        JButton  bt = new JButton("Enviar");
        bt.setBounds(300, 300, 100, 25);
        p.add(bt);
        
                
        ActionListener guardar = (ActionEvent e) -> {
            Insertar base = new Insertar();
            base.crear(Integer.parseInt(tfCodigo.getText()),
                    tfNomPro.getText(),
                    Integer.parseInt(tfCantP.getText()),
                    tfLugarFP.getText(),
                    tfFechaP.getText()
            );
        };
        
         bt.addActionListener(guardar);
         
        
    }
        
    
    
    public static void main(String[] args) {
        AH4 crud = new AH4();
        crud.form();
       
    }
}
