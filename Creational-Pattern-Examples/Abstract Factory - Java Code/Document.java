import java.util.*;
import java.io.*;

/**
 * The document being built.  Displayable in various styles.
 *
 * Class invariant: 'headings.length' == 'textSegments.length'  (I)
 *
 * Known issue: For the sake of robustness, may be better not to keep the headings and  
 *  their corresponding text in separate variables.
 */

public class Document 
{	
	 private String title;   // -- of the document as a whole
	 
	 private Vector headings = new Vector();   // text for each heading in this document
	 private Vector textSegments = new Vector();   // text for each section under each heading

	 // The combination of displays (the "complex object" we are constructing)
	 private Vector display = new Vector();		
	 
	 // The current style with which the display will be built
	 private Style style; 
	 
	 private static Document theDocument = new Document();   // only one
	 
/*****************************************************************************************************
 */
public Document()
/*****************************************************************************************************/
{	super();
}

/*****************************************************************************************************
 * Postconditions:
 * (1) The 0th element of 'display' is the 'Title' object in the style of 'style'
 *      for each heading in 'headings':
 * (2) The 1th element of 'display' is the first 'Heading' object in the style of 'style'
 * (3) The 2th element of 'display' is the 'Text' object accompanying the first heading 
 *     in the style of 'style'
 * (4) The 3th element onwards of 'display' are the remaining 'Heading' and accompanying 
 *     'Text' objects, in sequence
 */
public void buildDisplay()
/*****************************************************************************************************/
{
	// Create the vector of objects for display

	// Insert the title object
	display.addElement( getATitle( title ) );
	
	for( int i = 0; i < headings.size(); ++i )
	{
		// Insert the next heading
		String heading = (String)headings.elementAt(i);
		display.addElement( getAHeading( heading, i + 1 ) );	

		// Insert the next text segment
		String text = (String)textSegments.elementAt(i);
		display.addElement( new Text( text ) );   // insert text
	}
		
}

/*****************************************************************************************************
 * Display on console
 */
public void display()
/*****************************************************************************************************/
{
	for( int i = 0; i < display.size(); ++i )
		( (Displayable) display.elementAt(i) ).display();	
}

/*****************************************************************************************************
 */ 
public Heading getAHeading( String aString, int anIndex )
/*****************************************************************************************************/
{	return style.getAHeading( aString, anIndex );
}

/*****************************************************************************************************
 */
public Title getATitle( String aString )
/*****************************************************************************************************/
{	return style.getATitle( aString );
}

/*****************************************************************************************************
 * Preconditions: 
 *  (1) 'headings' != null 
 *  (2) 'textSegments' != null 
 *
 * Postconditions: The application has prompted the user for, and obtained the following:
 *	(1) The document's title, which is set to 'title'
 *	The following are solicited as may times as the user wants
 *	(2) The document's next heading, which is added to 'headings'
 *	(3) The text belonging to this heading, which is added to 'textSegments'
 */
public void getDocumentFromUser() throws IOException
/*****************************************************************************************************/
{
	// Prepare to read from the console
	BufferedReader reader = new BufferedReader(new InputStreamReader( System.in ) );
	String userInput = new String( "" );
	
	// Enter title
	System.out.println( "---> Enter the title of your document: " );
	title = new String( reader.readLine() );

	// Enter heading - text pairs until done
	// The fact that these are perfomed toghether ensure the class invariant (I) above
	while( true )  // exit with break after entering '-done'
	{
		// Enter heading
		System.out.println( "---> Enter heading or '-done': " );
		userInput = reader.readLine();
		if( userInput.equals( "-done" ) )
			break;
		headings.addElement( new String( userInput ) );   

		// Enter text corresponding to the heading
		System.out.println( "---> Enter the text: " );
		userInput = reader.readLine();
		textSegments.addElement( new String( userInput ) );
	}
	
	// Typically, we would store the document at this point	
}

/*****************************************************************************************************
 */ 
public static Document getTheDocument()
/*****************************************************************************************************/
{	return theDocument;	
}

/*****************************************************************************************************
 */ 
public void setStyle( Style aStyle )
/*****************************************************************************************************/
{	style = aStyle;	
}

}
