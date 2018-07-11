/**
 * A user of OfficeProcess
 */
class Client 
{

/*********************************************************************************
 */
public Client() 
/*********************************************************************************/
{	super();
}

/*********************************************************************************
 * Demonstration of how a client could use a Prototype pattern application.  Notice that this class has no
 * references to 'Customer' or its subclasses
 *
 * Postconditions:
 * (1) This method performs unspecified work, which is represented by dummy text messages output to the console
 * (2) Customer information has been colleceted by the user as in 'doAProcess()' of 'OfficeProcess'
 */
public void DoOfficeProcess()
/*********************************************************************************/
{
	System.out.println( "\nClient does some work ....." );
	System.out.println( "\nClient calls on the application of Prototype pattern ....." );
	OfficeProcess.getOfficeProcess().getAndProcessCustomers();
	System.out.println( "\nClient does more work ....." );
}

/*********************************************************************************
 * Demonstration of how a client could use a Prototype pattern application.  Notice that this class has no
 * references to 'Customer' or its subclasses
 *
 * Postconditions:
 * (1) This method performs unspecified work, which is represented by dummy text messages output to the console
 * (2) Customer information has been colleceted by the user as in 'doAProcess()' of 'OfficeProcess'
 */
public void doOfficeProcess()
/*********************************************************************************/
{
	System.out.println( "\nClient does some work ....." );
	System.out.println( "\nClient calls on the application of Prototype pattern ....." );
	OfficeProcess.getOfficeProcess().getAndProcessCustomers();
	System.out.println( "\nClient does more work ....." );
}
}