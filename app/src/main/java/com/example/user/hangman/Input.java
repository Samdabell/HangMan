package com.example.user.hangman;

import java.util.Scanner;

/**
 * Created by user on 28/06/2017.
 */

public class Input {

    static Scanner sc = new Scanner(System.in);

    public static String getUserName(){
        String name = String.valueOf(sc.nextLine());
        return name;
    }

    public static String getWord(){
        String word = String.valueOf(sc.nextLine().toLowerCase());
        return word;
    }

    public static char getLetter(){
        char letter = String.valueOf(sc.nextLine()).charAt(0);
        return letter;
    }
}
