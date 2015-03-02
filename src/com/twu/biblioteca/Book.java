package com.twu.biblioteca;

/**
 * Created by shuwenli on 15-2-23.
 */
public class Book extends Goods {
    String author;

    public Book(String name, String author, String yearPublished) {
        this.name = name;
        this.author = author;
        this.yearPublished = yearPublished;
    }


    public String getAuthor() {
        return author;
    }


    @Override
    public String toString() {
        return name + "," + author + "," + yearPublished;
    }
}
