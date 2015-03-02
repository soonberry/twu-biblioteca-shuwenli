package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {

    @Test
    public void test_the_rating_should_between_1to10_or_unrated() throws Exception {

        Movie movie=new Movie("name","1995","director","1");

        assertEquals("name,1995,director,1",movie.toString());

        Movie movie1=new Movie("red","1999","director1","20");

        assertEquals("red,1999,director1,unrated",movie1.toString());
    }
}