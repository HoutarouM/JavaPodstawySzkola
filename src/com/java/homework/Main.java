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

//        System.out.println("Fourth exercise");
//        fourthExercise();

//        System.out.println("Fifth exercise");
//        fifthExercise();

//        System.out.println("Sixth exercise");
//        sixthExercise();

        System.out.println("Seventh exercise");
        seventhExercise();
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

        for (int i = 0; i < arr.length; i++) {
            int charASCIICode = arr[i];

            if (charASCIICode == 122) charASCIICode = 96;
            if (charASCIICode == 90) charASCIICode = 64;

            charASCIICode += key;

            arr[i] = (char) charASCIICode;
        }

        text = String.valueOf(arr);

        System.out.println(text);
    }

    public static void fifthExercise() {
        Scanner input = new Scanner(System.in);

        String firstWord = input.nextLine();
        String secondWord = input.nextLine();

        if (firstWord.length() != secondWord.length()) {
            System.out.println("Not anagrams");

            return;
        }

        char[] firstStringArrChar = firstWord.toCharArray();
        char[] secondStringArrChar = secondWord.toCharArray();

        //      sum ascii codes
//      words with the same length must and symbols must have same ascii codes sum
        int firstStringAsciiSum = 0;
        int secondStringAsciiSum = 0;

        for (int i = 0; i < firstStringArrChar.length; i++) {
            firstStringAsciiSum += (int) firstStringArrChar[i];
            secondStringAsciiSum += (int) secondStringArrChar[i];
        }

        if (firstStringAsciiSum != secondStringAsciiSum) {
            System.out.println("Not anagrams");

            return;
        }

        System.out.println("Anagrams");
    }

    public static void sixthExercise() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int sum = 0;

        int singleN;

        int factorial;

        while (n > 0) {
            factorial = 1;

            singleN = n % 10;

            for (int j = 1; j <= singleN; j++) {
                factorial = factorial * j;
            }

            sum += factorial;

            n /= 10;
        }

        System.out.println(sum);
    }

    public static void seventhExercise() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && (i != 1 && i != n)) {
                System.out.println("Not first number");

                return;
            }
        }

        System.out.println("First number");
    }
}