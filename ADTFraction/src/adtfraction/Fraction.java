/*
 * Author: Rodi Murad
 * Class: CIT130
 * Assignment: Week 8 part 1
 * Title: DenominatorIsNotZero
 * Date: 07/11/2015
 */

package adtfraction;

public class Fraction {
    
    int num; 
    int den;
              
    public Fraction()
    {
        num = 0;
        den = 0;
    }
    
    public Fraction (int numerator, int denominator) throws DenominatorIsZeroException
    {
        num = numerator;
        den = denominator;    
        
        //condition if den is 0 then itll throw the cannot be zero message
        if (den == 0)
        {
            throw new DenominatorIsZeroException("Denominator cannot be zero");
        }
    }
    
    public Fraction (double numerator, double denominator)
    {
        num = (int)numerator;
        den = (int)denominator;
    }
    public int getNum()
    {
        return num;
    }
    public int getDen()
    {
        return den;
    }
        
    public void setNum(int numerator)
    {
        num = numerator;
    }
    
    public void setDen(int denominator)
    {
        den = denominator;
    }
            
    public String toString()
    {
        return "" + num + "/" + den;
    }
       
    public boolean equals(Fraction f)
    {       
        return (getNum()*f.getDen() == f.getNum() * getDen());
         
        
        //equivalent but the above code is more efficient and less writing
        
//        boolean status;
//        if (this.getNum()*f.getDen() == f.getNum() * this.getDen())
//            status = true;
//        else
//            status = false;
//        return status;
    }
}
