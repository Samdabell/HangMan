package com.example.user.hangman;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 28/06/2017.
 */

public class UserTest {

    User user;


    @Before
    public void Before(){
        user = new User("SamJohn");
    }

    @Test
    public void canGetUserName(){
        assertEquals("SamJohn", user.getName());
    }

    @Test
    public void canGetUserLives(){
        assertEquals(6, user.getLives());
    }

    @Test
    public void canLoseLife(){
        user.loseLife();
        assertEquals(5, user.getLives());
    }


}
