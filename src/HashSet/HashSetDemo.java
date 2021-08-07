package HashSet;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("Hello");
        strings.add("Java");
        //  It makes no guarantees as to the iteration order of the set;
        for (String s : strings) { // this String s: strings is an enhanced for loop
            System.out.println(s);
        }
    }
}
