/**
 * Customers who buy an average amount (see requirements) 
 */
class MedVolCustomer extends Customer implements Cloneable
{

/*********************************************************************************
 */
public MedVolCustomer()
/*********************************************************************************/
{	super();
}

/*********************************************************************************
 */
public MedVolCustomer( String aCompanyName )
/*********************************************************************************/ 
{	super( aCompanyName );
}

/*********************************************************************************
 */
public Object clone()
/*********************************************************************************/
{	return new MedVolCustomer( employerName );
}

/*********************************************************************************
 */
public String getType()
/*********************************************************************************/
{	return "Medium volume";
}

}