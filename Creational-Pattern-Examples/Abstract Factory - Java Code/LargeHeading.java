/**
 * Upper case version
 */

public class LargeHeading extends Heading
{
	
/*****************************************************************************************************
 */
public LargeHeading()
/*****************************************************************************************************/
{	super();
}
/*****************************************************************************************************
 */
public LargeHeading( String aString, int anIndex )
/*****************************************************************************************************/
{	
	super( aString, anIndex );
	index = anIndex;
}
/*****************************************************************************************************
 * Precondition: 'this.value' != null 
 * Postpndition: 'this.value' has been displayed at the console in upper case
 */
public void display()
/*****************************************************************************************************/
{	
	System.out.println
	 ( "\nSection " + this.index + ". ---" + this.value.toUpperCase() + " ---" );	
}

}
