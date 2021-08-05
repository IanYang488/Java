package List;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            arrayList.add(Math.random());
        }
        for (int j = 0; j < 10; j++) {
            System.out.println(arrayList.get(j));
        }
        System.out.println(arrayList.size());

    }
}
