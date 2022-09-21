package com.klasa3p;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        firstExercise();
        

        secondExercise();


        int[] tab = new int[100];

        thirdExercise(tab);

        fourthExercise(tab);


        fifthExercise();
    }

    public static void firstExercise() {
        int[] tab = new int[10];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) Math.sqrt(i);
        }

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

    public static int binarySearch(int[] tab, int key) {
        int startIndex = 0;
        int endIndex = tab.length - 1;
        int pivot;

//        find and return index
        while (startIndex <= endIndex) {
            pivot = (startIndex + endIndex) / 2;

            if (tab[pivot] == key)
                return pivot;

            if (tab[pivot] > key)
                endIndex = pivot - 1;

            if (tab[pivot] < key)
                startIndex = pivot + 1;
        }

//        if number mot found
//        return index of the closest to key
        if (tab[startIndex] - key >= key - tab[endIndex])
            return endIndex * -1;
        else
            return startIndex * -1;
    }

    public static void secondExercise() {
        System.out.println("Wpisz liczbe: ");

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] tab = new int[40];

        tab[0] = 0;
        tab[1] = 1;

        for (int i = 2; i < tab.length; i++) {
            tab[i] = tab[i - 2] + tab[i - 1];
        }

        int res_index = binarySearch(tab, n);


        if (res_index < 0)
            res_index = res_index * (-1);


        System.out.println("res: " + tab[res_index]);
    }

    public static void thirdExercise(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * 100 + 1);
        }


//        kolekcja liczb parzystych
        Set<Integer> evenNumbers = new HashSet<>();
//        kolekcja liczb nie parzystych
        Set<Integer> oddNumbers = new HashSet<>();

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {
                evenNumbers.add(tab[i]);
            } else {
                oddNumbers.add(tab[i]);
            }
        }


        System.out.println("Ilosc liczb parzystych: " + evenNumbers.size());

        System.out.println("Ilosc liczb nie parzystych: " + oddNumbers.size());
    }

    public static void swap(int[] tab, int indexA, int indexB) {
        int t = tab[indexA];
        tab[indexA] = tab[indexB];
        tab[indexB] = t;
    }

    public static void sort(int[] tab) {
        for (int i = 0; i < tab.length - 1; i++)
            for (int j = i; j < tab.length; j++)
                if (tab[i] > tab[j])
                    swap(tab, i, j);
    }

    public static void fourthExercise(int[] tab) {
        sort(tab);

        int mediana;
        if (tab.length % 2 != 0) {
            mediana = tab[(tab.length / 2) + 1];
        } else {
            mediana = (tab[tab.length / 2] + tab[(tab.length / 2) + 1]) / 2;
        }
        System.out.println("Mediana: " + mediana);

        int dominanta = 0;
        int counderMax = 0;
        for (int i = 0; i < tab.length; i++) {
            int counter = 0;

            for (int j = 0; j < tab.length; j++) {
                if (tab[i] == tab[j]) {
                    counter++;
                }
            }

            if (counter > counderMax) {
                counderMax = counter;

                dominanta = tab[i];
            }
        }

        System.out.println("Dominanta: " + dominanta);

        int srednia = 0;
        for (int i = 0; i < tab.length; i++) {
            srednia += tab[i];
        }
        srednia /= tab.length;
        System.out.println("Srednia: " + srednia);
    }

    public static void sitoErastotenesa(boolean[] tab) {
        for (int i = 2; i < tab.length; i++)
            tab[i] = true;


        for (int i = 2; i < tab.length; i++)
            if (tab[i])
                for (int j = i * i; j < tab.length; j += i)
                    if (i != j)
                        tab[j] = false;
    }

    public static void fifthExercise() {
        Scanner input = new Scanner(System.in);

        System.out.println("Wpisz zakres x i y: ");
        int x = input.nextInt();
        int y = input.nextInt();

        boolean[] primeNumbers = new boolean[1000];

        sitoErastotenesa(primeNumbers);

        System.out.print("Liczby pierwsze: ");

        for (int i = x; i < y; i++)
            if (primeNumbers[i])
                System.out.print(i + " ");
    }
}
