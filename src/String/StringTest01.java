package String;


import java.util.Scanner;

public class StringTest01 {
    public static void main(String[] args) {
        String username = "IA";
        String password = "0621";

        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Username");
            String name = sc.nextLine();

            System.out.println("Password");
            String pwd = sc.nextLine();

            if (name.equals(username) && pwd.equals(password)) {
                System.out.println("Login in succeeded");
                break;
            } else {
                if ((2 - i) == 0) {
                    System.out.println("Account locked, please contact Administer");
                } else {
                    System.out.println("Login failed, " + (2 - i) + "changes left");
                }
            }
        }
    }
}

