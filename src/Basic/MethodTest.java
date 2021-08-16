package Basic;

import java.util.Scanner;

public class MethodTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(LargerOfTwo(x, y));
    }


    public static int LargerOfTwo(int x, int y) {
        return x > y ? x : y;
    }
}

