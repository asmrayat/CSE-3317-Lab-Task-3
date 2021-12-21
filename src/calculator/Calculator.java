//Name: Abu Shalehin M.D.Rayat
//ID: 2012020162
//Sec:D
package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculator implements ActionListener {
    JFrame f;
    JTextField t1;
    JButton b1, b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,op1,op2,op3,op4,op5,op6,op7;
    JPanel p1,p2,p3;  
    
    double a=0,b=0,result=0;
    char operator;
    
    
    
    
    Calculator(){
        
        f= new JFrame("Calculator");
        f.setDefaultCloseOperation(3);

        
        
        p1=new JPanel();
        p1.setBounds(10,10,420,56);
        p1.setBackground(Color.white);
        
        t1=new JTextField(16);
        t1.setBounds(5,5,40,80);
        Font fo = new Font("Serif", Font.BOLD, 31);
        t1.setFont(fo);
        
        
        p2=new JPanel();
        p2.setBounds(10,90,310,465);
        p2.setBackground(Color.white);
        
        b1 = new JButton("1");
        b1.setFont(fo);
        b2 = new JButton("2");
        b2.setFont(fo);
        b3 = new JButton("3");
        b3.setFont(fo);
        b4 = new JButton("4");
        b4.setFont(fo);
        b5 = new JButton("5");
        b5.setFont(fo);
        b6 = new JButton("6");
        b6.setFont(fo);
        b7 = new JButton("7");
        b7.setFont(fo);
        b8 = new JButton("8");
        b8.setFont(fo);
        b9 = new JButton("9");
        b9.setFont(fo);
        b10 = new JButton("00");
        b10.setFont(fo);
        b11 = new JButton("0");
        b11.setFont(fo);
        b12 = new JButton(".");
        b12.setFont(fo);
   
        
        
        p3=new JPanel();
        p3.setBounds(330,90,100,465);
        p3.setBackground(Color.white);
        
        op1 = new JButton("+");
        op1.setFont(fo);
        op2 = new JButton("-");
        op2.setFont(fo);
        op3 = new JButton("*");
        op3.setFont(fo);
        op4 = new JButton("%");
        op4.setFont(fo);
        op5 = new JButton("/");
        op5.setFont(fo);
        op6 = new JButton("=");
        op6.setFont(fo);
        op7 = new JButton("CLR");
        op7.setFont(fo);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        op1.addActionListener(this);
        op2.addActionListener(this);
        op3.addActionListener(this);
        op4.addActionListener(this);
        op5.addActionListener(this);
        op6.addActionListener(this);
        op7.addActionListener(this);
        
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
        p3.add(op7);
        p3.setLayout(new GridLayout(7,1,10,10));
        f.add(p3);
        
        
        f.setSize(450,600);
        f.setLayout(null);
        f.setVisible(true);
        f.setResizable(false);

    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==b1)
            t1.setText(t1.getText().concat("1"));
        if(e.getSource()==b2)
            t1.setText(t1.getText().concat("2"));
        if(e.getSource()==b3)
            t1.setText(t1.getText().concat("3"));
        if(e.getSource()==b4)
            t1.setText(t1.getText().concat("4"));
        if(e.getSource()==b5)
            t1.setText(t1.getText().concat("5"));
        if(e.getSource()==b6)
            t1.setText(t1.getText().concat("6"));
        if(e.getSource()==b7)
            t1.setText(t1.getText().concat("7"));
        if(e.getSource()==b8)
            t1.setText(t1.getText().concat("8"));
        if(e.getSource()==b9)
            t1.setText(t1.getText().concat("9"));
        if(e.getSource()==b10)
            t1.setText(t1.getText().concat("00"));
        if(e.getSource()==b11)
            t1.setText(t1.getText().concat("0"));
        if(e.getSource()==b12)
            t1.setText(t1.getText().concat("."));
        
        if(e.getSource()==op1){
            
            a=Double.parseDouble(t1.getText());
            operator=1; 
            t1.setText("");
        }
        
            
        if(e.getSource()==op2){
            
            a=Double.parseDouble(t1.getText());
            operator=2;
            t1.setText("");
        }
            
        if(e.getSource()==op3){
           
            a=Double.parseDouble(t1.getText());
            operator=3;
            t1.setText("");
        }
        if(e.getSource()==op4){
            
            a=Double.parseDouble(t1.getText());
            operator=4;
            t1.setText("");
        }
        if(e.getSource()==op5){
            
            a=Double.parseDouble(t1.getText());
            operator=5;
            t1.setText("");
        }
        if(e.getSource()==op6){
            b=Double.parseDouble(t1.getText());
            switch(operator){
                case 1 -> result =a+b;
                case 2 -> result =a-b;
                case 3 -> result =a*b;
                case 4 -> result =a/b;
                case 5 -> result =a%b;
                default -> result=0;
            }
            t1.setText(""+result);
        }
        if(e.getSource()==op7) {
        	t1.setText("");
        }
    }
    
    

    
    public static void main(String[] args) {
        new Calculator();
        
    }
    
}
