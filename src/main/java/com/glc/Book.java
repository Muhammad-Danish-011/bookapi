package com.glc;
import java.util.ArrayList;

import java.util.*;


public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String string, String string2, double d) {
    }

    public Book() {
    }

    public String toString() {
        return " " + title + " by " + author;
    }

    public Object getTitle() {
        return null;
    }

    public double getRating() {
        return 0;
    }

    public void add(Book book) {
    }
}

