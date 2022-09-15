package com.klasa3p;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        firstExercise();
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
}
