package com.example.main;

import com.example.game.Badminton;
import com.example.game.Chess;

public class Implementation {
    public static void main(String[] args) {
        Badminton badminton = new Badminton();
        Chess chess = new Chess();
        System.out.println("badminton.computeScore() = " + badminton.computeScore());
        System.out.println("chess.computeScore() = " + chess.computeScore());
    }
}
