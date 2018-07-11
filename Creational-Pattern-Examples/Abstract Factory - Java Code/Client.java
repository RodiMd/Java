import java.io.*;

/**
 * User of 'Document' class
 * Design Note: Does not reference subtypes of 'Title' or 'Heading'.
 */
public class Client 
{
	private static Document document = Document.getTheDocument();
	
/*****************************************************************************************************
 */
public Client()
/*****************************************************************************************************/
{	super();
}

/*****************************************************************************************************
 * Precondition: 'aDocument' != null 
 *
 * Postcondition: 
 *  (1) The display form of 'aDocument' has been assembled in accordance with 'buildDisplay()' of 'Document'
 *  (2) 'aDocument' has been displayed to the console in accordance with 'display()' of 'Document'
 */
public static void display( Document aDocument ) 
/*****************************************************************************************************/
{
	aDocument.buildDisplay();	
	System.out.println( "\n\n" );
	aDocument.display();	
}

/*****************************************************************************************************
 * Postcondition: The user has been prompted to select a style
 *
 * Returns: 
 *   If the user selects a legitimate style: corresponding 'Style' subclass object
 *   Otherwise a 'SmallStyle' object
 */
public static Style getStyleFromUser()
/*****************************************************************************************************/
{	
	// Prepare to read from the console
	BufferedReader reader = new BufferedReader
	 ( new InputStreamReader( System.in ) );
	
	// Get style from user: Default "small" if user enters incorrect data
	Style returnStyle = SmallStyle.getTheSmallStyle();	 
	try
	{
		System.out.println
		 ( "---> Enter the style you want displayed ('small' or 'large')"
		 + " (small if input is improper):" ); 
		String userInput = reader.readLine();

		if( userInput.equals( "small" ) )
			returnStyle = SmallStyle.getTheSmallStyle();
			
		if( userInput.equals( "large" ) )
			returnStyle =  LargeStyle.getTheLargeStyle();
	}
	catch( IOException e )
	{		System.out.println( e );
	}

	return returnStyle;
}

/*****************************************************************************************************
 * Precondition: 'document' != null 
 *
 * Postconditions:
 *  (1) The aplication has obtained the contents of the required document ('document') from the user 
 *      in accordance with 'getDocumentFromUser()'
 *  (2) The application has obtained the style from the user in accordance with 'getStyleFromUser()'
 *  (3) The application has output 'document' to the console in accordance with 'display()' of 'Document'
 */
public static void main( String[] args )
/*****************************************************************************************************/
{	
	try
	{	document.getDocumentFromUser();
	}
	catch( Exception e )
	{	System.out.println( e );
	}

	document.setStyle( getStyleFromUser() ); 
	display( document );
}

}
