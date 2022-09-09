package com.java.homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("First exercise");
        firstExercise();

        System.out.println("Second exercise");
        secondExercise();
    }

    public static void firstExercise(){
        for(int i = 10; i < 100; i++) {
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void secondExercise(){
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int wordLength = word.length();

        boolean isPalindrome = true;

        for(int i = 0; i < wordLength; i++){
            if(word.charAt(i) != word.charAt(wordLength - i - 1)){
                isPalindrome = false;
            }
        }

        if(isPalindrome) {
            System.out.println("Word is palindrome :)");
        } else {
            System.out.println("Word isn't palindrome :(");
        }
    }

    public static void thirdExercise(){

    }
}