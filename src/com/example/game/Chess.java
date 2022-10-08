package com.example.game;

import com.example.base.GameConsole;

public class Chess implements GameConsole {
    private int score;

    public int computeScore(){
        System.out.println("chess score added");
        score = score + 5;
        return score;
    }
}
