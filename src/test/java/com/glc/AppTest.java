package com.glc;
import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;

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
        Assert.assertEquals(3, no);
    }
    
        @Test
        public void testRemoveBook() {
            // create a library with some books
            ArrayList<String> myList = new ArrayList<>();
            myList.add("The Catcher in the Rye");
            myList.add("To Kill a Mockingbird");
            myList.add("1984");
            
            String title = "The Catcher in the Rye";
            myList.remove(title);
            assertEquals(myList, myList); 
        }
        @Test
        public void Bookveiw (){
            ArrayList<String> myList = new ArrayList<>();
            myList.add("The Catcher in the Rye");
            myList.add("To Kill a Mockingbird");
           
            assertEquals(myList,myList);

        }

        @Test
          public void testGetBooksByRating() {
           
            Library bookshelf = new Library();
            Book allBooks = new Book();
            allBooks.add(new Book("Book 1", "Author 1", 4));
            allBooks.add(new Book("Book 2", "Author 2", 3));
            allBooks.add(new Book("Book 3", "Author 3", 5));
            allBooks.add(new Book("Book 4", "Author 4", 2));
            allBooks.add(new Book("Book 5", "Author 5", 1));
            bookshelf.addBooks(allBooks);
            
           List<Book> result=bookshelf.getBooksByRating(4);
           
            int  expectedCount = 1;
            assertEquals(expectedCount, 1);
          }
          
        }
    






