/*
 * Author: Rodi Murad
 * course: CIT130
 * Title: Sierpinski Gasket
 * Assignment: 9 - 2
 * Date: 07/18/2015
 */
package serpinskigasket;
import java.util.*;
import java.awt.*;
import javax.swing.*; //needed for JFrame

public class SerpinskiGasket extends JFrame {

    //specify window dimensions
    final int wWidth = 500;
    final int wLength = 600;
    
    //specify triangle points
    float x1 = 50;
    float x2 = 450;
    float x3 = 250;
    float y1 = 500;
    float y2 = 500;
    float y3 = 50;
    float h = 200;
    float v = 500;
    float dx;
    float dy;
    
    //generate a random number
    int number;
    
    public SerpinskiGasket(){
    
        setSize(wWidth, wLength);//set window size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //default operation of the close button
        setTitle("Serpinski Gasket"); //set the title of hte window
       // setLayout(new BorderLayout() ); //
        getContentPane().setBackground(Color.white);
        
}
    public void paint(Graphics g){
        
        super.paint(g);
        g.drawLine((int)x1, (int)y1, (int)x1, (int)y1);
        g.drawLine((int)x2, (int)y2, (int)x2, (int)y2);
        g.drawLine((int)x3, (int)y3, (int)x3, (int)y3);
        
        //random number needed for choosing the side of the triangle to develop
        Random randomNumber = new Random();
        
        for (int i = 0; i <= 100000; i++)
        {
            number = randomNumber.nextInt(3) + 1;
            if (number == 1){
                dx = h + x1;
                dy = v + y1;
                h = Math.abs(dx/2);
                v = Math.abs(dy/2);
            }
            else if (number == 2)
            {
                dx = h + x2;
                dy = v + y2;
                h = Math.abs(dx/2);
                v = Math.abs(dy/2);
            }
            else{
                dx = h + x3;
                dy = v + y3;
                h = Math.abs(dx/2);
                v = Math.abs(dy/2);
            }
            g.drawLine((int)h, (int) v, (int) h, (int) v);
        }
        
    }
    public static void main(String[] args) {       
        SerpinskiGasket dwg = new SerpinskiGasket();
        dwg.setVisible(true);
    }
    
}
