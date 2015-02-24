package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MenuTest {

    @Test
    public void testWelcomeMessage() throws Exception {

        String welcome = "Welcome to the Biblioteca!";

        Menu menu = new Menu();

        assertEquals(welcome, menu.welcomeMessage());
    }

    @Test
    public void testListBooks() throws Exception {
        assertEquals("",new Menu().listBooks());
    }

    @Test
    public void testOptions() throws Exception {
        assertEquals("List Books",new Menu().options());
    }

    @Test
    public void testChooseOption() throws Exception {
        assertEquals("List Books",new Menu().chooseOption());
    }
}