/*
* Rodi Murad
* 4/18/2017
* CSCI 716
 */
package displayimage;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class DisplayImage {

    public static void main(String[] args) 
    {
        
        //obtain input from command window
        Scanner input = new Scanner(System.in);
        String imageName = null;
        String x = null;
        
        while ((x)!=("quit"))
        {
            //prints message for user to enter the image name
            System.out.print( "Enter the name of image desired to display or quit to exit application: " );
            imageName = input.nextLine();
            
            usrInput myUsrInput = new usrInput();
            myUsrInput.setInput(imageName);
            JFrame application = new JFrame();
            ImageIcon labelIcon = new ImageIcon("MantisShrimp.gif");
            JLabel centerLabel = new JLabel (labelIcon);
            x = myUsrInput.getInput();
            
            application.setDefaultCloseOperation (JFram.EXIT_ON_CLOSE);
            if ((x).equals("quit")){
                break;
            }
            else{
                application.add(centerLabel, BorderLayout.CENTER);
                application.setSize(300,300);
                application.setVisible(true);
            }
                   
        }        
    }
}


