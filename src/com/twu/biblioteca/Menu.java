package com.twu.biblioteca;

import java.util.Scanner;

/**
 * Created by shuwenli on 15-2-23.
 */
public class Menu {

    private BookList booklist;

    public Menu() {
        this.booklist = new BookList();
        System.out.println(welcomeMessage());
        System.out.println(options());
  //      chooseOption();
    }

    public String welcomeMessage() {
        return "Welcome to the Biblioteca!";
    }


    public String listBooks() {
        return booklist.toString();
    }

    public String options() {
        return "List Books";
    }

    public boolean chooseOption() {
        Scanner scanner=new Scanner(System.in);
        String option=scanner.nextLine();
        if (option.equals("List Books"))
            return true;
        else
            return false;
    }
}
