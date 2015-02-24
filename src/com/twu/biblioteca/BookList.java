package com.twu.biblioteca;

import java.util.Iterator;
import java.util.List;

/**
 * Created by shuwenli on 15-2-23.
 */
public class BookList {

    private List<Book> bookList;

    public BookList(List<Book> list) {
        bookList=list;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    @Override
    public String toString() {
        String result="";
        int i=1;
        Iterator iterator=bookList.iterator();

        while(iterator.hasNext()){
            result+=i+++","+iterator.next().toString()+"\n";
        }

        return result;
    }
}
