/**
 * The text that follows a heading:   The content of a document.
 */

public class Text implements Displayable
{
	private String value = null;

/*****************************************************************************************************
 */
public Text()
/*****************************************************************************************************/
{	super();
}

/*****************************************************************************************************
 */
public Text( String aString)
/*****************************************************************************************************/
{	
	this();
	value = aString;
}

/*****************************************************************************************************
 */
public String getText()
/*****************************************************************************************************/
{	return value;	
}

/*****************************************************************************************************
 */
public void setValue( String aString )
/*****************************************************************************************************/
{	this.value = aString;	
}

/*****************************************************************************************************
 */
public void display()
/*****************************************************************************************************/
{	System.out.println( value );	
}

}