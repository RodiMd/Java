/*
 */
package displayimage;

public class usrInput {
    
    private String input;
    private String r;
    public void setInput (String inpt){
        input = inpt;
        if ((input).equals("quit"))
            System.out.println("Application Terminated");
        else
            System.out.println("show image");//need a statement to search a file
    }
    public String getInput (){
        return input;
    }
    
}