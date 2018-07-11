/* 
 * 
 */
package smileyfrouneyface;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SmileyFrouneyFace extends JFrame 
{
    final int window_width = 600;
    final int window_height = 600;  
    
    final int face_diameter = 300;
    final int x_face = 150;
    final int y_face = 150;
    
    final int eye_width = 35;
    final int eye_height = 25;
    final int x_right_eye = x_face + 80;
    final int y_right_eye = y_face + 55;
    final int x_left_eye = x_face + 190;
    final int y_left_eye = y_face + 55;
    
    final int mouth_width = 150;
    final int mouth_height = 65;
    final int x_mouth = x_face + 75;
    final int y_mouth = y_face + 160;
    final int mouth_start_angle = 180;
    final int mouth_arc_sweep = 180;
    
    private boolean smile;
    
    public JButton SmileFrounButton;
    
    public static void main(String[] args) {
        
        SmileyFrouneyFace dwg = new SmileyFrouneyFace();
        dwg.setVisible(true);
    }
        
    public SmileyFrouneyFace()
            {
                setSize(window_width, window_height);//set window size
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //default operation of the close button
                setTitle("Smiley/FrouneyFace"); //set the title of hte window
                setLayout(new BorderLayout() ); //
                getContentPane().setBackground(Color.white);
                //setVisible(true);
                
                SmileFrounButton = new JButton("Smile/Froun");
                SmileFrounButton.addActionListener(new SmileFroun());
                add(SmileFrounButton, BorderLayout.SOUTH);
                smile = false;
            }
    
    private class SmileFroun implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
         if (smile)
             smile = false;
         else
             smile = true;
         repaint(); //repaints the image to show frown or smile
        }
    }
    
    public void paint(Graphics g)
    {
     super.paint(g);  
     g.drawOval(x_face, y_face, face_diameter, face_diameter);
     g.fillOval(x_right_eye, y_right_eye, eye_width, eye_height);
     g.fillOval(x_left_eye, y_left_eye, eye_width, eye_height);
     
     if (smile)
         g.drawArc(x_mouth, y_mouth, mouth_width, mouth_height, mouth_start_angle, mouth_arc_sweep);
     else
         g.drawArc(x_mouth, y_mouth, mouth_width, mouth_height, - mouth_start_angle, - mouth_arc_sweep);
     
    }

}
