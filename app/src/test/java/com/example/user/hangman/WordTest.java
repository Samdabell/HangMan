package com.example.user.hangman;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 28/06/2017.
 */

public class WordTest {

    Word word;

    @Before
    public void Before(){
        word = new Word(new StringBuilder("alphabet"));
    }

    @Test
    public void testLetterPosition(){
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        assertEquals(expected, word.checkForLetter('l'));
    }

    @Test
    public void testMultipleLetterPosition(){
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(5);
        assertEquals(expected , word.checkForLetter('a'));
    }

    @Test
    public void testNoLetter(){
        ArrayList<Integer> expected = new ArrayList<Integer>();
        assertEquals(expected, word.checkForLetter('z'));
    }

    @Test
    public void testString(){
        assertEquals("alphabet", word.changeToString());
    }
}
