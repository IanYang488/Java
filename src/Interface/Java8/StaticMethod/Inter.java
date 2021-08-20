package Interface.Java8.StaticMethod;

public interface Inter {
    void show();

    default void method() {
        System.out.println("Default method");
    }

    static void test() {  // static method inside an interface could only be called by itself
        System.out.println("Static method");
    }


}
