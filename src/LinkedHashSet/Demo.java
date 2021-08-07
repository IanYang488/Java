package LinkedHashSet;

import java.util.LinkedHashSet;

public class Demo {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Hello");
        linkedHashSet.add("World");

//        linkedHashSet.add("World"); noduplicate

        for (String s : linkedHashSet) {
            System.out.println(s);

        }
    }
}
