package com.twu.biblioteca;

import java.util.List;

/**
 * Created by shuwenli on 15-2-23.
 */
public class BookList {

    private List<Book> bookList;

    public BookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Book> displayList() {

        return bookList;
    }
}
