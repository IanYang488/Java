package Map.Review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapIncludeArrayListDemo {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hashMap = new HashMap<>();
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("IA");
        arrayList1.add("IB");
        hashMap.put("1", arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList1.add("IC");
        arrayList1.add("ID");
        hashMap.put("2", arrayList2);

        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList1.add("IE");
        arrayList1.add("IF");
        hashMap.put("3", arrayList3);

        Set<String> keySet = hashMap.keySet();
        for (String key : keySet) {
            System.out.println(key);
            ArrayList<String> val = hashMap.get(key);
            for (String s : val) {
                System.out.println(s);
            }
        }
    }
}
