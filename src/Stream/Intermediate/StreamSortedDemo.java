package Stream.Intermediate;

import java.util.ArrayList;
import java.util.List;

public class StreamSortedDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");

        list.stream().sorted().forEach(System.out::println);
//        list.stream().sorted((s1, s2) -> s1.length() - s2.length()).forEach(System.out::println);

        list.stream().sorted((s1, s2) -> {
            int num = s1.length() - s2.length();
            int num2 = num == 0 ? s1.compareTo(s2) : num;
            return num2;
        }).forEach(s -> System.out.println(s));
    }
}
