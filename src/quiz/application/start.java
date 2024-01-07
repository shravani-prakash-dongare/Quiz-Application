/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz.application;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Shravani
 */
public class start extends JFrame implements ActionListener{
String name;
JButton next,btnquite;
    start(String name) {
        setSize(800, 650);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setLocation(350, 100);
        setVisible(true);
        
        JLabel heading=new JLabel ("Welcome "+name+" to Simple Minds.");
        heading.setBounds(30,20,700,30);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
        heading.setForeground(new Color(30,144,254));
        add(heading);
        
        JLabel rules=new JLabel ();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,16));
        rules.setText(
            "<html>"+
                    "1. Choose One Options"+"<br><br>"+
                    "2. Each Question have 2 marks "+"<br><br>"+
                    "3.Rule 3............"+"<br><br>"+
                    "4.Rule 4............ "+"<br><br>"+
                    "5. Rule 5............"+"<br><br>"+
                    "6. Rule 6............ "+"<br><br>"+
                    "7. Rule 7............ "+"<br><br>"+
                    "8. Rule 8............ "+"<br><br>"+
            "</html>"
        );
        add(rules);
        
        
        next=new JButton("next");
        next.setBounds(250,500,100,30);
        next.setForeground(Color.white);
        next.setBackground(new Color(30,144,254));
        next.setFont(new Font("Mongolian Baiti",Font.BOLD,16));
        next.addActionListener(this);
        add(next);
        
        
        btnquite=new JButton("Back");
        btnquite.setBounds(400,500,100,30);
        btnquite.setForeground(Color.white);
        btnquite.setBackground(new Color(30,144,254));
        btnquite.setFont(new Font("Mongolian Baiti",Font.BOLD,16));
        btnquite.addActionListener(this);
        add(btnquite);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== next){
            setVisible(false);
            new Quiz(name);
        }else if(ae.getSource()==btnquite){
            setVisible(false);
            new Login();   
        }
    }
    public static void main(String args[]) {
        new start("user");
    }

}
