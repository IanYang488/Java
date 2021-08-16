package MethodReference;

public class MethodRefDemo {
    public static void main(String[] args) {
        usePrintable(System.out::println);
    }

    private static void usePrintable(Printable p) {
        p.printInt(555);
    }
}
