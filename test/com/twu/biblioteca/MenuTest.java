package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class MenuTest {

    @Test
    public void testWelcomeMessage() throws Exception {

        String welcome = "Welcome to the Biblioteca!";

        Menu menu = new Menu();

        assertEquals(welcome, menu.welcomeMessage());
    }


    @Test
    public void testInvalidMessage() throws Exception {
        assertEquals("Insert Wrong!Please Insert again!",new Menu().invalidMessage());

    }

//    @Test
//    public void testSwitchOption() throws Exception {
//        assertTrue(new Menu().switchOption("List book"));
//        assertFalse(new Menu().switchOption("Quit"));
//        assertTrue(new Menu().switchOption("List Books"));
//    }

    @Test
    public void testListBooks() throws Exception {
        assertEquals("1,a,b,c\n2,d,e,f\n", new Menu().listBooks());
    }
}