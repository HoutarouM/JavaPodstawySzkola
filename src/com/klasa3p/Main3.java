package com.klasa3p;

// javac create .class file

import java.util.Scanner;

// zgadnij liczbe
public class Main3 {
    public static void main(String[] args) {
        // wylosowanie liczby

//        zmienne typy:
//        - proste - int
//        - generyczne - String

//        random zakres <0, 1)
//        wylosowana z zakresu 1, 100

//        rzutowanie zawezajace - wyrzuca liczby po przecinku
        int randomN = (int) (Math.random() * 100 + 1);

//        Typy proste:
//        - float
//        - double
//        - boolean
//        - char
//        - bite
//        - short
//        - int
//        - long

        int iNumber;
        int counter = 0;

        boolean isComplete = false;

//    iteracje
//    zgadywanie 10 razy
        for (int i = 0; i < 10; i++) {
            //        Wyczytywanie
            System.out.println("Write number: ");
            Scanner input = new Scanner(System.in);
            iNumber = input.nextInt();

            if (iNumber == randomN) {
                System.out.println("Congratulations!! " + counter + " is your score.");
                isComplete = true;
                break;
            } else {
//            wyrarzenie ? trawda : falsz
                int sub = iNumber > randomN ? iNumber - randomN : randomN - iNumber;

//            wyrarzenie zwraca wartosc
//            wyrarzenie nie zwraca wartosci

//            dzielenie calkowite
                sub /= 10;

//            switch
                System.out.println(
                        switch (sub) {
                            case 0 -> "Near";
                            case 1 -> "Not bad";
                            case 2 -> "Close";
                            default -> "Try something else";
                        });

//            wyrarzenie zwraca wartosc
//            instrukcje nie

                counter++;
            }
        }

        if (!isComplete) {
            System.out.println("Try binary search.");
        }
    }
}