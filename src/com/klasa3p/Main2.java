package com.klasa3p;

// javac create .class file

import java.util.Scanner;

// zgadnij liczbe
public class Main2 {
    public static void main(String[] args) {
        // wylosowanie liczby

//        zmienne typy:
//        - proste - int
//        - generyczne - String

//        random zakres <0, 1)
//        wylosowana z zakresu 1, 100

//        rzutowanie zawezajace - wyrzuca liczby po przecinku
        int randomN = (int) (Math.random() * 100 + 1);

//        rzutowanie rozszzajaca
        double other = randomN;

//        Typy proste:
//        - float
//        - double
//        - boolean
//        - char
//        - bite
//        - short
//        - int
//        - long


//        Wyczytywanie
        System.out.println("Write number: ");
        Scanner input = new Scanner(System.in);
        int iNumber = input.nextInt();

        if (iNumber == randomN) {
            System.out.println("Congratulations!!");
        } else {
//            wyrarzenie ? trawda : falsz
            int sub = iNumber > randomN ? iNumber - randomN : randomN - iNumber;

//            wyrarzenie zwraca wartosc
//            wyrarzenie nie zwraca wartosci

//            dzielenie calkowite
            sub /= 10;

//            switch
            switch (sub) {
                case 0:
                    System.out.println("Near");
                    break;
                case 1:
                    System.out.println("Not bad");
                    break;
                case 2:
                    System.out.println("Close");
                default:
                    System.out.println("Try something else");
            }


            System.out.println(
                    switch (sub) {
                        case 0 -> "Near";
                        case 1 -> "Not bad";
                        case 2 -> "Close";
                        default -> "Try something else";
                    });

//            wyrarzenie zwraca wartosc
//            instrukcje nie
        }
    }
}