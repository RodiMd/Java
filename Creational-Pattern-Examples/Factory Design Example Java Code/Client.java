/** 
 * Sends messages to various customers.
 * User of the Factory design pattern application
 */
class Client 
{
	
/*****************************************************************************************************
 */
public Client() 
/*****************************************************************************************************/
{	super();
}

/*****************************************************************************************************
 * Precondiiton" 'aCustomer != null'
 *
 * Postcondition: The e-mail message text pertaining to the type of 'aCustomer' has been output to
 *	 the monitor.
 * 
 * Design note: Here is where the client interfaces with an application of Factory design pattern
 */
public void sendMessage( Customer aCustomer ) 
/*****************************************************************************************************/
{
	// Here is where the Factory design pattern application is used
	MailMessage mailMessage = aCustomer.getMessage();

	// Use the message
	System.out.println( "This message will be sent:" );
	System.out.println( mailMessage.getText() );
	// ...... more work with mailMessage .....
}

}