package com.glc;

import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Test;
 

public class ApiTest 
{
  
  
    @Test
    public void TestForEmpty()
    {
        //setup
        List<String> EmptyList = Collections.<String>emptyList(); 
        //execute 
        System.out.println("Empty list: "+EmptyList);  
        //assertion
            assertEquals(null, EmptyList);
    }
    

}

           
        


        