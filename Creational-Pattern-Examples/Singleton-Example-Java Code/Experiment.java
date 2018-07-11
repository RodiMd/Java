/**
 * Demonstration: Fragment of an application that evaluates the results of a lab experiment
 * Example of a Singelton design pattern.
 */
class Experiment 
{
	// The singleton Experiment instance: final because it should never be assigned to another instance
	private static final Experiment theExperiment = new Experiment();

	String result = "Experiment result not yet assigned";   // result of the experiment
	
	// Number of times this singleton called for within the execution
	private static int numTimesReferenced = 0;   
		
/*****************************************************************************************************
 * Desgn Note: This is private, so that it can only be used by member methods of Experiment
 */
private Experiment() 
/*****************************************************************************************************/
{	super();
}

/*****************************************************************************************************
 * The actual work of the experiment analysis is done here
 */
public synchronized void analyze() 
/*****************************************************************************************************/
{
	// .... do the analysis work ....
	theExperiment.result = 
	 "... The analysis shows that the experiment was a resounding success. ....";	
}

/*****************************************************************************************************
 * Here is where the client interfaces with application of Factory design pattern
 * The only way to obtain the singleton 'Experiment' object
 */
public static Experiment getTheExperiment() 
/*****************************************************************************************************/
{
	// Report  number of times this singleton has been accessed (for curiosity)
	++numTimesReferenced;   
	System.out.println
	 ( "Noting that the Experiment singleton referenced " + numTimesReferenced + " times so far" );
	 	
	return theExperiment;
}

/*****************************************************************************************************
 * The results of the experiment analysis.
 */
public void reportResults() 
/*****************************************************************************************************/
{	System.out.println( result );
}

}
