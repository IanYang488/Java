package Review;

import java.util.Scanner;

public class StringReview {
    public static void main(String[] args) {
        char[] chars = {1, 2, 3};
        String str = charAppend(chars);
        System.out.println(charReverse(chars) + charToString(chars));


    }

    public static String charToString(char[] arr) {
        return String.valueOf(arr);
    }

    public static String charAppend(char[] arr) {
        StringBuilder sb = new StringBuilder(charToString(arr));
        Scanner sc = new Scanner(System.in);
        return sb.append(sc.nextLine()).toString();
    }

    public static String charReverse(char[] arr) {
        return new StringBuilder(arr.toString()).reverse().toString();
    }
}
