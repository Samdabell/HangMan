package com.example.user.hangman;

import static com.example.user.hangman.Input.getUserName;
import static com.example.user.hangman.Input.getWord;

/**
 * Created by user on 28/06/2017.
 */

public class Runner {


    public static void main(String[] args) {
        Print.askName();
        String name = Input.getUserName();
        Print.askWord();
        String stringWord =  Input.getWord();
        Print.clearScreen();
        User user = new User(name);
        Word word = new Word(new StringBuilder(stringWord));
        Game game = new Game(word, user, new Print());
        game.getWordLength();
        while (!game.loseCheck()) {
            Print.askLetter();
            char letter = Input.getLetter();
            game.guessLetter(letter);
            if (game.winCheck()){
                game.win();
                break;
            }
        }
    }
}
