/**
 * Lower case version of section heading
 */

public class SmallHeading extends Heading
{

/*****************************************************************************************************
 * Precondition: 'value' != null
 * Postcondition: 'value' has been displayed at the console in lower case
 */
public void display()
/*****************************************************************************************************/
{	System.out.println( "\n" + value.toLowerCase() + ":" );	
}	

/*****************************************************************************************************
 */
public SmallHeading()
/*****************************************************************************************************/
{	super();
}

/*****************************************************************************************************
 */
public SmallHeading( String aString, int anIndex )
/*****************************************************************************************************/
{	super( aString, anIndex );   // ignores the index information
}

}