package com.test;

public class ForForDemo {
    public static void main(String[] args) {
        System.out.println(0);
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println("----------break----------");
        System.out.println(4);
        System.out.println(4);
        System.out.println(4);
        System.out.println(4);
        System.out.println(4);
        System.out.println(4);
        System.out.println(4);
        System.out.println(4);
        for (int hr = 0; hr < 3; hr++) {
            for (int min = 0; min < 4; min++) {
                System.out.println(min + "min");
            }
            System.out.println("--------break-------- ");
        }
    }
}
