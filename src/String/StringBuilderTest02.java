package String;

import java.util.Scanner;

public class StringBuilderTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("String");
        String s = sc.nextLine();
        System.out.println(reverse(s));
    }

    public static String reverse(String str) {

        //        StringBuilder sb = new StringBuilder(str);
        //        String ss = sb.reverse().toString();
        //        return ss;
        return new StringBuilder(str).reverse().toString(); // chain style

    }
}

