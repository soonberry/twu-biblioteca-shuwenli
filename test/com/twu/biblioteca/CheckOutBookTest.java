package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CheckOutBookTest {


    @Test
    public void should_CheckOut_by_BookName_by_using_mock() throws Exception {
        Book book = new Book("a", "b", "c");
        GoodsList goodsList = mock(GoodsList.class);

        when(goodsList.searchByBookName("a")).thenReturn(book);
        when(goodsList.getStatus("a")).thenReturn("keep");

        assertEquals(book, goodsList.searchByBookName("a"));

        CheckOutBook checkOutBook = new CheckOutBook();

        assertTrue(checkOutBook.checkOut("a", goodsList));
    }

    @Test
    public void testCheckOut() throws Exception {
        GoodsList goodsList = new GoodsList();

        CheckOutBook checkOutBook = new CheckOutBook();
        assertTrue(checkOutBook.checkOut("a", goodsList));
        assertFalse(checkOutBook.checkOut("b", goodsList));

    }
}