import java.util.*; 
import java.io.*;

/**
 * Initalizes application and initiates client
 */

class Setup 
{
	
/*********************************************************************************
 */
public Setup() 
/*********************************************************************************/
{	super();
}

/*********************************************************************************
 * Postconditions
 * 	(1) The application has solicited a company name
 *  (2) The user has provided a company name
 *  (3) The application has solicited the customer type for employees of this company
 *  (4) The user has provided a type for employees -- otherwise this is taken for "medium"
 *  (5) 'customerPrototype' in the 'OfficeProcess' object has been set accordingly
 *  (6) The postconditions of 'doOfficeProcess()' of 'Client' apply.
 */
public static void main( String[] args )
/*********************************************************************************/
{	
	OfficeProcess officeProcess = OfficeProcess.getOfficeProcess();   // the singleton

	// Get company information (see postconditions 1 and 2)

	System.out.println( "Enter company name" );
	String companyName = "not yet selected";
	try   
	{	BufferedReader bufReader = 
		 new BufferedReader( new InputStreamReader( System.in ) );
		companyName = bufReader.readLine();
	}
	catch( IOException e )
	{	System.out.println( e ); 
	}
	System.out.println( "Now the application would collect lots more company information ...." );

	// Get type of customer that the company has chosen	(see postconditions 3 and 4)
	
	// Relate strings to prototype Customer objects
	Hashtable customerTypeHashtable = new Hashtable();
	customerTypeHashtable.put( "low", new LoVolCustomer( companyName ) );
	customerTypeHashtable.put( "medium", new MedVolCustomer( companyName ) );
	customerTypeHashtable.put( "high", new HiVolCustomer( companyName ) );
	
	// Solicit customer type from user  	
	System.out.println( "\nPlease pick a type of customer from one of the following:"  	
	 + "('medium' will be assumed otherwise)" );
	for ( Enumeration enumeration = customerTypeHashtable.keys(); enumeration.hasMoreElements() ; )
	{     System.out.println( enumeration.nextElement() );
	} 
	
	// Pick up user's input for customer
	String customerTypeSelected = "not yet selected";
	try   
	{	BufferedReader bufReader = 
		 new BufferedReader( new InputStreamReader( System.in ) );
		customerTypeSelected = bufReader.readLine();
	}
	catch( IOException e )
	{	System.out.println( e ); 
	}

	//  Set the Customer prototype in the "Prototype" design pattern application
	officeProcess.setCustomerPrototype  
	 ( (Customer)customerTypeHashtable.get( customerTypeSelected ) );   // assign type to the singleton
	if( officeProcess.getCustomerPrototype() == null )   // user did not enter a legitimate type
		officeProcess.setCustomerPrototype( new MedVolCustomer( companyName ) );
	
	Client client = new Client();
	client.doOfficeProcess();
}

}