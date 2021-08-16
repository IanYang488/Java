package Basic;

public class FinalDemo {
    public static void main(String[] args) {
        // final attached to basic variable
        final int age = 20;
        System.out.println(age);
//        age = 100; // age after final becomes a constant
        System.out.println(age);
        // but if the variable is cited from another class, final Student s = new Student();
        // s = new Student();  // error here
        // tips: final decorates the address of s


    }
}
