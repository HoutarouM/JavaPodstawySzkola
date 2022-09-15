package com.klasa3p.game;

import java.util.*;

public class Game {
//    modyfikatory dostepu
//    public - dostepne wszedzie
//    brak - dostepne wszedzie w pakiecie
//    private - dostepne tylko w klasie
//    protekted - w klasie i klasach potomnych oraz w pakiecie

//    uzywanie privat to hermetyzacja

    private Set<Integer> tab = new HashSet<>();
    private List<Integer> inputtedTab = new ArrayList<>();
    List<Integer> accurate = new LinkedList<>();

    public void getRandomNumbers(int n) {
//        while bo liczby moga sie powtarzac i nie dodawac sie do zbioru
        while (tab.size() < n)
            tab.add((int) (Math.random() * 100 + 1));
    }

    public void inputNumbers(int n) {
        Scanner input = new Scanner(System.in);

        System.out.println("Dodaj " + n + " liczb");

        int num;

        while (inputtedTab.size() < n) {
            num = input.nextInt();

            if (!inputtedTab.contains(num))
                inputtedTab.add(num);
            else
                System.out.println("Liczby nie moga sie powtarzac");
        }
    }

    public void compareArrays() {
//        jezeli wartosc wpisana zostala wylosowana to dodajemy ja do trafiona
        for (Integer n : inputtedTab)
            if (tab.contains(n))
                accurate.add(n);
    }
}
