package com.klasa3p;

import java.util.HashSet;
import java.util.Set;

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

//        odpowiednik foreach
        for (int i : tab) {
            System.out.print(i + " ");
        }

//        wpisywanie 6 liczb

//        sprawdzenie ile trafionych
    }
}
