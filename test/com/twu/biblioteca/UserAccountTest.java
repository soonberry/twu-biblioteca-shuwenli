package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UserAccountTest {

    @Test
    public void testIsMatch() throws Exception {
        UserAccount userAccount=new UserAccount("111-1111","111","1","1@1","11111111","Librarian");

        assertTrue(userAccount.isMatch("111-1111","111"));
        assertFalse(userAccount.isMatch("111-1111","222"));

    }

    @Test
    public void testSetPriority() throws Exception {
        UserAccount userAccount=new UserAccount("111-1111","111","1","1@1","11111111","Librarian");

        assertEquals("Librarian",userAccount.getPrivilege());

        userAccount.setPrivilege("Customer");

        assertEquals("Customer",userAccount.getPrivilege());

    }
}