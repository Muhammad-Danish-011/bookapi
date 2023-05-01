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

    public String toString() {
        return " " + title + " by " + author;
    }

    public Object getTitle() {
        return null;
    }
}

