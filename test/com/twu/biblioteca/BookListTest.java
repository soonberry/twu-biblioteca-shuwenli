package com.twu.biblioteca;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BookListTest {
    @Test
    public void testDisplayList() throws Exception {
        List<Book> list=null;

        BookList bookList=new BookList();

        assertEquals(list,bookList.displayList());

    }
}