package com.glc;
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import org.junit.Test;
import org.junit.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
   
        // setup
        public void testEmptyList() {
           
            ArrayList<String> myList = new ArrayList<>();
    
            //execute
            if (myList.isEmpty()) {
                System.out.println("The list is empty");
            } else {
                System.out.println("The list is not empty");
            }
    
           //assert
            Assert.assertTrue(myList.isEmpty());
        }
        
     
      
    
    @Test
   
    // setup
    public void add() {
           
        ArrayList<String> myList = new ArrayList<>();
            //execute
        myList.add("The Catcher in the Rye");
                int numberRead = 0;
                numberRead++;
                System.out.println("Number of books read: " + numberRead);

       //assert
        Assert.assertTrue(true);
    }

     
    @Test
   
    
    public void Totalbooks() {
     // setup
        int no = 0;
        ArrayList<String> myList = new ArrayList<>();
            myList.add("The Catcher in the Rye");
            myList.add("To Kill a Mockingbird");
            myList.add("1984");
            
          
            no = myList.size();
      
            System.out.println("Number of books read: " + no);
            
       //assert
        Assert.assertEquals(2, no);
    }
}






