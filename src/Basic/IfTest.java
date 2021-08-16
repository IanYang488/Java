package Basic;
import java.util.Scanner;
public class IfTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("An integer: "); //Create an object
        int num = sc.nextInt(); //Receive data

        if (num%2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
}
