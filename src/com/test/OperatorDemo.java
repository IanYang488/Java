package com.test;
import java.util.Scanner;

public class OperatorDemo {

    public static void main(String[] args) {
        //Define two variable
        int a = 6;
        int b = 4;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b); //int divided by an int generate an int, if you want a decimal, a float is n
        //needed
        System.out.println(a % b);
        //String concatenation
        String c = "String";
        String d = " Concatenation";
        System.out.println(c + d);
        //Auto upgrade of data type follows the pattern: byte, short, char -> int -> long -> float -> double
        //Specially, byte, short, char are upgrade to int by convention.
        System.out.println("Ian Yang" + 666);
        System.out.println(1 + 199 + "Ian Yang"); // "+" operator operates from left to right.
        //In short, "+" is an string concatenation operator as long as there is one (or more) string in the
        //expression equation, otherwise, it's an arithmetic operator.

        //Following is the content of Assignment Operator
        int i = 10;
        i += 10; //Also -=, *=, /=, %= they all contain forced conversion
        System.out.println(i);

        //self add/minus
        int j = 10;
        j++; //same as ++j
        System.out.println(j);

        //Involved in operations
        int k = j++; //Waring: value of j is assigned to k first, then do j++
        k = ++j; //j++ first, then the value of j(after ++) is assigned to k

        //Following is the relationship operator
        System.out.println(i == j);
        System.out.println(i = j); // Assign value of j to i then output the value

        //Following is the logic operator
        System.out.println((i > j) & (i < i));
        System.out.println((i > j) ^ (i < i));
        System.out.println((i > j) | (i < i));
        System.out.println(!(i > j)) ;

        //Following is the short-circuit logic operator: &&, ||
        //For short-circuit, if false(&) or true(|), the right side will not operate.
        System.out.println((i > j) && (i < i));
        System.out.println((i > j) || (i < i));

        //Following is the triple operator, format: logic expression?expression1:expression2
        //e.g.: a>b?a:b; Do a>b, if true, return a, else return b
        int x = 10;
        int y = 20;
        int max = x > y ? x : y; // same as Math.max(x, y)]
        System.out.println("max: " + max);

        Scanner sc = new Scanner(System.in);
        System.out.println("One day: ");
        int week_day = sc.nextInt();
        if (week_day == 1) {
            System.out.println("Today is Monday.");
        } else if (week_day == 2) {

            System.out.println("Today is Tuesday.");
        } else if (week_day == 3) {
            System.out.println("Today is Wednesday.");
        } else if (week_day == 4) {
            System.out.println("Today is Thursday.");
        } else if (week_day == 5) {
            System.out.println("Today is Friday, wryyyyyyy~");
        } else if (week_day == 6) {
            System.out.println("Today is Saturday, have fun. ");
        } else if (week_day == 7) {
            System.out.println("Today is Sunday, one week is over!");
        } else {
            System.out.println("Nothing happened.");
        }




    }


}
