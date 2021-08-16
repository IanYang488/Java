package FunctionalInterface.CommonFunctionalInterface.Function;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        convertToString("100", s -> Integer.parseInt(s));
//        convertToString("100",Integer::parseInt);  // by method reference
        convertToString(100, i -> String.valueOf(i + 666));
        convertToString("100", s -> Integer.parseInt(s), i -> String.valueOf(i + 666));

    }

    private static void convertToString(String s, Function<String, Integer> function) {
//        int i = function.apply(s);
        Integer i = function.apply(s);
        System.out.println(i);
    }

    private static void convertToString(int i, Function<Integer, String> function) {
        String s = function.apply(i);
        System.out.println(s);
    }

    private static void convertToString(String s, Function<String, Integer> function1,
                                        Function<Integer, String> function2) {
//        Integer i = function1.apply(s);
//        String str  = function2.apply(i);
//        System.out.println(s);
//        better method:
        String ss = function1.andThen(function2).apply(s);
    }
}
