package com.twu.biblioteca;

/**
 * Created by shuwenli on 15-2-23.
 */
public class Book {
    String name;
    String author;
    String yearPublished;

    public Book(String name, String author, String yearPublished) {
        this.name = name;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getYearPublished() {
        return yearPublished;
    }

    public String displayBook() {
        return name+","+author+","+yearPublished;
    }
}
