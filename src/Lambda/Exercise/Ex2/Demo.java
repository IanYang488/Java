package Lambda.Exercise.Ex2;

public class Demo {
    public static void main(String[] args) {
        // anonymous inner class
        useflyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s);
                System.out.println("with airbus");
            }
        });

        // lambda function
        useflyable((s) -> {
            System.out.println(s);
            System.out.println("with car ");
        });
    }

    private static void useflyable(Flyable f) {
        f.fly("flying");

    }
}
