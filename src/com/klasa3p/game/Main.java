package com.klasa3p.game;

public class Main {
    public static void main(String[] args) {
//        Losowanie liczb
        System.out.println("Witaj na losowaniu liczb");

        Game game = new Game();

        game.inputNumbers(8);
        game.getRandomNumbers(6);
        game.compareArrays();

        System.out.println(game.accurate);
    }
}
