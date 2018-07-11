/*
 * 
 */
package frameproject;
import java.awt.Color;
import javax.swing.JFrame;
public class frameWidget extends JFrame{
    private static final int width = 200;
    private static final int height = 300;
    
    public frameWidget(){
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//unnecessary
        getContentPane().setBackground(Color.BLUE);//unnecessary
        
    }
    
}
