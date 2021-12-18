
package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculator {
    JFrame f;
    JTextField t1;
    JButton b1, b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,op1,op2,op3,op4,op5,op6;
    JPanel p1,p2,p3;  
    
    
    Calculator(){
        
        f= new JFrame();
        f.setDefaultCloseOperation(3);

        
        {
        p1=new JPanel();
        p1.setBounds(10,10,420,56);
        p1.setBackground(Color.white);
        
        t1=new JTextField(16);
        t1.setBounds(5,5,40,80);
        Font fo = new Font("Serif", Font.BOLD, 31);
        t1.setFont(fo);}
        
        
        { p2=new JPanel();
        p2.setBounds(10,90,310,465);
        p2.setBackground(Color.white);
        
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b10 = new JButton("00");
        b11 = new JButton("0");
        b12 = new JButton(".");
   
        }
        
        p3=new JPanel();
        p3.setBounds(330,90,100,465);
        p3.setBackground(Color.white);
        
        op1 = new JButton("+");
        op2 = new JButton("-");
        op3 = new JButton("*");
        op4 = new JButton("%");
        op5 = new JButton("/");
        op6 = new JButton("=");
        
        
        f.add(p1);
        p1.add(t1);
        
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b10);
        p2.add(b11);
        p2.add(b12);
        p2.setLayout(new GridLayout(4,3,20,20));
        f.add(p2);
        
        p3.add(op1);
        p3.add(op2);
        p3.add(op3);
        p3.add(op4);
        p3.add(op5);
        p3.add(op6);
        p3.setLayout(new GridLayout(6,1,10,10));
        f.add(p3);
        
        
        f.setSize(450,600);
        f.setLayout(null);
        f.setVisible(true);
        f.setResizable(false);

    }
    
    

    
    public static void main(String[] args) {
        new Calculator();
        
    }
    
}
