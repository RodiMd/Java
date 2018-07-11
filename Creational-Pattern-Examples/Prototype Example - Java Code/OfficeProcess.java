import java.util.*;
import java.io.*;

/**
 * Performs processing with customers according to requirements document xx
 * Note that this class makes no reference to 'Customer' subclasses
 *
 * Demonstration of the Prototype design pattern.  Note that this class deals with
 *  'Customer' objects in general, not subtypes.
 */
class OfficeProcess
{	
	private static Customer customerPrototype;   // the prototype used to create new 'Customer' objects
	Vector customers = new Vector();  // keep available the customers created during each execution
	private static OfficeProcess officeProcess = new OfficeProcess();   // the singleton

/*********************************************************************************
 */
private OfficeProcess()
/*********************************************************************************/
{	super();
}

/*********************************************************************************
 * Preconditions:
 * (1) 'customerPrototype' != null
 * (2) 'customers' != null
 *
 * Postconditions:
 * (1) A list of customers have been obtained from the user via the console
 * (2) This information includes the customer's name
 * (3) The customer information is stored as 'Customer' objects in 'customers'
 * (4) A list of customers, with details, has been output to the console
 *
 * Design notes: Clones prototypes to generate instances 'Customer'  This code makes no
 *  reference to subclasses of 'Customer'
 */
public void getAndProcessCustomers()
/*********************************************************************************/
{
	Customer customer;   // for temporary use
	String customerName = "not yet assigned";

	// ----- Postconditions (1) - (3)

	BufferedReader bufReader =   // prepare to read from console
		 new BufferedReader( new InputStreamReader( System.in ) );

	try   
	{	
		System.out.println( "Enter customer names or '-quit'" );
		
		while( !"-quit".equals( customerName ) )   // signal to quit soliciting names
		{				
			customerName = bufReader.readLine();   // get the name 
			
			if( !"-quit".equals( customerName ) )   // a name, not a signal to stop getting names
			{
				// KEY STEP (notice that this code does not mention subclasses of Customer)	
				customer = (Customer)OfficeProcess.customerPrototype.clone();   // make a new one
				
				customer.setName( customerName );  
				System.out.println( "... more interaction to get information about " 
				 + customerName + "... : Stored in database" );
				this.customers.addElement( customer );   // keep in memory for processing
			}
		}
	}
	catch( IOException e )
	{	System.out.println( e ); 
	}

	// ----- Postcondition (4)
	
	// List customers entered during this session (a reason we maintained 'customers' )
	System.out.println( "\nThe customers entered during this session: " );
	for( int customersIndex = 0; customersIndex < customers.size(); ++customersIndex )
	{
		customer = (Customer)this.customers.elementAt( customersIndex );
		customer.describe();
	} 
}

/*********************************************************************************
 */ 
public static Customer getCustomerPrototype()
/*********************************************************************************/
{	return customerPrototype;
}

/*********************************************************************************
 * Accessor for the singleton
 */ 
public static OfficeProcess getOfficeProcess()
/*********************************************************************************/
{	return officeProcess;
}

/**
 * Precondition: 'aCustomer != null'
 * Postcondition: 'customerPrototype == aCustomer'
 */
public void setCustomerPrototype( Customer aCustomer ) 
{	customerPrototype = aCustomer;	
}
}
