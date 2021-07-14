package String;

import java.util.Scanner;

public class StringTest03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("String :");
        String s = sc.nextLine();

        int capitialCount = 0;
        int smallCount = 0;
        int numCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                capitialCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            } else if (ch >= '0' && ch <= '9') {
                numCount++;
            }
        }
        System.out.println("Capital letter: " + capitialCount + ", Small letter: " + smallCount +
                ", numbers: " + numCount);
    }
}
