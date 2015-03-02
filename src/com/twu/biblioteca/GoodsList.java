package com.twu.biblioteca;

import java.util.*;

/**
 * Created by shuwenli on 15-2-23.
 */
public class GoodsList {

    private Map<Goods, String> bookList;

    public GoodsList(Map<Goods, String> map) {
        bookList = map;
    }

    public GoodsList() {
        bookList = new HashMap<Goods, String>();
        Goods book1 = new Book("a", "b", "c");
        Goods book2 = new Book("d", "e", "f");
        bookList.put(book2, "keep");
        bookList.put(book1, "keep");
    }

    public GoodsList(Book book) {
        bookList = new HashMap<Goods, String>();
        bookList.put(book, "keep");
    }


    @Override
    public String toString() {
        String result = "";
        int i = 1;
        Iterator<Goods> iterator = bookList.keySet().iterator();

        while (iterator.hasNext()) {
            Goods goods = iterator.next();
            if (getStatus(goods.getName()).equals("keep"))
                result += i++ + ": " + goods.toString() + "\n";
        }

        return result;
    }

    public Goods searchByBookName(String bookName) {
        Iterator<Goods> iterator = bookList.keySet().iterator();

        while (iterator.hasNext()) {
            Goods goods = iterator.next();
            if (goods.getName().equals(bookName)) {
                //          System.out.println(book);
                return goods;
            }
        }
        return null;
    }

    public String getStatus(String bookName) {
        Goods goods = searchByBookName(bookName);
        return bookList.get(goods);
    }

    public void switchStatus(String bookName) {
        Goods goods = searchByBookName(bookName);
        if (getStatus(bookName).equals("keep"))
            bookList.put(goods, "checked");
        else bookList.put(goods, "keep");
    }
}
