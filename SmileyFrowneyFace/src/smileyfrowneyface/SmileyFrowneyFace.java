/*
 * Author: Rodi Murad
 * Title: Smiley frowny face
 * Class: CIT130
 * Assignment: 5
 * Date: 06/20/2015
 */
package smileyfrowneyface;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SmileyFrowneyFace extends JFrame
{
    //specify width and height of the window
    final int window_width = 600;
    final int window_height = 600;  
    //specify the face diameter and its x and y corrdinates
    final int face_diameter = 300;
    final int x_face = 150;
    final int y_face = 150;
    //eye specs
    final int eye_width = 35;
    final int eye_height = 25;
    final int x_right_eye = x_face + 80;
    final int y_right_eye = y_face + 55;
    final int x_left_eye = x_face + 190;
    final int y_left_eye = y_face + 55;
    //mouth specs
    final int mouth_width = 150;
    final int mouth_height = 65;
    final int x_mouth = x_face + 75;
    final int y_mouth = y_face + 160;
    final int mouth_start_angle = 180;
    final int mouth_arc_sweep = 180;
    //smile is used to determine which condition is true so that when the button is clicked
    //it will reverse the condition
    private boolean smile;
    
    public JButton SmileFrownButton;
    
    public static void main(String[] args) 
    {
        //drawing constructor and making it visible
        SmileyFrowneyFace dwg = new SmileyFrowneyFace();
        dwg.setVisible(true);
    }
        
    public SmileyFrowneyFace()
            {
                
                setSize(window_width, window_height);//set window size
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //default operation of the close button
                setTitle("Smiley/FrouneyFace"); //set the title of hte window
                setLayout(new BorderLayout() ); //
                getContentPane().setBackground(Color.white);
                //setVisible(true);
                
                //declaring the button, its text, location and the value of smile
                SmileFrownButton = new JButton("Smile/Froun");
                SmileFrownButton.addActionListener(new SmileFrown());
                add(SmileFrownButton, BorderLayout.SOUTH);
                //SmileFrownButton.setPreferredSize(new Dimension(20, 30));
                smile = false;
            }
    
    private class SmileFrown implements ActionListener
    {
        //repaint the the mouth depending on the condition of smile
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
