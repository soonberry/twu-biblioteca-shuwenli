package com.twu.biblioteca;

/**
 * Created by shuwenli on 15-3-1.
 */
public class ReturnBook extends ManageBook {
    @Override
    public void welcomeMessage() {
        System.out.println("Which book do you want to return?\nPlease input the bookName,or input exit.");
    }

    public void successMessage(String bookName) {
        System.out.println("The book " + bookName + " is sucessfully returned!");
    }

    public boolean checkOut(String bookName, GoodsList goodsList, UserAccount userAccount) {
        if (goodsList.searchByBookName(bookName) != null) {
            if (goodsList.getStatus(bookName).equals("checked")) {
                goodsList.switchStatus(bookName, userAccount);
                return true;
            }
        }
        return false;
    }
}
