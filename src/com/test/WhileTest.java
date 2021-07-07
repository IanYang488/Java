package com.test;

public class WhileTest {
    public static void main(String[] args) {
        double paper = 0.1;
        double him = 8844430;
        int cnt = 0;
        while (paper <= him) {
            paper *= 2;
            cnt++;
        }
        System.out.println(cnt);
    }
}
