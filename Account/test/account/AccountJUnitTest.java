/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rodi
 */
public class AccountJUnitTest {
    //Account amt;
    public AccountJUnitTest() { 
    }
    
    @BeforeClass
    public void setUpClass() {  
        //amt = new Account();
    }
    
    @AfterClass
    static public void tearDownClass() {
    }

    @Test
    public void main(){
        Account amt = new Account();
        assertTrue(amt.assertTrueTester(5) == 5);
        
//        String message = "The value entered did not adhere to preconditions";
//        
//        if (){
//            fail(message);
//        }
    }
}
