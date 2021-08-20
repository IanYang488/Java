package Interface.Java8.PrivateMethod;

public interface Inter {
    default void show1() {
        System.out.println("show1");
        show();
    }

    default void show2() {
        System.out.println("show2");
        show();
    }

    private void show() {
        System.out.println("private method called");
    }

    static void method() {
    }

    static void method2() {
    }

}
