package Stream;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectDemo {
    public static void main(String[] args) {
        // 1
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");

        Stream<String> stringStream = list.stream().filter(s -> s.length() == 3);
        List<String> collectNames = stringStream.collect(Collectors.toList());
        for (String name : collectNames) {
            System.out.println(name);
        }

        // 2
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(30);
        set.add(343);
        set.add(32);
        set.add(35);

        Stream<Integer> setStream = set.stream().filter(age -> age > 31);
        Set<Integer> collectAge = setStream.collect(Collectors.toSet());
        for (int /* or Integer */ age : collectAge) {
            System.out.println(age);
        }

        // 3
        String[] strArray = {"Ian Yang,20", "Jack Yang, 20", "Ben Yang, 50"};
        Stream<String> arrayStream = Stream.of(strArray).filter(s -> Integer.parseInt(s.split(",")[1]) > 20);

        Map<String, Integer> collectMap =
                arrayStream.collect(Collectors.toMap(key -> key.split(",")[0],
                        value -> Integer.parseInt(value.split(", ")[1])));
    }


}
