/**
 * Customers who buy a large amount -- see requirements
 */
class HiVolCustomer extends Customer implements Cloneable
{
	
/*********************************************************************************
 */
public HiVolCustomer()
/*********************************************************************************/
{	super();
}

/*********************************************************************************
 */
public HiVolCustomer( String aCompanyName )
/*********************************************************************************/ 
{	super( aCompanyName );
}

/*********************************************************************************
 */
public Object clone()
/*********************************************************************************/
{	return new HiVolCustomer( employerName );
}

/*********************************************************************************
 */
public String getType()
/*********************************************************************************/
{	return "High volume";
}

}
