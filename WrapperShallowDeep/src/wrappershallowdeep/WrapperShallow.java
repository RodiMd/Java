/*
 * Author: Rodi Murad
 * Class: CIT 130
 * title: Deep and shallow copies
 * Assignment: #6
 * Date: 06/24/2015
 */
package wrappershallowdeep;

public class WrapperShallow {
    
    //decalre a private array a with total size of 3
    private int[] a = new int[3];
    
    public WrapperShallow()
    {
        //use a loop to go through the items and assign them to a
        int[] x = {7, 17, 77};
        for(int i = 0; i <= 2; i++)
        {
            a[i] = x[i];
        }
        //although it can be done as the commented out below, but i found it 
        //more definicial
//        a[0] = 7;
//        a[1] = 17;
//        a[2] = 77;
    }
    
    public WrapperShallow(WrapperShallow ws)
    {
        a = ws.a;
    }
    
    public int[] geta()
    {
        return a;
    }
    //mutator
    public void seta()
    {
        int[] x = {13, 14, 15};
        for(int i = 0; i <= 2; i++)
        {
            a[i] = x[i];
        }
//        a[0] = 13;
//        a[1] = 14;
//        a[2] = 15;
    }
    public String toString()
    {
        return a[0] +","+ a[1] +","+ a[2];
    }
    public boolean equals(WrapperShallow w)
    {
        return geta()==w.geta();
    }
}
