package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class CheckOutBookTest {
    @Mock
    private CheckOutBook checkOutBook;
    private BookList booklist;
    private Book book;

    public void setUp() throws Exception{
        MockitoAnnotations.initMocks(this);

        book=new Book("a","b","c");
        booklist=new BookList();

    }

    @Test
    public void testCheckOut() throws Exception {

        when(booklist.searchByBookName("a")).thenReturn(new Book("a","b","c"));

        assertEquals(book.getName(),booklist.searchByBookName("a"));

    }

}