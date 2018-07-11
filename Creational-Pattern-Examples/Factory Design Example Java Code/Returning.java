/**
 * A returning customer
 */
class Returning extends Customer
{
	
/*****************************************************************************************************  
 */
public Returning() 
/*****************************************************************************************************/
{	super();
}
/*****************************************************************************************************
 * Returns a non-null 'MailMessage' object intended for returning customers
 */
public MailMessage getMessage() 
/*****************************************************************************************************/
{	
	String returningCustomerMessage = "... a (possibly long) message for returning customers ...";
	String messageTextForAllCustomers = ( super.getMessage() ).getText();
	return new MailMessage( "\n" + messageTextForAllCustomers + "\n" + returningCustomerMessage );
}
}
