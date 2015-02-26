package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void testDisplayBook() throws Exception {
        Book book = new Book("Stone", "Cao Xueqing", "Qing");

//        assertEquals("Stone", book.getName());
//        assertEquals("Cao Xueqing", book.getAuthor());
//        assertEquals("Qing", book.getYearPublished());

        assertEquals("Stone,Cao Xueqing,Qing", book.toString());

    }
}