package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CheckOutBookTest {


    @Test
    public void should_Check_BookName() throws Exception {
        Book book=new Book("a","b","c");
        BookList bookList=mock(BookList.class);

        when(bookList.searchByBookName("a")).thenReturn(book);
        when(bookList.getStatus("a")).thenReturn("keep");

        assertEquals(book,bookList.searchByBookName("a"));

        CheckOutBook checkOutBook=new CheckOutBook();

        assertTrue(checkOutBook.checkOut("a",bookList));
    }

}