package Stream.Teraminate;

import java.util.ArrayList;
import java.util.List;

public class StreamForEachDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");

        list.stream().forEach(System.out::println);

        long count = list.stream().filter(s -> s.startsWith("a")).count();
        System.out.println(count);
    }
}
