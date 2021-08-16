package Stream.Intermediate;

import java.util.ArrayList;
import java.util.List;

public class StreamMapDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");

        list.stream().map((s -> Integer.parseInt(s)));

        //mapToInt(ToIntFunction mapper)
        list.stream().map(Integer::parseInt).forEach(System.out::println);


        //int sum()
        int sum = list.stream().mapToInt(Integer::parseInt).sum();
        System.out.println(sum);


    }
}
