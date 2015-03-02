package com.twu.biblioteca;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GoodsListTest {

    private Map<Book, String> initBookList() {
        Book book1 = new Book("a", "b", "c");
        Book book2 = new Book("d", "e", "f");
        Map<Book, String> map = new HashMap<Book, String>();

        map.put(book2, "keep");
        map.put(book1, "keep");

        return map;
    }

    private UserAccount userAccount = new UserAccount("111-1111", "111", "", "", "", "Librarian");

    @Test
    public void checked_out_books_should_not_list() throws Exception {

        GoodsList goodsList = new GoodsList();
//        assertEquals(list,bookList);
//        assertEquals("1,a,b,c", bookList.displayList());
        assertEquals("1: d,e,f\n2: a,b,c\n", goodsList.toString());

        goodsList.switchStatus("a", userAccount);
        assertEquals("1: d,e,f\n", goodsList.toString());
    }

    @Test
    public void test_Search_Book_By_Name() throws Exception {
        GoodsList goodsList = new GoodsList();
        Book book = mock(Book.class);
        when(book.getName()).thenReturn("a");

        assertEquals(book.getName(), goodsList.searchByBookName("a").getName());
        assertEquals(null, goodsList.searchByBookName("b"));

    }

    @Test
    public void test_Get_Status() throws Exception {
        GoodsList goodsList = new GoodsList();

        assertEquals("keep", goodsList.getStatus("a"));
        assertEquals(null, goodsList.getStatus("b"));
    }

    @Test
    public void test_Switch_Status() throws Exception {
        GoodsList goodsList = new GoodsList();
        goodsList.switchStatus("a", userAccount);

        assertEquals("checked", goodsList.getStatus("a"));
        goodsList.switchStatus("a", userAccount);
        assertEquals("keep", goodsList.getStatus("a"));

    }
}