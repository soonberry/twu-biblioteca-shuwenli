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
}