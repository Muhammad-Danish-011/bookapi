package com.glc;
import java.util.*;
public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public  void removeBook(String title) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getTitle().equals(title)) {
                books.remove(i);
                break;
            }
        }
    }

    public List<Book> getBooks() {
        return this.books;
    }

    public void addBooks(Book allBooks) {
        this.books.size();
    }

   
    public List<Book> getBooksByRating(double rating) {
        List<Book> booksByRating = new ArrayList<>();
        for (Book book : books) {
            if (book.getRating() == rating) {
                booksByRating.add(book);
            }
        }
        return booksByRating;
    }
    
}

