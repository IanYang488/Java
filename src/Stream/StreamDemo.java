package Stream;


import java.util.ArrayList;

// filter with Stream flow
public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("IAN YANG");
        arrayList.add("JACK YANG");
        arrayList.add("BEN YANG");

        ArrayList<String> BenList = new ArrayList<String>();
        for (String s : arrayList) {
            if (s.startsWith("BEN")) {
                BenList.add(s);
            }
        }
        ArrayList<String> eightList = new ArrayList<>();

        for (String s : arrayList) {
            if (s.length() == 8) {
                eightList.add(s);
            }
        }
        for (String s : eightList) {
            System.out.println(s);
        }
        System.out.println("---------");
        arrayList.stream().filter(s -> s.startsWith("BEN")).
                filter(s -> s.length() == 3).forEach(s -> System.out.println(s));
//                arrayList.stream().filter(s -> s.startsWith("BEN")).
//                filter(s -> s.length() == 3).forEach(System::println);
    }
}
