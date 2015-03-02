package com.twu.biblioteca;

/**
 * Created by shuwenli on 15-2-27.
 */
public class CheckOutBook extends ManageBook {

    public boolean checkOut(String bookName, GoodsList goodsList,UserAccount userAccount) {
        if (goodsList.searchByBookName(bookName) != null) {
            if (goodsList.getStatus(bookName).equals("keep")) {
                goodsList.switchStatus(bookName,userAccount);
                return true;
            }
        }
        return false;
    }


    public void welcomeMessage() {
        System.out.println("Which book/movie do you want to check out?\nPlease input the name of book/movie,or input exit.");
    }

    public void successMessage(String bookName) {
        System.out.println("The book/movie " + bookName + " is sucessfully checked out!");
    }


}
