package FunctionalInterface.CommonFunctionalInterface.Supplier;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
//        String s = getString(() -> {
//            return "Ian Yang";
//        });
        String s = getString(() -> "Ian Yang");
        System.out.println(s);

        Integer integer = getInteger(() -> 20);
        System.out.println(integer);
    }
    private static String getString(Supplier<String> supplier) {
        return supplier.get();
    }

    private static Integer getInteger(Supplier<Integer> supplier) {
        return  supplier.get();
    }
}

