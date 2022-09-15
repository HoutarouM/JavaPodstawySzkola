package com.klasa3p.game;

import java.util.*;

public class Game {
//    modyfikatory dostepu
//    public - dostepne wszedzie
//    brak - dostepne wszedzie w pakiecie
//    private - dostepne tylko w klasie
//    protekted - w klasie i klasach potomnych oraz w pakiecie

//    uzywanie privat to hermetyzacja

    private static Set<Integer> tab = new HashSet<>();
    private List<Integer> inputtedTab = new ArrayList<>();
    private List<Integer> accurate = new LinkedList<>();

    public void play(int inputN) {
        getRandomNumbers(6);

        inputNumbers(inputN);

        compareArrays();

        System.out.println("Random numbers: " + tab);
        System.out.println("Inputted: " + inputtedTab);
        System.out.println("Result: " + accurate);
    }

    private static void getRandomNumbers(int n) {
//        while bo liczby moga sie powtarzac i nie dodawac sie do zbioru
        while (tab.size() < n)
            tab.add((int) (Math.random() * 100 + 1));
    }

    private void inputNumbers(int n) {
        Scanner input = new Scanner(System.in);

        System.out.println("Dodaj " + n + " liczb");

        inputtedTab.clear();

        while (inputtedTab.size() < n) {
            int num = input.nextInt();

            if (!inputtedTab.contains(num))
                inputtedTab.add(num);
            else
                System.out.println("Liczby nie moga sie powtarzac");
        }
    }

    private void compareArrays() {
//        jezeli wartosc wpisana zostala wylosowana to dodajemy ja do trafiona
        for (Integer n : inputtedTab)
            if (tab.contains(n))
                accurate.add(n);
    }
}
