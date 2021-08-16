package Stream.Generate;

import java.util.*;
import java.util.stream.Stream;

public class StreamGenerateDemo {
    public static void main(String[] args) {
        // Collection can generate stream flow with default method stream()
        List<String> list = new ArrayList<>();
        Stream<String> listStream = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> setStream = set.stream();

        // Map can generate stream flow indirectly
        Map<String, Integer> map = new HashMap<>();
        Stream<String> keyStream = map.keySet().stream();
        Stream<Integer> valueStream = map.values().stream();
        Stream<Map.Entry<String, Integer>> entryStream = map.entrySet().stream();

        // array could generate stream flow with static method of (T... values)
        String[] strArray = {"a", "b", "C"};
        Stream<String> strArrayStream = Stream.of(strArray);
        Stream<String> strArrayStream2 = Stream.of("Hello", "world", "java");
        Stream<Integer> integerStream = Stream.of(10, 20, 30);
    }

}

