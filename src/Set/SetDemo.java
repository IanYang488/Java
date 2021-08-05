package Set;

import java.util.HashSet;
import java.util.Set;

// hashSet: It makes no guarantees as to the iteration order of the set; in particular, it does not guarantee
// that the order will remain constant over time. This class permits the null element.

public class SetDemo {
    // non-repeat element
    // no method with an index, thus for loop is not capable for iteration
    public static void main(String[] args) {
        Set<String> strings = new HashSet<String>();

        strings.add("Hello");
        strings.add("Ian");
        strings.add("Yang");
        // non-repeat element
        // strings.add("Yang");

        // For set iteration, enhanced for and iterator are capable, following is an example of enhanced for
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
