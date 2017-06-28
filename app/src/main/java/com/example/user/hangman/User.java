package com.example.user.hangman;

/**
 * Created by user on 28/06/2017.
 */

public class User {

    private String name;
    private int lives;


    public User(String name){
        this.name = name;
        this.lives = 6;
    }

    public String getName() {
        return this.name;
    }

    public int getLives() {
        return this.lives;
    }

    public void loseLife(){
        this.lives -= 1;
    }
}
