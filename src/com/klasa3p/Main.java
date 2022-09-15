package com.klasa3p;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Losowanie 6 liczb
        System.out.println("Witaj na losowaniu 6 liczb");

//        tablica wylosowanych licz
        Set<Integer> tab = getRandomNumbers(6);

        System.out.println("Liczby: " + tab);


//        wpisywanie liczb
        List<Integer> inputtedTab = inputNumbers(10);


//        sprawdzenie ktore wartosci wpisane zostali wylosowane
        List<Integer> accurate = compareArrays(tab, inputtedTab);

//        sortowanie liczb
//        sortowac mozna tylko indeksowane
        Collections.sort(accurate);

        System.out.println("Trafiono: " + accurate);
    }

    public static Set<Integer> getRandomNumbers(int n) {
        Set<Integer> tab = new HashSet<>();

//        while bo liczby moga sie powtarzac i nie dodawac sie do zbioru
        while (tab.size() < n) {
            tab.add((int) (Math.random() * 100 + 1));
        }

        return tab;
    }

    public static List<Integer> inputNumbers(int n) {
        Scanner input = new Scanner(System.in);

        List<Integer> inputtedTab = new ArrayList<>();

        System.out.println("Dodaj " + n + " liczb");

        int num;

        while (inputtedTab.size() < n) {
            num = input.nextInt();

            if (!inputtedTab.contains(num)) {
                inputtedTab.add(num);
            } else {
                System.out.println("Liczby nie moga sie powtarzac");
            }
        }

        return inputtedTab;
    }

    public static List<Integer> compareArrays(Set<Integer> tab, List<Integer> inputtedTab) {
        List<Integer> accurate = new LinkedList<>();

//        jezeli wartosc wpisana zostala wylosowana to dodajemy ja do trafiona
        for (Integer n : inputtedTab) {
            if (tab.contains(n)) {
                accurate.add(n);
            }
        }

        return accurate;
    }
}
