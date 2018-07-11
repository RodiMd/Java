/*
 * Author: Rodi Murad
 * Class: CIT130
 * Assignment: Week 8 part 1
 * Title: DenominatorIsNotZero
 * Date: 07/11/2015
 */
package adtfraction;

public class DenominatorIsZeroException extends Exception
{
    public DenominatorIsZeroException()
    {
        super("Error: Denominator cannot be Zero");
    }
    
    public DenominatorIsZeroException(String den)
    {
        super(den);
    }
}
