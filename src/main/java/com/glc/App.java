package com.glc;
import java.util.ArrayList;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    
    public static void main( String[] args )
    {
       
                // Create an empty ArrayList
                ArrayList<String> myList = new ArrayList<>();
            //case 1
                // Check if the list is empty
                // if (myList.isEmpty()) {
                //     System.out.println("The list is empty");
                // } else {
                //     System.out.println("The list is not empty");
                // }
    
             //case 2
                myList.add("The Catcher in the Rye");
                int numberRead = 0;
                numberRead++;

                System.out.println("Number of books read: " + numberRead);


            //case 3 

                        
            int no = 0;
            
       
            myList.add("The Catcher in the Rye");
            myList.add("To Kill a Mockingbird");
            myList.add("1984");
            
          
            numberRead = myList.size();
      
            System.out.println("Number of books read: " + no);
            

            //case 4
            Library library = new Library();
            Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger");
            library.addBook(book1);
            
            // Remove the book by title
            library.removeBook("The Catcher in the Rye");
            
            // Print the books in the library (should be empty)
            List<Book> books = library.getBooks();
            if (books.isEmpty()) {
                System.out.println("No books in library");
            } else {
                System.out.println("Books in library:");
                for (Book book : books) {
                    System.out.println("- " + book);
                }
            }
                }

        }
        