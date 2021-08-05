package Collection;

import java.util.ArrayList;
import java.util.Collection;

/* create a collection set should be realized by polymorphism with ArrayList()
    ALt + 7: shortcut to open a window show the structure of a class
 */
public class CollectionDemo01 {
    public static void main(String[] args) {
        // create the object of Collection
        Collection<String> collection = new ArrayList<String>();
        // ArrayList() override the toString() method
        collection.add("Ian Yang");
        collection.add("Hello");
        System.out.println(collection);
        System.out.println(collection.isEmpty());
        System.out.println(collection.size());


    }
}
