/**
 * Expresses "small" version of document,  Relates to all 'SmallXXX' classes
 * Design note: Application of Abstract Factory design pattern
 */
public class SmallStyle extends Style
{
	
private static SmallStyle theSmallStyle = new SmallStyle(); // singeleton

/*****************************************************************************************************
 */
private SmallStyle() 
{	super();
}

/*****************************************************************************************************
 */
public Heading getAHeading( String aString, int anIndex )
/*****************************************************************************************************/
{	return new SmallHeading( aString, anIndex );
}

/*****************************************************************************************************
 */
public Title getATitle( String aString )
/*****************************************************************************************************/
{	return new SmallTitle( aString );
}

/*****************************************************************************************************
 */
public static Style getTheSmallStyle()
/*****************************************************************************************************/
{	return theSmallStyle;
}

}