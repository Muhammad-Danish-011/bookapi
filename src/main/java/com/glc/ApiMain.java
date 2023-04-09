package com.glc;
import java.util.*; 
import java.util.List;



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
}
 /*class ReadNo{
public void numberRead (int a ){
   
    a=a+1;
    }
}*/

public class ApiMain {
       
     public static void main(String[] args) {          
        //Create an empty List      
        List<Book> EmptyList = Collections.<Book>emptyList(); 
        System.out.println("Empty list: "+EmptyList);  
   
        // I add the first book to my list then I expect numberRead to return 1.
        Book Book = new Book("ABC", "XYZ", 1925, 180);
        EmptyList.add(Book);
        int i =1 ;
        i++;
        System.out.println("total no of books "+i);
        
     }
    }
// for add book we take help and laerned from java point , and implement our ccode to our logic !!!
// when I add additional books to the list I expect the numberRead to return the total number of books in my list.
// I have an empty list, when I add a new book I expect getBooks() to return a list of books that includes the book I added.
// the only change is about when a function will call so in result there is output of book whcih is add.