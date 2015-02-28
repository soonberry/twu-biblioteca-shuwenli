package com.twu.biblioteca;

import java.util.Scanner;

/**
 * Created by shuwenli on 15-2-27.
 */
public class CheckOutBook {

    public boolean checkOut(String bookName,BookList bookList) {
        if(bookList.searchByBookName(bookName)!=null){
            if(bookList.getStatus(bookName).equals("keep")) {
                bookList.switchStatus(bookName);
                return true;
            }
        }
        return false;
    }

    public void checkBooks(BookList bookList) {
        System.out.println("Which book do you want to check out?Please input the bookName,or input exit.");
        Scanner scanner=new Scanner(System.in);
        String option=scanner.nextLine();
        while (!option.equals("exit")){
            if(!checkOut(option, bookList))
                invalidMessage();
            option=scanner.nextLine();
        }

    }

    private void invalidMessage() {
        System.out.println("Please input the right choice.");
    }
}
