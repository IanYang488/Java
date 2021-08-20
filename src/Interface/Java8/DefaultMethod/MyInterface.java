package Interface.Java8.DefaultMethod;

public interface MyInterface {
    void show();

    void show2();

    //    void show3();  //Error
    /*public*/
    default void show3() {
        System.out.println("show3() is an interface upgrade by JAVA 8 new feature");
    }
}
