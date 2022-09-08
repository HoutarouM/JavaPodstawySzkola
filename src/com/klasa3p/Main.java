package com.klasa3p;

// javac create .class file

import java.util.Scanner;

// zgadnij liczbe
public class Main {
    public static void main(String[] args) {
        // wylosowanie liczby

//        rzutowanie zawezajace - wyrzuca liczby po przecinku
        int randomN = (int) (Math.random() * 100 + 1);

        int iNumber;
        int counter = 0;

        Scanner input;

        do {
            //        Wyczytywanie
            System.out.println("Write number: ");
            input = new Scanner(System.in);
            iNumber = input.nextInt();

            if (iNumber == randomN) {
                break;
            }

            if (iNumber > randomN) {
                System.out.println("Zaduza");
            } else {
                System.out.println("Zamala");
            }

            counter++;
        } while (iNumber != randomN);

        System.out.println("Congratulation you tried " + counter + " times.");
    }
}
/**
 * Komentarze typu java doc
 * wszystkie komentarze dotyczace documentacji programu
 */