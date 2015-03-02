package com.twu.biblioteca;

import java.util.*;

/**
 * Created by shuwenli on 15-2-23.
 */
public class GoodsList {

    private Map<Goods, GoodsStatus> goodsList;

    public GoodsList(Map<Goods, GoodsStatus> map) {
        goodsList = map;
    }

    public GoodsList() {
        goodsList = new HashMap<Goods, GoodsStatus>();
        Goods book1 = new Book("a", "b", "c");
        Goods book2 = new Book("d", "e", "f");
        Goods movie1=new Movie("x","y","z","5");
        goodsList.put(book2, new GoodsStatus());
        goodsList.put(book1, new GoodsStatus());
        goodsList.put(movie1, new GoodsStatus());

    }


    public String toString(String privilege) {
        String result = "";
        int i = 1;
        Iterator<Goods> iterator = goodsList.keySet().iterator();

        while (iterator.hasNext()) {
            Goods goods = iterator.next();
            if (privilege.equals("Librarian"))
                result+=i+++": "+goods.toString()+", keeper: "+goodsList.get(goods).getUserAccount()+"\n";
            else if (getStatus(goods.getName()).equals("keep"))
                result += i++ + ": " + goods.toString() + "\n";
        }

        return result;
    }

    public Goods searchByBookName(String bookName) {
        Iterator<Goods> iterator = goodsList.keySet().iterator();

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
        return goodsList.get(goods).getStatus();
    }

    public void switchStatus(String bookName,UserAccount userAccount) {
        Goods goods = searchByBookName(bookName);
        if (getStatus(bookName).equals("keep"))
            goodsList.put(goods, new GoodsStatus("checked",userAccount));
        else goodsList.put(goods, new GoodsStatus("keep",null));
    }
}
