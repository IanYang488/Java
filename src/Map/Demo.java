package Map;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();


        map.put("001", "IA");
        map.put("002", "Ian Yang");
        map.put("002", "IA");  // invalid

        //output
        System.out.println(map);
    }
}
