package Basic;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        //Create object
        Scanner sc = new Scanner(System.in);

        //Receive data
        int x = sc.nextInt();

        //Output data
        System.out.println("x: " + x);

    }
}
