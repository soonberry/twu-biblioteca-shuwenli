package com.twu.biblioteca;

import java.util.Scanner;

/**
 * Created by shuwenli on 15-2-23.
 */
public class Menu {

    private BookList booklist;

    public Menu() {
        this.booklist = new BookList();
    }

    public String welcomeMessage() {
        return "Welcome to the Biblioteca!";
    }


    public String listBooks() {
        return booklist.toString();
    }

    public String options() {
        return "Please choose: 1.List Books; 2.Quit";
    }


    public void optionMenu() {

        System.out.println(options());
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();

        while (switchOption(option)) {
            System.out.println(options());
            option=scanner.nextLine();
        }
    }

    public String invalidMessage() {
        return "Insert Wrong!Please Insert again!";
    }

    public boolean switchOption(String option) {
        if (option.equals("List Books")||option.equals("1")) {
            System.out.println("All the books are list below:");
            System.out.println(listBooks());
            bookOperation();
            return true;
        }
        else if (option.equals("Quit")||option.equals("2")){
            System.out.println("Bye-bye!");
            return false;
        }
        else {
            System.out.println(invalidMessage());
            return true;
        }
    }

    private void bookOperation() {
        System.out.println("Please choose:1.check out book.  2.return book  3.exit");
        Scanner scanner=new Scanner(System.in);
        String option=scanner.nextLine();
        while(!option.equals("3")){
            if (option.equals("1")){
                CheckOutBook checkOutBook=new CheckOutBook();
                checkOutBook.checkBooks(booklist);
            }
            else {
                System.out.println("Please input the right number.");
            }

        }

    }
}
