package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UserAccountsListTest {

    @Test
    public void should_return_the_right_match_of_correct_version() throws Exception {
        UserAccountsList userAccountsList = new UserAccountsList();

        assertTrue(userAccountsList.isCorrectVersion("111-1111"));
        assertTrue(userAccountsList.isCorrectVersion("222-2222"));
        assertFalse(userAccountsList.isCorrectVersion("11_11xy"));

    }

    @Test
    public void testCheckLogin() throws Exception {

        UserAccountsList userAccountsList = new UserAccountsList();

        assertTrue(userAccountsList.checkLogin("111-1111", "111"));
        assertFalse(userAccountsList.checkLogin("111-1111", "22y"));

    }

}