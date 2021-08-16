package FunctionalInterface.CommonFunctionalInterface.Predicate;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        boolean b = checkString("Hello", s -> s.length() > 8);
        System.out.println(b);

        boolean b2 = checkString("Hello, World", s -> s.length() > 8);
        System.out.println(b2);

        boolean b3 = checkString("Hello", s -> s.length() > 8, s -> s.length() < 15);
        System.out.println(b3);

        boolean b4 = checkString("Hello, World", s -> s.length() > 8, s -> s.length() < 15);
        System.out.println(b4);
    }

    private static boolean checkString(String s, Predicate<String> predicate) {
//        return predicate.test(s);
//        return !predicate.test(s);
        return predicate.negate().test(s);
    }

    // Another method
    private static boolean checkString(String s,
                                       Predicate<String> predicate1,
                                       Predicate<String> predicate2) {
//        boolean b1 = predicate1.test(s);
//        boolean b2 = predicate2.test(s);
//        return b1 && b2;
        return predicate1.or(predicate2).test(s);
    }
}
