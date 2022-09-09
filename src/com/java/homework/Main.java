package com.java.homework;

public class Main {
    public static void main(String[] args) {
        firstExercise();
    }

    public static void firstExercise(){
        for(int i = 10; i < 100; i++) {
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}