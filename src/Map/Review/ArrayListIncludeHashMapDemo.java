package Map.Review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ArrayListIncludeHashMapDemo {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> hashMapArrayList = new ArrayList<>();
        HashMap<String, String> hashMap1 = new HashMap<>();
        hashMap1.put("IA", "IB");
        hashMap1.put("IC", "ID");

        // add HashMpa to ArrayList as elements
        hashMapArrayList.add(hashMap1);

        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap1.put("IA", "IB");
        hashMap1.put("IC", "ID");

        // add HashMpa to ArrayList as elements
        hashMapArrayList.add(hashMap2);

        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap1.put("IA", "IB");
        hashMap1.put("IC", "ID");

        // add HashMpa to ArrayList as elements
        hashMapArrayList.add(hashMap3);

        // Traversal
        for (HashMap<String, String> hashMap : hashMapArrayList) {
            Set<String> keySet = hashMap.keySet();
            for (String key : keySet) {
                System.out.println(key + ", " + hashMap.get(key));
            }

        }
    }
}
