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
        
     
      
    }

   //     private void assertEqualsexpected(String string, boolean empty) {
   // }



