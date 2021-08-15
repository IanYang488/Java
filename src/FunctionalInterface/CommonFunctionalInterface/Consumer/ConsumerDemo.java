package FunctionalInterface.CommonFunctionalInterface.Consumer;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {

//        operatorString("Ian Yang", s -> System.out.println(s));
//        operatorString("Ian Yang", System.out::println);  // Java 8 method reference
//
//        // if you want to reverse the accepted string
//        operatorString("Jack Yang", s -> System.out.println(new StringBuilder(s).reverse().toString()));

        operatorString("Ian Yang", x -> System.out.println(x),
                x -> System.out.println(new StringBuilder(x).reverse().toString()));
    }

    // define a method that consume a String as data
    private static void operatorString(String name, Consumer<String> consumer1, Consumer<String> consumer2) {
//        consumer1.accept(name);
//        consumer2.accept(name);   same as
        consumer1.andThen(consumer2).accept(name);
    }
}