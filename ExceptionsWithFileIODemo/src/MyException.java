
    public class MyException extends Exception{

    	// default constructor
    	public MyException(){
    		super("default message");
    	}
    	
    	// set message constructor
    	public MyException(String s){
    		super(s);
    	}

    }