/**
 * Customers who buy frequently
 */
class Frequent extends Customer
{
	
/*****************************************************************************************************  
 */
public Frequent() 
/*****************************************************************************************************/
{	super();
}
/*****************************************************************************************************
 * Returns: a non-null 'MailMessage' object intended for frequent customers
 */
public MailMessage getMessage() 
/*****************************************************************************************************/
{	
	String frequentCustomerMessage = "... a (possibly long) message for frequent customers ...";
	String messageTextForAllCustomers = ( super.getMessage() ).getText();
	return new MailMessage( "\n" + messageTextForAllCustomers + "\n" + frequentCustomerMessage );
}
}
