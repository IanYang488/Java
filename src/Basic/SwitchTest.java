package Basic;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch (month) {
            case 1:
            case 12:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Winter");
                break;
            case 3:
                System.out.println("Spring"); //Same case can be merged
                break;
            case 4:
                System.out.println("Spring");
                break;
            case 5:
                System.out.println("Spring");
                break;
            case 6: //Omitted code is an execution of "case penetration"
            case 7:
            case 8:
                System.out.println("Summer");
                break; //If a break is missed, we call it "case penetration"
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Wrong month");

//         switch (month) {
//             case 1, 2, 12 -> System.out.println("Winter");
//             case 3, 4, 5 -> System.out.println("Spring"); //Same case can be merged
//             case 6, 7, 8 -> System.out.println("Summer");
//             case 9, 10, 11 -> System.out.println("Fall");
//             default -> System.out.println("Wrong month");
//     These are enhanced switch
        }

    }
}
