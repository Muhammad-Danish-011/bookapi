package com.glc;
import java.util.ArrayList;
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
            }
        }