package com.example.game;

import com.example.base.GameConsole;

public class Badminton implements GameConsole {
    private int score;
    @Override
    public int computeScore(){
        System.out.println("score added");
        score++;
        return score;
    }
}
