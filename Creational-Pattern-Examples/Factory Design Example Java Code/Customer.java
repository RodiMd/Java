/** 
 * Base for customers
 */
abstract class Customer 
{

/*****************************************************************************************************/

/*****************************************************************************************************
 * Returns: non-null mail content intended for all customers
 */
public MailMessage getMessage()
{	return new MailMessage( "Losts of material intended for all customers ..." );
} 
/*****************************************************************************************************/

}