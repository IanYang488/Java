package Stream.Intermediate;

import java.util.ArrayList;
import java.util.List;

public class StreamLimitDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");

        list.stream().limit(3).forEach(s -> System.out.println(s));

        list.stream().skip(3).forEach(s -> System.out.println(s));

        list.stream().skip(2).limit(3).forEach(System.out::println);


    }
}
