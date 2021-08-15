package FunctionalInterface.returnValue;

import com.sun.management.GarbageCollectionNotificationInfo;

import java.util.*;

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("aaaa");
        array.add("bbb");
        array.add("cc");

        System.out.println("Before " + array);
//        Collections.sort(array);
        Collections.sort(array, getComparator());
        System.out.println("After " + array);
    }

    private static Comparator<String> getComparator() {
//        // anonymous inner class
//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();

        // lambda
        return (o1, o2) -> o1.length() - o2.length();
    }
};

