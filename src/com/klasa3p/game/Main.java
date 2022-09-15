package com.klasa3p.game;

public class Main {
    public static void main(String[] args) {
//        Losowanie liczb
        System.out.println("Witaj na losowaniu liczb");

        Game game = new Game();

        game.play(4);

        Game game2 = new Game();

        game2.play(4);
    }
}
