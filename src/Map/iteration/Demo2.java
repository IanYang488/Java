package Map.iteration;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// Traversal
public class Demo2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        // adding elements
        map.put("Ian Yang", "20");
        map.put("IA", "20");
        map.put("Boo", "Foo");

        // Traversal with Set<Map, Entry<K, V>> entrySet(); get all key pair objects
        // then loop every key pair objects with enhanced for

        // get all entry sets
        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        // enhanced for
        for (Map.Entry<String, String> entry : entrySet) {
            String tempKey = entry.getKey();
            String tempVal = entry.getValue();
            System.out.println(tempKey + ", " + tempVal);
        }
    }
}
