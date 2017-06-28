package com.example.user.hangman;

import java.util.ArrayList;

/**
 * Created by user on 28/06/2017.
 */

public class Print {

    public static void askName(){
        System.out.println("Enter your name");
    }

    public static void askWord(){
        System.out.println("Get you opponent to enter a word");
    }

    public static void clearScreen(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
    }

    public void wordLength(int length){
        System.out.println(String.format("Word has %d letters", length));
    }

    public static void askLetter(){
        System.out.println("Guess a letter");
    }

    public void positions(char letter, ArrayList<Integer> positions){
        System.out.println(letter + " is in the following positions " + positions);
    }

    public void repeatGuess(){
        System.out.println("Sorry you have already guessed this letter");
    }

    public void loseLife(int lives) {
        System.out.println(String.format("Sorry, wrong guess. You have %d lives left", lives));
    }

    public void winMessage(String word){
        System.out.println("Well done, you have won, you guessed every letter of " + word);
    }
}
