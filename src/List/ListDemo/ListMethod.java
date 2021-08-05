package List.ListDemo;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("World");

        list.add(1, "one");
        list.remove("one");
        list.set(2, "two");

    }
}
