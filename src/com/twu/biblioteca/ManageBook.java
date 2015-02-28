package com.twu.biblioteca;

import java.util.Scanner;

/**
 * Created by shuwenli on 15-3-1.
 */
public abstract class ManageBook {
    public abstract void welcomeMessage();

    public abstract void successMessage(String bookName);

    public abstract boolean checkOut(String bookName, BookList bookList);

    private void invalidMessage() {
        System.out.println("Please input the right choice.");
    }

    public boolean checkBooks(BookList bookList) {
        welcomeMessage();
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        while (!option.equals("exit")) {
            if (checkOut(option, bookList))
                successMessage(option);
            else
                invalidMessage();
            welcomeMessage();
            option = scanner.nextLine();
        }
        return false;
    }
}
