/**
 * Expresses "large" version of document,  Relates to all 'LargeXXX' classes
 * Design note: Application of Abstract Factory design pattern
 */
public class LargeStyle extends Style
{

private static LargeStyle theLargeStyle = new LargeStyle();   // the singleton

/*****************************************************************************************************
 */ 
private LargeStyle()
/*****************************************************************************************************/ 
{	super();
}

/*****************************************************************************************************
 */
public Heading getAHeading( String aString, int anIndex )
/*****************************************************************************************************/
{	return new LargeHeading( aString, anIndex );
}

/*****************************************************************************************************
 */
public Title getATitle( String aString )
/*****************************************************************************************************/
{	return new LargeTitle( aString );
}

/*****************************************************************************************************
 */
public static Style getTheLargeStyle()
{	return theLargeStyle;
};
/*****************************************************************************************************/

}