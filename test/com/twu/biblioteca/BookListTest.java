package com.twu.biblioteca;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookListTest {

    private Map<Book,String> initBookList(){
        Book book1 = new Book("a", "b", "c");
        Book book2 = new Book("d", "e", "f");
        Map<Book,String> map = new HashMap<Book, String>();

        map.put(book2,"keep");
        map.put(book1,"keep");


        return map;
    }

    @Test
    public void testDisplayList() throws Exception {

        BookList bookList=new BookList(initBookList());
//        assertEquals(list,bookList);
//        assertEquals("1,a,b,c", bookList.displayList());
        assertEquals("1,a,b,c\n2,d,e,f\n", bookList.toString());
    }

    @Test
    public void test_Search_Book_By_Name() throws Exception {
        BookList bookList=new BookList(initBookList());
        Book book=mock(Book.class);
        when(book.getName()).thenReturn("a");

        assertEquals(book.getName(), bookList.searchByBookName("a").getName());
        assertEquals(null, bookList.searchByBookName("b"));

    }

    @Test
    public void testGetStatus() throws Exception {
        BookList bookList=new BookList(initBookList());

        assertEquals("keep",bookList.getStatus("a"));
        assertEquals(null,bookList.getStatus("b"));

    }
}