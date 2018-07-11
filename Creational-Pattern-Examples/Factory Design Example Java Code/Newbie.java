/**
 * A new customer
 */
class Newbie extends Customer
{
	
/*****************************************************************************************************  
 */
public Newbie() 
/*****************************************************************************************************/
{	super();
}
/*****************************************************************************************************
 * Returns a non-null 'MailMessage' object intended for newbie customers
 */
public MailMessage getMessage() 
/*****************************************************************************************************/
{	
	String newCustomerMessage = "... a (possibly long) message for new customers ...";
	String messageTextForAllCustomers = ( super.getMessage() ).getText();
	return new MailMessage( "\n" + messageTextForAllCustomers + "\n" + newCustomerMessage );
}
}
