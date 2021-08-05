package List;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Java");

        System.out.println(arrayList.remove("World")); // return boolean


        System.out.println(arrayList.remove(1));  // return element being deleted, also this index should
        // inside the range

        System.out.println(arrayList.set(1, "hello"));  // range notice

        System.out.println(arrayList.get(1)); // return the element at the index


        System.out.println(arrayList.size());

    }


}
