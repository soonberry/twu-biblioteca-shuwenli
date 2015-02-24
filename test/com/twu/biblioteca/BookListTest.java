package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BookListTest {
    @Test
    public void testDisplayList() throws Exception {
        Book book1=new Book("a","b","c");
        Book book2=new Book("d","e","f");
        List<Book> list = new ArrayList<Book>();

        list.add(book1);
        list.add(book2);

        BookList bookList = new BookList(list);

//        assertEquals("1,a,b,c", bookList.displayList());
        assertEquals("1,a,b,c\n2,d,e,f\n",bookList.toString());
    }
}