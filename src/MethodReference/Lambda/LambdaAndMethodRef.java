package MethodReference.Lambda;

public class LambdaAndMethodRef {
    /*
    class
    instance of object
    instance of class
    constructor
     */

    public static void main(String[] args) {
        // class ref: class::static method e.g. Integer::parseInt
        useConverter(Integer::parseInt);
        // all parameters of an lambda expression would be sent as virtual parameter to a static method


    }

    private static void useConverter(Converter converter) {
        int number = converter.convert("666");
        System.out.println(number);
    }
}
