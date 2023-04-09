package com.glc;

import static org.junit.Assert.assertEquals;

import java.util.*;

import javax.lang.model.type.NullType;

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
            
            assertEquals(EmptyList, EmptyList);
    }
    
    @Test
    public void TestForAdd()
    {
        //setup
        class Book {
            private String title;
            private String author;
            private int year;
            private int length;
        
            public Book(String title, String author, int year, int length) {
                this.title = title;
                this.author = author;
                this.year = year;
                this.length = length;
            }
        }
            //execution
            List<Book> EmptyList = Collections.<Book>emptyList(); 
            System.out.println("Empty list: "+EmptyList);
            Book Book = new Book("ABC", "XYZ", 1925, 180);
            EmptyList.add(Book);
            //asssertion
            int i =1 ;
        i++;
        System.out.println(i);

    }
}

           
        


        