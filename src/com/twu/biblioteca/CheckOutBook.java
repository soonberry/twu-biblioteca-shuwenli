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

    public boolean checkBooks(BookList bookList) {
        welcomeMessage();
        Scanner scanner=new Scanner(System.in);
        String option=scanner.nextLine();
        while (!option.equals("exit")){
            if(checkOut(option, bookList))
                successMessage(option);
            else
                invalidMessage();
            welcomeMessage();
            option=scanner.nextLine();
        }
        return false;
    }

    private void welcomeMessage(){
        System.out.println("Which book do you want to check out?\nPlease input the bookName,or input exit.");
    }

    private void successMessage(String bookName) {
        System.out.println("The book "+bookName+" is sucessfully checked out!");
    }

    private void invalidMessage() {
        System.out.println("Please input the right choice.");
    }
}
