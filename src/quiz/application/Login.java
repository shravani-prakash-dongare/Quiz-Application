package quiz.application;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
 JButton btnStart,btnquite;
 JTextField Tname;
    public Login() {
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("login.jpeg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);
        
        JLabel heading=new JLabel ("Simple Minds");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(new Color(30,144,254));
        add(heading);
        
        JLabel Name=new JLabel("Enter Your Name");
        Name.setBounds(810,150,300,20);
        Name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        Name.setForeground(new Color(30,144,254));
        add(Name);
        
        Tname=new JTextField();
        Tname.setBounds(735,200,300,25);
        Tname.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
        add(Tname);
        
        btnStart=new JButton("Start Quiz");
        btnStart.setBounds(735,265,130,40);
        btnStart.setForeground(Color.white);
        btnStart.setBackground(new Color(30,144,254));
        btnStart.setFont(new Font("Mongolian Baiti",Font.BOLD,16));
        btnStart.addActionListener(this);
        add(btnStart);
        
        
        btnquite=new JButton("Back");
        btnquite.setBounds(905,265,130,40);
        btnquite.setForeground(Color.white);
        btnquite.setBackground(new Color(30,144,254));
        btnquite.setFont(new Font("Mongolian Baiti",Font.BOLD,16));
        btnquite.addActionListener(this);
        add(btnquite);
        
        
        setSize(1200,500);
        setLocation(200,150);
        setVisible(true);
   
    }
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()== btnStart ){
            String name=Tname.getText();
            setVisible(false);
            new start(name);
            
        }else if(ae.getSource() == btnquite){
            setVisible(false);
        }
        
    }
    
    public static void main(String[] args) {
        new Login();
        
    }
    
}
