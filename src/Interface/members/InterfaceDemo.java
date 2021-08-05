package Interface.members;

/*
Testing class
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        Inter inter = new InterImpl();  // Polymorphism
        System.out.println(inter.num);
//        inter.num2 = 20; Warning final variable
        System.out.println(inter.num2);
        System.out.println(Inter.num); // call the interface directly

    }
}
