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
    }
}

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
        System.out.println(i);
     }
    }
// for add book we take help and laerned from java point , and implement our ccode to our logic !!!
