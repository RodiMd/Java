/*
 * 
 */
package autoclass;
import java.text.DecimalFormat;

public class Auto
{
    // instance variables
    private String model;          //  model of auto
    private int milesDriven;       //  number of miles driven
    private double gallonsOfGas;   //  number of gallons of gas

    //  Constructors:
    //  initializes model to "unknown";
    //  milesDriven is auto-initialized to 0
    //  and gallonsOfGas to 0.0;
    //  increments countAutos
    public Auto( )
    {
       model = "unknown";
    }

    // allows client to set beginning values for
    // model, milesDriven, and gallonsOfGas;
    // increments countAutos
    public Auto( String startModel,
                 int startMilesDriven,
                 double startGallonsOfGas )
    {
       model = startModel;
       setMilesDriven( startMilesDriven );
       setGallonsOfGas( startGallonsOfGas );
       
    }

    // Accessor Methods
    // returns current value of model
    public String getModel( )
    {
       return model;
    }

    // returns current value of milesDriven
    public int getMilesDriven( )
    {
       return milesDriven;
    }

    // returns current value of gallonsOfGas
    public double getGallonsOfGas( )
    {
       return gallonsOfGas;
    }
    
    // Mutator Methods:
    // allows client to set model
    public void setModel( String newModel )
    {
        model = newModel;
    }

    // allows client to set value of milesDriven;
    // prints an error message if new value is less than 0
    public void setMilesDriven( int newMilesDriven )
    {
       if ( newMilesDriven >= 0 )
          milesDriven = newMilesDriven;
       else
       {
          System.err.println( "Miles driven cannot be negative." );
          System.err.println( "Value not changed." );
       }
    }

    // allows client to set value of gallonsOfGas;
    // prints an error message if new value is less than 0.0
    public void setGallonsOfGas( double newGallonsOfGas )
    {
       if ( newGallonsOfGas >= 0.0 )
         gallonsOfGas = newGallonsOfGas;
       else
       {
         System.err.println( "Gallons of gas cannot be negative." );
         System.err.println( "Value not changed." );
       }
    }

    // Calculates miles per gallon.
    // if no gallons of gas have been used, returns 0.0;
    // otherwise, returns miles per gallon
    //   as milesDriven / gallonsOfGas
    public double calculateMilesPerGallon( )
    {
       if ( gallonsOfGas != 0.0 )
           return milesDriven / gallonsOfGas;
       else
           return 0.0;
    }

    // toString: returns a String with values of instance variable
    public String toString( )
    {
       DecimalFormat gallonsFormat = new DecimalFormat( "#0.0" );
       return "Model: " + model
             + "\n miles driven: " + milesDriven
             + "\n gallons of gas: "
             + gallonsFormat.format( gallonsOfGas );
    }
   
    // equals: returns true if fields of parameter object
    //         are equal to fields in this object
    public boolean equals( Object o )
    {
       if ( ! ( o instanceof Auto ) )
 	      return false;
       else
       {
           Auto objAuto = ( Auto ) o;
           if ( model.equals( objAuto.model )
                && milesDriven == objAuto.milesDriven
                && Math.abs( gallonsOfGas - objAuto.gallonsOfGas )
                < 0.0001 )
                return true;
            else
                return false;
       }
    }

 }