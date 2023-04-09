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
    //test for total no of books added 
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
                System.out.println("the book which is added :"+title + author+year +length);
                //for new book output
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
        System.out.println("the total no of books :"+i);

    }

//this code is applicable for when  I have an empty list, when I add a new book I expect getBooks() to return a list of books that includes the book I added.
// I have an empty list, when I add a new book I expect getBooks() to return a list of books that includes the book I added.
// the only change is about when a function will call so in result there is output of book whcih is add.
           
@Test
public void TestForremove()
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
            System.out.println("the book which is added :"+title + author+year +length);
        }
        public void removeBook(String title) {
            this.removeBook(title);
          } 
    }
    //execute
    List<Book> EmptyList = Collections.<Book>emptyList();
    Book Book = new Book("ABC", "XYZ", 1925, 180);
       Book.removeBook("XYZ");

    //assertion
    System.out.println("remaining books:"+EmptyList);
}
}



