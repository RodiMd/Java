/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animationball;

/*
 * AnimationBall
 *
 * Kenneth L Moore
 *
 **/
 
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Color;

public class AnimationBall extends JFrame
{
    public static final int WINDOW_WIDTH = 450;
    public static final int WINDOW_HEIGHT = 400;

    public static final int FACE_DIAMETER = 200;
    public static final int X_FACE = 100;
    public static final int Y_FACE = 100;

    public static final int EYE_WIDTH = 20;
    public static final int EYE_HEIGHT = 10;
    public static final int X_RIGHT_EYE = X_FACE + 55;
    public static final int Y_RIGHT_EYE = Y_FACE + 60;
    public static final int X_LEFT_EYE = X_FACE + 130;
    public static final int Y_LEFT_EYE = Y_FACE + 60;

    public static final int MOUTH_WIDTH = 100;
    public static final int MOUTH_HEIGHT = 50;
    public static final int X_MOUTH = X_FACE + 50;
    public static final int Y_MOUTH = Y_FACE + 100;
    public static final int MOUTH_START_ANGLE = 180;
    public static final int MOUTH_ARC_SWEEP = 180;

    private boolean wink; 

    private class WinkAction implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        {
            wink = true; 
            repaint( );
        }
    } // End of WinkAction inner class


    public static void main(String[] args)
    {
        AnimationBall drawing = new AnimationBall( );
        drawing.setVisible(true);
    }

    public AnimationBall( )
    {
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Hello There!"); 
        setLayout(new BorderLayout( ));
    }

    public void paint(Graphics g)
    {
    	int x = X_RIGHT_EYE, y = Y_RIGHT_EYE; 
    	int XINC = 1, YINC = -2;
    	while(true){
           //super.paint(g);
           g.setColor(Color.RED);
           g.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
           try{
             Thread.sleep(5);
           }
           catch(InterruptedException ie){System.exit(0);}
           g.setColor(Color.WHITE);
           g.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
           x+=XINC; y+=YINC;
           if(x < 20)XINC=-XINC;
           if(y < 20)YINC=-YINC;
           if(x > 430)XINC=-XINC;
           if(y > 380)YINC=-YINC;
    	}
    }

}

