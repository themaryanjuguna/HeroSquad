package models;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PostTest {

    @Test
    public void NewPostObjectGetsCorrectlyCreated_true() throws Exception {
        post post = new post("Day 1: Intro");
        assertEquals(true, post instanceof models.post);
    }


}