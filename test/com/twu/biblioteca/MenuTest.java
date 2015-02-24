package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MenuTest {

    @Test
    public void testWelcomeMessage() throws Exception {

        String welcome = "Welcome to the Biblioteca!";

        Menu menu = new Menu();

        assertEquals(welcome, menu.welcomeMessage());
    }

    @Test
    public void testListBooks() throws Exception {
        assertEquals("", new Menu().listBooks());
    }

    @Test
    public void testOptions() throws Exception {
        assertEquals("List Books,Quit", new Menu().options());
    }

    @Test
    public void testInvalidMessage() throws Exception {
        assertEquals("Insert Wrong!Please Insert again!",new Menu().invalidMessage());

    }


    @Test
    public void testChooseOption() throws Exception {
        assertTrue(new Menu().switchOption("List Books"));
        assertFalse(new Menu().switchOption(""));
//        assertEquals("3",new Menu().switchOption("Quit"));
    }

}