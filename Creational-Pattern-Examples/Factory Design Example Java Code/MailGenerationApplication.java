import java.io.*;
import java.util.*;
 
/*
 * Demonstration of Factory design pattern
 */
class MailGenerationApplication 
{
	private static Client client = new Client();

/*****************************************************************************************************
 */
public MailGenerationApplication() 
/*****************************************************************************************************/
{	super();
}

/*****************************************************************************************************
 * Precondition: 'MailGenerationApplication.client' != null
 *
 * Postconditions:
 * 	(1) The customer type has been solicited from the user in accordance with getCustomerTypeFromUser()
 *  (2) A mail message has been output the the console for this type of customer
 */
public static void main( String[] args ) 
/*****************************************************************************************************/
{	
	Customer customer = getCustomerTypeFromUser();
	MailGenerationApplication.client.sendMessage( customer );  // let the client do its job 
}

/*****************************************************************************************************
 * Postconditions: 
 * (1) User has been prompted with type of customer
 * (2) MailGenerationApplication.customer is an instance of the type entered if the user's input legitimate
 * (3) MailGenerationApplication.customer is an instance of Newbie if user's input not legitimate
 * (4) The customer type selected has been printed to the console
 */
private static Customer getCustomerTypeFromUser() 
/*****************************************************************************************************/
{ 
	String customerType = "newbie";   // default
	Hashtable customerTypeTable = new Hashtable();   // keys strings to Customer types

	// Key user input to the corresponding type of customer
	customerTypeTable.put( "frequent", new Frequent() );
	customerTypeTable.put( "returning", new Returning() );
	customerTypeTable.put( "curious", new Curious() );
	customerTypeTable.put( "newbie", new Newbie() );
	
	// Get customer type from user (this form minimizes modification whenever customerTypeTable is modified)
	
	System.out.println( "Please pick a type of customer from one of the following:" );
	for ( Enumeration enumeration = customerTypeTable.keys(); enumeration.hasMoreElements() ;)
	{     System.out.println( enumeration.nextElement() );
	}
 
	try   // pick up user's input
	{	BufferedReader bufReader = 
		 new BufferedReader( new InputStreamReader( System.in ) );
		customerType = bufReader.readLine();
	}
	catch( IOException e )
	{	System.out.println( e ); 
	}

	// Return 'Customer' instance according to user's input
	Customer customerSelected =  (Customer)customerTypeTable.get( customerType );
	if( customerSelected != null )
		return customerSelected;
	else   // use default if user input bad
	{	System.out.println( "Sorry: Could not understand your input: newbie customer assumed." );
		return new Newbie();
	}		
}   // end getCustomerTypeFromUser() 

}