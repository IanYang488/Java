package com.test;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {  // shortcut: psvm
        Random r = new Random();
        int num = r.nextInt(100) + 1;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Type down the number: ");  // shortcut: sout
            int guessNum = sc.nextInt();

            if (guessNum > num) {
                System.out.println("Smaller");
            } else if (guessNum < num) {
                System.out.println("Larger");
            } else {
                System.out.println("Bingo");
                break;
            }
        }
    }
}
