package com.klasa3p;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Losowanie 6 liczb
        System.out.println("Witaj na losowaniu 6 liczb");

//        tablica wylosowanych liczb
//        losowanie bez powtorzen
//        kolekcje
//        moga miec tylko typy generyczne(zlozone)
//        po zadeklarowanie mozna usuwac i dodawac elementy

//        zbiour
//        HashSet niema indeksacji ale elementy sie nie powtarzaja
//        zbior zazwyczaj zawiera elementy bez powtorzen
//        zbior zazwycza nie am indeksowania elementow
//        zbior ma metody
        Set<Integer> tab = new HashSet<>();

//        while bo liczby moga sie powtarzac i nie dodawac sie do zbioru
        while (tab.size() < 6) {
            tab.add((int) (Math.random() * 10 + 1));
        }

        System.out.println(tab);


//        wpisywanie 6 liczb
//        dodajemy elementy na koncu listy
//        na razie dowolne potem bez powturzen
        Scanner input = new Scanner(System.in);

//        Lista to kolekcja w ktorej mozna zmieniac rozmiar w trakcie dzialania programu
//        elemanty indeksowane moga sie powtarzac
        List<Integer> inputtedTab = new ArrayList<>();

        System.out.println("Dodaj 6 liczb");

        while (inputtedTab.size() < 6) {
            int n = input.nextInt();

            if (!inputtedTab.contains(n)) {
                inputtedTab.add(n);
            } else {
                System.out.println("Liczby nie moga sie powtarzac");
            }
        }

        System.out.println(inputtedTab);


//        sprawdzenie ktore wartosci wpisane zostali wylosowane
        List<Integer> accurate = new LinkedList<>();

//        jezeli wartosc wpisana zostala wylosowana to dodajemy ja do trafiona
        for (Integer n : inputtedTab) {
            if (tab.contains(n)) {
                accurate.add(n);
            }
        }

        System.out.println(accurate);
    }
}
