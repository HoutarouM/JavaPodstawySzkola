package com.klasa3p;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        firstExercise();

        secondExercise();
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

        int res_index = Arrays.binarySearch(tab, n);

        if (res_index < 0) {
            res_index = res_index * (-1) - 1;
        }

        System.out.println("res: " + tab[res_index]);
    }
}
