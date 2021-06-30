package com.test;
import java.util.Scanner;
public class IfTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Grades: ");
        int score = sc.nextInt();
        if (score > 100 || score < 0) {
            System.out.println("Wrong grade");
        } else if (score >= 95 && score <= 100) {
            System.out.println("EXCELLENT");
        } else if (score >= 90 && score <= 94) {
            System.out.println("GOOD JOB");
        } else if (score >= 80 && score <= 89) {
            System.out.println("FAIR");
        } else {
            System.out.println("UNQUALIFIED");
        }
    }
}
