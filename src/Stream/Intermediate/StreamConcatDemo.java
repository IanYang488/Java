package Stream.Intermediate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamConcatDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");

        Stream<String> limit = list.stream().limit(4);
        Stream<String> skip = list.stream().skip(2);
        Stream.concat(limit, skip).forEach(System.out::println);
        Stream.concat(limit, skip).distinct().forEach(s -> System.out.println(s));

    }
}
