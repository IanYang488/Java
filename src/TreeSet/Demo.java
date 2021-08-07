package TreeSet;

import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        TreeSet<Integer> treeSet2 = new TreeSet<Integer>(); // Construction without an parameter

        treeSet2.add(10);
        treeSet2.add(50);
        treeSet2.add(30);
        treeSet2.add(40);
        // the TreeSet follows natural ordering

        treeSet2.add(30); // noduplicate

        for (Integer integer : treeSet2) {
            System.out.println(integer);  // natural ordering
        }
    }
}
