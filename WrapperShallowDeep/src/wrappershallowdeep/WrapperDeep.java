/*
 * Author: Rodi Murad
 * Class: CIT 130
 * title: Deep and shallow copies
 * Assignment: #6
 * Date: 06/24/2015
 */
package wrappershallowdeep;

public class WrapperDeep {
    
    private int[] a = new int[3];
    
    public WrapperDeep()
    {
        int[] x = {2, 3, 4};
        for(int i = 0; i <= 2; i++)
        {
            a[i] = x[i];
        }
        //the commented out section shows another way of assigning the numbers to a
        //h
//        a[0] = 2;
//        a[1] = 3;
//        a[2] = 4;
    }
    
    public WrapperDeep(WrapperDeep ws)
    {
        a = new int[3];
        for (int i = 0; i <= 2; i++)
        {
            a[i] = ws.a[i];
        }
    }
    public int[] geta()
    {
        return a;
    }
    public void seta()
    {
        int[] x = {7, 6, -5};
        for (int i = 0 ; i <= 2; i++)
        {
            a[i] = x[i];
        }
//        a[0] = 7;
//        a[1] = 6;
//        a[2] = -5;
    }
    public String toString()
    {
        return a[0] +","+ a[1] +","+ a[2];
    }
    public boolean equals(WrapperDeep w)
    {
            return geta() == w.geta();
    }
}
