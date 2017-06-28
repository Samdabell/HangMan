package com.example.user.hangman;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 28/06/2017.
 */

public class GameTest {
    Word word;
    User user;
    Game game;


    @Before
    public void Before(){
        word = new Word(new StringBuilder("holiday"));
        user = new User("SamJohn");
        game = new Game(word, user, new Print());
    }


}
