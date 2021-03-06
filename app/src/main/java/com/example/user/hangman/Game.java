package com.example.user.hangman;

import java.util.ArrayList;

import static android.media.CamcorderProfile.get;

/**
 * Created by user on 28/06/2017.
 */

public class Game {

    Word word;
    Word hiddenWord;
    User user;
    Print print;
    int counter;
    ArrayList<Character> guessed;

    public Game(Word word, User user, Print print){
        this.word = word;
        this.user = user;
        this.print = print;
        this.counter = 0;
        guessed = new ArrayList<Character>();
    }

    public void getWordLength() {
        print.wordLength(word.getWordLength());
    }

    public void setCoveredWord(){
        word.setCoveredWord();
    }

    public void getCoveredWord(){
        print.coveredWord(word.getCoveredWord());
    }

    public void getLetterPositions(char letter){
        print.positions(letter, word.checkForLetter(letter));
        counter += word.checkForLetter(letter).size();
    }

    public void checkForWrongAnswer(char letter){
        if (word.checkForLetter(letter).size() == 0) {
            removeLife();
        }
    }

    public void guessLetter(char letter){
        if(!guessed.contains(letter)){
            guessed.add(letter);
            getLetterPositions(letter);
            checkForWrongAnswer(letter);
        }
        else{
            print.repeatGuess();
        }
    }

    public int viewUserLives(){
        return user.getLives();
    }

    public void removeLife(){
        user.loseLife();
        print.loseLife(viewUserLives());
    }

    public boolean loseCheck(){
       return user.getLives() == 0;
    }

    public boolean winCheck(){
        return counter == word.getWordLength();
    }

    public void win(){
        print.winMessage(word.changeToString(), user);
    }

    public void showGuessed(){
        print.guessedLetters(guessed);
    }
}
