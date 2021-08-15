package Map.iteration;
// Traversal

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        // create object
        Map<String, String> map = new HashMap<String, String>();

        // adding elements
        map.put("Ian Yang", "20");
        map.put("IA", "20");
        map.put("Boo", "Foo");

        // get all key sets
        Set<String> keySet = map.keySet();

        //Traversal with enhanced for. find value by a key
        for (String key : keySet) {
            String temp = map.get(key);
            System.out.println(key + ", " + temp);
        }

    }
}
