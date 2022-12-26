/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum22;

import javax.swing.JFrame;
import java.awt.*;
import static java.awt.Color.black;
import javax.swing.*;
import javax.swing.border.EmptyBorder;


/**
 *
 * @author LENOVO
 */
public class GUI extends JFrame {
  
    
    public static void main(String[] args) {
    

    GUI frame = new GUI(); //Frame
    frame.setBounds(0,0,1300,790);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(GUI.DISPOSE_ON_CLOSE);
    frame.setLayout (null);
    frame.setResizable(false);
    
    JPanel  panel_r = new JPanel(); //Background kanan
    panel_r.setBackground(new Color(232,232,232));
    frame.add(panel_r);
    panel_r.setBounds(635,16,635,731);
    
    JPanel  panel_full = new JPanel(); //background Besar
    panel_full.setBackground(new Color(48,71,94));
    frame.add(panel_full);
    panel_full.setBounds(0,0,1300,763);
   
    JLabel question = new JLabel(); //text pertanyaan
    question.setFont(new java.awt.Font("Tahoma", 1, 11));
    question.setForeground(new Color(255,0,0));
    frame.add(question);
    question.setText("Register");
   
    JLabel title = new JLabel(); // title
    title.setText("NETFAZZ");
    title.setForeground(new Color(240,84,84));
    title.setFont(new Font("Arial",1,10));
    frame.add(title);
    title.setBounds(100,100,30,50);
    
    JTextField username = new JTextField(); //kotak username
    username.setBackground(new Color(48,71,94));
    username.setForeground(new Color(232,232,232));
    username.setBorder(new EmptyBorder(0,10,0,0));
    frame.add(username);
    username.setBounds(700,200,512,40);
    
    JPasswordField password = new JPasswordField(); // kotak password
    password.setBackground(new Color(48,71,94));
    password.setForeground(new Color(232,232,232));
    password.setBorder(new EmptyBorder(0,10,0,0));
    frame.add(password);
    password.setBounds(700,270,512,40);
    
    JButton button = new JButton(); //tombol masuk
    button.setBackground(new Color(240,84,84));
    button.setForeground(new Color(232,232,232));
    button.setText("MASOK");
    button.setFont(new Font("Arial",1,14));
    frame.add(button);
    button.setBounds(700,330,512,40);
   
    JLabel 
   
    
  
}
     }
