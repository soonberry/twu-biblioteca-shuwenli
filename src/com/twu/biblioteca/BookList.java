package com.twu.biblioteca;

import java.util.*;

/**
 * Created by shuwenli on 15-2-23.
 */
public class BookList {

    private Map<Book,String> bookList;

    public BookList(Map<Book,String> map) {
        bookList = map;
    }

    public BookList(){ bookList= new HashMap<Book, String>();}

    public BookList(Book book){ bookList= new HashMap<Book, String>(); bookList.put(book,"keep");}


    @Override
    public String toString() {
        String result = "";
        int i = 1;
        Iterator<Book> iterator = bookList.keySet().iterator();

        while (iterator.hasNext()) {
            result += i++ + "," + iterator.next().toString() + "\n";
        }

        return result;
    }

    public Book searchByBookName(String bookName) {
        Iterator<Book> iterator = bookList.keySet().iterator();

        while (iterator.hasNext()) {
            Book book=iterator.next();
            if(book.getName().equals(bookName)) {
                System.out.println(book);
                return book;
            }
        }
        return null;
    }

    public String getStatus(String bookName) {
        Book book=searchByBookName(bookName);
        return bookList.get(book);
    }
}
