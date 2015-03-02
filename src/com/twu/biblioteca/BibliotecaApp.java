package com.twu.biblioteca;

public class BibliotecaApp {


    public static void main(String[] args) {

        //    System.out.println("Hello, world!");
        Menu menu = new Menu();
        System.out.println(menu.welcomeMessage());
        menu.login();
        menu.optionMenu();
    }

}
