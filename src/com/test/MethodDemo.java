package com.test;

public class MethodDemo {
    public static void main(String[] args) {
        isEvenNumber();     // method calling


    }

    public static void isEvenNumber() { // method definition
        int number = 10;
        if (number % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
