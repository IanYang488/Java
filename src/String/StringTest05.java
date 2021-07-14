package String;

import java.util.Scanner;

public class StringTest05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(strReverse(line));

    }

    public static String strReverse(String s) {
        String ss = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            ss += s.charAt(i);

        }
        return ss;
    }
}
