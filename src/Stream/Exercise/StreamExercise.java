package Stream.Exercise;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamExercise {
    public static void main(String[] args) {
        ArrayList<String> ManList = new ArrayList<>();
        ManList.add("a");
        ManList.add("b");
        ManList.add("c");
        ManList.add("d");
        ManList.add("e");
        ManList.add("f");
        ManList.add("g");

        ArrayList<String> WomanList = new ArrayList<>();
        WomanList.add("A");
        WomanList.add("B");
        WomanList.add("C");
        WomanList.add("D");
        WomanList.add("E");
        WomanList.add("F");
        WomanList.add("G");

        Stream<String> manLimit = ManList.stream().filter(s -> s.length() == 3).limit(3);

        Stream<String> womanSkip = WomanList.stream().filter(s -> s.startsWith("B")).skip(1);

        Stream<String> stream = Stream.concat(manLimit, womanSkip);

//        stream.map(s -> new Actor(s)).forEach(s -> System.out.println(s));
        stream.map(s -> new Actor(s)).forEach(s -> System.out.println(s.getName()));
    }
}
