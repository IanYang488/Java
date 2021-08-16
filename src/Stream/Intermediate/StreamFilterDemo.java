package Stream.Intermediate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilterDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");

        Stream<String> stringStream = list.stream().filter(s -> s.startsWith("a"));
        stringStream.forEach(s -> System.out.println(s));
    }
}
