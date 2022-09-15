package com.klasa3p;

public class Main {
    public static void main(String[] args) {
//        Losowanie 6 liczb
        System.out.println("Witaj na losowaniu 6 liczb");
//       tablica wylosowanych liczb
//       wartosci w tablicy typu prostego lub zlozonego
        int tab[] = new int[6];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * 100 + 1);
        }

//        odpowiednik foreach
        for (int i : tab) {
            System.out.print(i + " ");
        }

//        wpisywanie 6 liczb

//        sprawdzenie ile trafionych
    }
}
