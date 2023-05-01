package com.glc;
import java.util.ArrayList;
import java.util.*;
public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(String title) {
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
}

