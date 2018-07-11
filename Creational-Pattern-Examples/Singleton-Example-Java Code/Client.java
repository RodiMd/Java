/**
 * Example of a user of the 'Experiment' singleton.
 */
class Client 
{
	
/*****************************************************************************************************
 */
public Client() 
/*****************************************************************************************************/
{	super();
}

/*****************************************************************************************************
 * Postconditions:
 * (1) An analysis has run on the 'Experiment' singleton in accordance with 'analyze()' in 'Experiment'
 * (2) An report has been generated on the 'Experiment' singleton in accordance with 'reportResults()'
 */
public static void main( String[] args ) 
/*****************************************************************************************************/
{
	// Here is where we use the Singleton application [can't state "new Experiment()"]
	Experiment experiment = Experiment.getTheExperiment();

	// Now work with the experiment and report the results
	experiment.analyze();
	experiment.reportResults();
	
}

}
