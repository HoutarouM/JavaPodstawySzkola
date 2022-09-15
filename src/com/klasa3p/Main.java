package com.klasa3p;

public class Main {
    public static void main(String[] args) {
//        Losowanie 6 liczb
        System.out.println("Witaj na losowaniu 6 liczb");
//       tablica wylosowanych liczb
//       wartosci w tablicy typu prostego lub zlozonego
//       w tablicy nie ma mozliwosci zmiany jej rozmiaru po jej deklaracji
        int tab[] = new int[6];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * 100 + 1);
        }

//        klonowanie objektow
//        inne imie dla objectu
        int tab2[] = tab;
//        nowy object z wartosciami istniejacego
        int tab3[] = tab.clone();

        System.out.println("tab");
        System.out.println(tab);
        System.out.println("tab2");
        System.out.println(tab2);
        System.out.println("tab3");
        System.out.println(tab3);

//        odpowiednik foreach
        for (int i : tab) {
            System.out.print(i + " ");
        }

//        wpisywanie 6 liczb

//        sprawdzenie ile trafionych
    }
}
