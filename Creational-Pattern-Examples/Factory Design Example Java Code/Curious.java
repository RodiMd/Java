/**
 * Curious customer
 */
class Curious extends Customer
{
	
/*****************************************************************************************************  
 */
public Curious() 
/*****************************************************************************************************/
{	super();
}
/*****************************************************************************************************
 * Returns: a non-null 'MailMessage' object intended for curious customers
 */
public MailMessage getMessage() 
/*****************************************************************************************************/
{	
	String curiousCustomerMessage = "... a (possibly long) message for curious customers ...";
	String messageTextForAllCustomers = ( super.getMessage() ).getText();
	return new MailMessage( "\n" + messageTextForAllCustomers + "\n" + curiousCustomerMessage );
}
}
