/* 
 * Assignment 3
 * CSCI 718
 * 2/26/2018
 * Rodi Murad
 */
package autoclass;

import org.junit.Test;
import static org.junit.Assert.*;

public class AutoTest {
    
    public AutoTest() {
    }
    
     @Test
     public void setModelTest(){
         String model = "Jaguar";
         
         Auto mdl = new Auto();
         mdl.setModel(model);
         
         assertEquals("Jaguar", mdl.getModel());
     }
    
     @Test
     public void setMilesDrivenTest(){
         
         int milesD = 75;
                  
         Auto mleD = new Auto();
         mleD.setMilesDriven(milesD);
         
         double expected = 75;
         assertEquals(expected, mleD.getMilesDriven(),0);
     }
     
     @Test
     public void setMilesDrivenUnchangedTest(){
         
         int milesD = -75;
         
         Auto mleD = new Auto();
         mleD.setMilesDriven(milesD);
         double expected = 0;
                  
         assertEquals(expected, mleD.getMilesDriven(),0);
     }
     
     @Test
     public void setGalonsGasTest(){
         
         double galGas = 5;
         
         Auto gGas = new Auto();
         gGas.setGallonsOfGas(galGas);
         
         double expected = 5;
         assertEquals(expected, gGas.getGallonsOfGas(),0);
     }
     
     @Test
     public void setGalonsGasUnchangedTest(){
         
         double galGas = -5;
         
         Auto gGas = new Auto();
         gGas.setGallonsOfGas(galGas);
         
         double expected = 0;         
         assertEquals(expected, gGas.getGallonsOfGas(),0);
     }

     @Test
     public void mpgCalculateTest() {
         String model = "Jaguar";
         int milesD = 75;
         double galGas = 5;
         
         Auto mpg = new Auto(model, milesD, galGas);
         
         double actual = mpg.calculateMilesPerGallon();
         double expected = 15;
         assertEquals(expected, actual, 0);
     }
     
     @Test
     public void mpgCalculateZeroGalTest() {
         String model = "Jaguar";
         int milesD = 75;
         double galGas = 0;
         
         Auto mpg = new Auto(model, milesD, galGas);
         
         double actual = mpg.calculateMilesPerGallon();
         double expected = 0;
         assertEquals(expected, actual, 0);
         
     }
     
     @Test
     public void toStringTest(){
         String model = "Jaguar";
         int milesD = 75;
         double galGas = 5;
         
         Auto toStrng = new Auto(model, milesD, galGas);
         String expected = "Model: Jaguar\n miles driven: 75\n gallons of gas: 5.0";
         assertEquals(expected, toStrng.toString());
     }
     
     @Test
     public void equalsNotInstanceTest(){
               
         Auto obj = new Auto();
         assertEquals(false, obj.equals(false));
     }
     
     @Test
     public void equalsFalseTest(){

         Auto obj = new Auto();
         assertEquals(false, obj.equals(new Auto("jeep", 60, 5)));
     }
     
     @Test
     public void equalsModelTrueTest(){
         String model = "Jaguar";
         int milesD = 75;
         double galGas = 5;
         
         Auto obj = new Auto(model, milesD, galGas);
         assertEquals(true, obj.equals(new Auto(model, milesD, galGas)));
     }
     
     @Test
     public void equalsDiffTest(){
         String model = "Jaguar";
         int milesD = 75;
         double galGas = 5;
         
         Auto obj = new Auto(model, milesD, galGas);
         assertEquals(false, obj.equals(new Auto(model, milesD, 0)));
     }
     
     @Test
     public void equalsMilesTest(){
         String model = "Jaguar";
         int milesD = 75;
         int milesD2 = 65;
         double galGas = 5;
         
         Auto obj = new Auto(model, milesD, galGas);
        
         assertEquals(false, obj.equals(new Auto(model, milesD2, galGas)));
     }
}
