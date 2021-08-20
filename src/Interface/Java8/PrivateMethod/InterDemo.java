package Interface.Java8.PrivateMethod;

public class InterDemo {
    public static void main(String[] args) {
        Inter i = new InterImpl();
        i.show1();
        System.out.println("--------");
        i.show2();

        Inter.method(); // static method should be called directly by the interface
        Inter.method2();
    }


}
