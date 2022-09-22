package com.klasa3p;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        1 - wylosoj 20 liczb z zakresu od 1 do 50 i zapisz w dowlolnej zmiennej
        int[] tab = new int[20];
        pierwsze(tab);


//        2 - przygotuj zmienna zawierajaca liczby z 1 zadania bez powtorzen
        drugie(tab);


//        3 - wypisz z tablicy liczby pierwsze
        trzecie(tab);


//        4 - znajdz najdlurzszy ciag rosnacy w elementach z zadania 1
        czwarte(tab);
    }

    public static void pierwsze(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * 50 + 1);
        }
    }

    public static void drugie(int[] tab) {
        Set<Integer> kolekcja = new HashSet<>();
        for (int i = 0; i < tab.length; i++) {
            kolekcja.add(tab[i]);
        }
    }

    public static void trzecie(int[] tab) {
        System.out.println("Liczby pierwsze: ");

        Set<Integer> liczby = new HashSet<>();

        boolean pierwsza;

        for (int i = 0; i < tab.length; i++) {
            pierwsza = true;

            for (int j = 2; j < tab[i]; j++) {
                if (tab[i] % j == 0) {
                    pierwsza = false;
                }
            }

            if (pierwsza == true) {
                liczby.add(tab[i]);
            }
        }

        System.out.println(liczby);
    }

    public static void czwarte(int[] tab) {
        List<Integer> ciag = new ArrayList<>();

        for (int i = 0; i < tab.length - 1; i++) {
            if (tab[i] > tab[i + 1]) {
                ciag.clear();
            }

            ciag.add(tab[i]);
        }

        Collections.sort(ciag);

        System.out.println("Ciag: " + ciag);
    }
}