package com.test;

public class DoWhileDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello, World!"); //Using for loo
        }
        System.out.println("----------");
        int cnt = 1;
        do {System.out.println("Hello, World!");
            cnt++;
        } while (cnt<= 5);
    }
}

// for loop has a local count variable belongs to the loop, while while loop's cnt variable has a global cnt.