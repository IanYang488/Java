package FunctionalInterface.CommonFunctionalInterface.Function;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        String s = "IAN YANG,30";

        convert(s,
                s1 -> s1.split(",")[1],
                s1 -> Integer.parseInt(s1),
//                Integer::parseInt,
                integer -> integer + 90);
    }

    private static void convert(String s, Function<String, String> function1,
                                Function<String, Integer> function2,
                                Function<Integer, Integer> function3) {
        System.out.println(function1.andThen(function2).andThen(function3).apply(s));

    }
}
