/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Shravani
 */
public class score extends JFrame implements ActionListener{
    score(String name,int score){
        setBounds(600, 150, 750, 550);
        getContentPane().setBackground(Color.white);
        setLayout(null);
       
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("score.png"));
        Image i2=i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0, 200, 300, 250);
        add(image);
        
        JLabel heading=new JLabel("Thank You "+name+" for playing Simple Minds");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tahoma",Font.PLAIN,26));
         add(heading);
         
         JLabel lblscore=new JLabel("Your Score is "+ score);
        lblscore.setBounds(350,200,300,30);
        lblscore.setFont(new Font("Tahoma",Font.PLAIN,26));
         add(lblscore);
         
        JButton submit=new JButton("Play Again");
        submit.setBounds(380, 270, 120, 30);
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        
         setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    public static void main(String[] args) {
        new score("User",0);
    }
    
}
