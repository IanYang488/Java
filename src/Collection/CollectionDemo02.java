package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<String>();

        // boolean add(E e)
        System.out.println(collection.add("Hello"));

        System.out.println(collection);

    }
}
