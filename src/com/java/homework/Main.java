package com.java.homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("First exercise");
//        firstExercise();
//
//        System.out.println("Second exercise");
//        secondExercise();

//        System.out.println("Third exercise");
//        thirdExercise();

        System.out.println("Fourth exercise");
        fourthExercise();
    }

    public static void firstExercise() {
        for (int i = 10; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void secondExercise() {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int wordLength = word.length();

        boolean isPalindrome = true;

        for (int i = 0; i < wordLength; i++) {
            if (word.charAt(i) != word.charAt(wordLength - i - 1)) {
                isPalindrome = false;
            }
        }

        if (isPalindrome) {
            System.out.println("Word is palindrome :)");
        } else {
            System.out.println("Word isn't palindrome :(");
        }
    }

    public static boolean isNumberAPalindrome(int n) {
        if (n == 0) {
            return true;
        }

        if (n < 0 && n % 10 == 0) {
            return false;
        }

        int rev = 0;
        int pop;

        while (n > rev) {
            pop = n % 10;

            n /= 10;

            rev = (rev * 10) + pop;
        }

        if (n == rev || n == rev / 10) {
            return true;
        } else {
            return false;
        }
    }

    public static void thirdExercise() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        boolean isPalindrome = false;

        while (isPalindrome != true) {
            if (isNumberAPalindrome(n) == true) {
                isPalindrome = true;
            } else {
                if (n % 100 > 50) {
                    n++;
                } else {
                    n--;
                }
            }
        }

        System.out.println(n);
    }

    public static void fourthExercise() {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        int key = 3;

        char[] arr = text.toCharArray();

        for(int i = 0; i < arr.length; i++){
            int charASCIICode = arr[i];

            if(charASCIICode == 122)
                charASCIICode = 96;
            if(charASCIICode == 90)
                charASCIICode = 64;

            charASCIICode += key;

            arr[i] = (char)charASCIICode;
        }

        text = String.valueOf(arr);

        System.out.println(text);
    }
}