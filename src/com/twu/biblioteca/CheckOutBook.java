package com.twu.biblioteca;

/**
 * Created by shuwenli on 15-2-27.
 */
public class CheckOutBook extends ManageBook {

    public boolean checkOut(String bookName, BookList bookList) {
        if (bookList.searchByBookName(bookName) != null) {
            if (bookList.getStatus(bookName).equals("keep")) {
                bookList.switchStatus(bookName);
                return true;
            }
        }
        return false;
    }


    public void welcomeMessage() {
        System.out.println("Which book do you want to check out?\nPlease input the bookName,or input exit.");
    }

    public void successMessage(String bookName) {
        System.out.println("The book " + bookName + " is sucessfully checked out!");
    }


}
