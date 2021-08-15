package FunctionalInterface.CommonFunctionalInterface.Supplier;

import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 32, 21, 5, 98, 523, 23, 546};
        int max = getMax(() -> {
            int currMax = arr[0];
            for (int i = 1; i <arr.length; i++) {
                if (arr[i] > currMax) {
                    currMax = arr[i];
                }
            } return currMax;
        });

        System.out.println(max);
    }

    public static int getMax(Supplier<Integer> supplier) {
        return supplier.get();
    }
}
