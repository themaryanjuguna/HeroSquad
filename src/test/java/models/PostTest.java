package models;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PostTest {

    @Test
    public void NewPostObjectGetsCorrectlyCreated_true() throws Exception {
        hero hero = new hero("Huey", "dob", "strength", "weakness");
        assertEquals(true, hero instanceof hero);
    }


}