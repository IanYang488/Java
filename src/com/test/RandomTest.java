package com.test;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {

        Random r = new Random();
        int num = r.nextInt(100) + 1;
        while (true) {
            Scanner sc = new Scanner(System.in);

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
