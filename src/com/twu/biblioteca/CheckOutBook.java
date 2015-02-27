package com.twu.biblioteca;

import java.util.Scanner;

/**
 * Created by shuwenli on 15-2-27.
 */
public class CheckOutBook {

    public boolean checkOut(String bookName,BookList bookList) {
        if(bookList.searchByBookName(bookName)!=null){
            if(bookList.getStatus(bookName).equals("keep")) {
                bookList.setStatus(bookName);
                return true;
            }
        }
        return false;
    }

    public void checkBooks() {
        System.out.println("Which book do you want to Check?");
        Scanner scanner=new Scanner(System.in);
        String option=scanner.nextLine();

//        while (option)

    }
}
