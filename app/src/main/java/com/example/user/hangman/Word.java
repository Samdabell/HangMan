package com.example.user.hangman;

import java.util.ArrayList;

/**
 * Created by user on 28/06/2017.
 */



public class Word {

    StringBuilder word;

    public Word(StringBuilder word){
        this.word = word;
    }

    public String changeToString(){
        return word.toString();
    }

    public int getWordLength(){
        return word.length();
    }

    public ArrayList<Integer> checkForLetter(char letter){
        ArrayList<Integer> positions = new ArrayList<Integer>();
        for (int i = 0; i < word.length(); i++ ){
            if (word.charAt(i) == letter){
                positions.add(i+1);
            }
        }
        return positions;
    }
}
