package com.twu.biblioteca;

import java.util.Scanner;

/**
 * Created by shuwenli on 15-2-23.
 */
public class Menu {

    private GoodsList booklist;
    private UserAccountsList userAccountsList;
    private UserAccount userAccount;

    public Menu() {
        this.booklist = new GoodsList();
        this.userAccountsList=new UserAccountsList();
    }

    public String welcomeMessage() {
        return "Welcome to the Biblioteca!";
    }


    public String listBooks() {

        return booklist.toString(userAccount.getPrivilege());
    }

    public String options() {
        return "Please choose: \n1.List Books and Movies;\n2.See my account information;\n3.Quit";
    }


    public void optionMenu() {

        System.out.println(options());
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();

        while (switchOption(option)) {
            System.out.println(options());
            option = scanner.nextLine();
        }
    }

    public String invalidMessage() {
        return "Insert Wrong!Please Insert again!";
    }

    public boolean switchOption(String option) {
        if (option.equals("1")) {
            System.out.println("All the books are list below:");
            System.out.println(listBooks());
            bookOperation();
            return true;
        }else if (option.equals("2")){
            System.out.println("My account information is :\n"+userAccount.toString());
            return true;
        }
        else if (option.equals("Quit") || option.equals("3")) {
            System.out.println("Bye-bye!");
            return false;
        } else {
            System.out.println(invalidMessage());
            return true;
        }
    }

    private void bookOperation() {
        System.out.println("Please choose:\n1.Check out book/movie;\n2.Return book/movie;\n3.Quit;");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        while (!option.equals("3")) {
            if (option.equals("1")) {
                CheckOutBook checkOutBook = new CheckOutBook();
                checkOutBook.checkBooks(booklist,userAccount);
            } else if (option.equals("2")) {
                ReturnBook returnBook = new ReturnBook();
                returnBook.checkBooks(booklist,userAccount);
            } else {
                System.out.println("Please input the right number.");
            }
            System.out.println("Please choose:\n1.Check out book/movie;\n2.Return book/movie;\n3.Quit.");
            option = scanner.nextLine();
        }
    }

    public void login(){
        boolean flag=true;
        Scanner scanner = new Scanner(System.in);

        while(flag) {
            System.out.println("Please input your account number and password:");

            String number = scanner.nextLine();
            String password = scanner.nextLine();
            if (userAccountsList.checkLogin(number, password)) {
                userAccount = userAccountsList.getUserAccount(number, password);
                System.out.println("Login success!Welcome " + userAccount.getName());
                flag=false;
            }
            else System.out.println("Number or password is wrong!Please input again!");
        }

    }
}
