package com.glc;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AppTest 
{
  
    @Test
    public void testforempty()
    {
        //Given that I visit the site, when I first start, I expect my list to be empty.
       //setup
       List<String> list = new ArrList<String>();
       List<int> list = new Arr1list<int>();
       //execute
       for(int i=0; i<list.size() ;i++){
        System.out.println(list.get(i));
    } 
       //assertion
    }
}
