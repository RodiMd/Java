/*
 * Author: Rodi Murad
 * Class: CIT 130
 * Assignment: 9 - 1
 * Title: Calculator
 * Date: 07/24/2015
 */

package calculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WidgetDemoFrame extends JFrame implements ActionListener{

     private JTextField jb = new JTextField();
     private int result = 0;
     private int num1 = 0;
     private int num2 = 0;
     private int operator;
     
     public WidgetDemoFrame() {
                
        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu();
        JMenuItem menuFileExit = new JMenuItem();
        Container c = getContentPane();
        c.setBackground(Color.YELLOW);
        
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b0 = new JButton("0");
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton divide = new JButton("/");
        JButton multiply = new JButton("*");
        JButton clear = new JButton("C");
        JButton equals = new JButton("=");       
        
        setLayout(new GridLayout(5,1));
        JPanel r1 = new JPanel();
        r1.setBackground(Color.RED);
        JPanel r2 = new JPanel();
        r2.setBackground(Color.WHITE);
        JPanel r3 = new JPanel();
        r3.setBackground(Color.BLUE);
        JPanel r4 = new JPanel();
        r4.setBackground(Color.YELLOW);
        JPanel r5 = new JPanel();
        r5.setBackground(Color.CYAN);
        add(r1);
        add(r2);
        add(r3);
        add(r4);
        add(r5);
        r1.setLayout(new GridLayout(1,1));
        r1.add(jb);
        r2.setLayout(new GridLayout(1,4));
        r2.add(b1);
        r2.add(b2);
        r2.add(b3);
        r2.add(plus);
        r3.setLayout(new GridLayout(1,4));
        r3.add(b4);
        r3.add(b5);
        r3.add(b6);
        r3.add(minus);
        r4.setLayout(new GridLayout(1,4));
        r4.add(b7);
        r4.add(b8);
        r4.add(b9);
        r4.add(divide);
        r5.setLayout(new GridLayout(1,4));
        r5.add(clear);
        r5.add(b0);
        r5.add(equals);
        r5.add(multiply);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        
        clear.addActionListener(this);
        equals.addActionListener(this);
        minus.addActionListener(this);
        divide.addActionListener(this);
        multiply.addActionListener(this);
        plus.addActionListener(this);        
        
        menuFile.setLabel("File");
        menuFileExit.setLabel("Exit");
        
   
        // Add action listener.for the menu button
        menuFileExit.addActionListener
        (
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    WidgetDemoFrame.this.windowClosed();                     
                }
            }
        ); 
        menuFile.add(menuFileExit);
        menuBar.add(menuFile);
        
        setTitle("WidgetDemo");
        setJMenuBar(menuBar);
        setSize(new Dimension(300, 400));
        
        // Add window listener.
        this.addWindowListener
        (
            new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    WidgetDemoFrame.this.windowClosed();
                }
            }
        );  
    }
    
    public void actionPerformed(ActionEvent e){
        
    	String bs = e.getActionCommand();
        
        
        if (bs.equals("1")){
            //plus.setEnable(true); tried this to enable and disable buttons depending on buttons clicked
            //but this did not work
            String x = jb.getText();
            jb.setText(x);
            num1 = (num1 * 10) + Integer.parseInt(bs);
            jb.setText(Integer.toString(num1));      
            System.out.println("you have entered" + num1);
            
            //catch a number format exception
        try{
            if (bs.equals("+")){
                //String x = jb.getText();
                operator = 1;
                jb.setText (x + "+");
                num2 = (num2 * 10) + Integer.parseInt(bs);
                jb.setText(Integer.toString(num2));
                System.out.println("you have entered" + num2);
            }
            if (bs.equals("-")){
                //String x = jb.getText();
                operator = 2;
                jb.setText(x + "-");
                num2 = (num2 * 10) + Integer.parseInt(bs);
                jb.setText(Integer.toString(num2));
            }
            if (bs.equals("*")){
                //String x = jb.getText();
                operator = 3;
                jb.setText(x + "*");
                num2 = (num2 * 10) + Integer.parseInt(bs);
                jb.setText(Integer.toString(num2));
            }
            if (bs.equals("/")){
                //String x = jb.getText();
                operator = 4;
                jb.setText(x + "/");
                num2 = (num2 * 10) + Integer.parseInt(bs);
                jb.setText(Integer.toString(num2));
            }
        
        }
        catch(NumberFormatException nfe){
            System.out.println(nfe);
        }
        }
        
    	if(bs.equals("2")){
    	   String x = jb.getText();
    	   jb.setText(x+ "2");
           num1 = (num1 * 10) + Integer.parseInt(bs);
           jb.setText(Integer.toString(num1));
           
    	}
    	if(bs.equals("3")){
    	
    	   String x = jb.getText();
    	   jb.setText(x+"3");
           num1 = (num1 * 10) + Integer.parseInt(bs);
            jb.setText(Integer.toString(num1));
           
    	}
        if(bs.equals("4")){
            String x = jb.getText();
            jb.setText(x+"4");
            num1 = (num1 * 10) + Integer.parseInt(bs);
            jb.setText(Integer.toString(num1));
        }
    	if(bs.equals("5")){
            String x = jb.getText();
            jb.setText(x + "5");
            num1 = (num1 * 10) + Integer.parseInt(bs);
            jb.setText(Integer.toString(num1));
        }
        if(bs.equals("6")){
            String x = jb.getText();
            jb.setText(x + "6");
            num1 = (num1 * 10) + Integer.parseInt(bs);
            jb.setText(Integer.toString(num1));
        }
        if(bs.equals("7")){
            String x = jb.getText();
            jb.setText(x + "7");
            num1 = (num1 * 10) + Integer.parseInt(bs);
            jb.setText(Integer.toString(num1));
        }
        if(bs.equals("8")){
            String x = jb.getText();
            jb.setText(x + "8");
            num1 = (num1 * 10) + Integer.parseInt(bs);
            jb.setText(Integer.toString(num1));
         
        }
        if(bs.equals("9")){
            String x = jb.getText();
            jb.setText(x + "9");
            num1 = (num1 * 10) + Integer.parseInt(bs);
            jb.setText(Integer.toString(num1));
           
        }
        if(bs.equals("0")){
            String x = jb.getText();
            jb.setText(x + "0");
            num1 = (num1 * 10) + Integer.parseInt(bs);
            jb.setText(Integer.toString(num1));
        }
        
        //cases that would be used depending on the users button press. 
        if (bs.equals("=")){
                String x = jb.getText();
                jb.setText(x + "=");
                switch(operator){
                    case 1:
                        result = num1 + num2;
                        System.out.println("you entered operator " + operator+ ", num1 " + num1 + ", num2 " + num2 + "result " + result);
                        break;
                    case 2:
                        result = num1 - num2;
                        System.out.println("you entered operator " + operator+ ", num1 " + num1 + ", num2 " + num2 +"result " + result);
                        break;
                    case 3:
                        result = num1 * num2;
                        System.out.println("you entered operator " + operator+ ", num1 " + num1 + ", num2 " + num2 + "result " + result);
                        break;
                    case 4:
                        result = num1 / num2;
                        System.out.println("you entered operator " + operator+ ", num1 " + num1 + ", num2 " + num2 + "result " + result);
                        break;
                }
                jb.setText(Integer.toString(result));
        }
  
        if(bs.equals("C")){
            String x = jb.getText();
            result = 0;
            num1 = 0;
            num2 = 0;
            jb.setText("");
        }
    }
    /**
     * Shutdown procedure when run as an application.
     */
    protected void windowClosed() {
    	
        // Exit application.
        System.exit(0);
    }
}
