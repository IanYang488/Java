package FunctionalInterface.CommonFunctionalInterface.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        String[] strArray = {"Ian Yang, 20", "Jack Yang, 20", "Ben Yang, 50"};

        ArrayList<String> array = myFilter(strArray, s -> s.split(", ")[0].length() > 2,
                s -> Integer.parseInt(s.split(",")[1]) > 33); // Integer.parseInt change string to Integer
        System.out.println(array);
    }

    private static ArrayList<String> myFilter(String[] strings, Predicate<String> predicate1,
                                              Predicate<String> predicate2) {
        // define a set
        ArrayList<String> arrayList = new ArrayList<>();

        // iterator
        for (String str : strings) {
            if (predicate1.and(predicate2).test(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
