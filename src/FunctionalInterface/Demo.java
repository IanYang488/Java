package FunctionalInterface;

public class Demo {
    public static void main(String[] args) {
        MyInterface myInterface = () -> System.out.println("Functional interface");
        myInterface.show();
    }
}
