/** 
 */
abstract class Customer 
{
	protected String name = "name not assigned yet"; 
	protected String employerName = "employerNamenot assigned yet";
	protected String type = "type not assigned yet";

/*********************************************************************************
 */
public Customer()
/*********************************************************************************/
{	employerName = "default employer name";
}

/*********************************************************************************
 */
public Customer( String anEmployerName )
/*********************************************************************************/
{	employerName = anEmployerName;
}

/*********************************************************************************
 * Require subclasses to implement clone()
 */
public abstract Object clone();
/*********************************************************************************/

/*********************************************************************************
 * Postcondition: All known details concerning this Customer have been output to the console
 */
public void describe()
/*********************************************************************************/
{	
	System.out.println( "Customer " + name + ", an employee of " + 
	 employerName + ".  Spending category: " + getType() + ".  Lots more ...." );
}

/*********************************************************************************
 */
public abstract String getType();
/*********************************************************************************/

/*********************************************************************************
 */
public void setName( String aName )
/*********************************************************************************/
{	name = aName;
}

}
