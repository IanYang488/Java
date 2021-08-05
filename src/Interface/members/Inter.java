package Interface.members;

public interface Inter {
    public int num = 10;
    public final int num2 = 20;
    public static final int num3 = 30; // same as: int num3 = 30, one word further: variables
//    in interfaces are statics and final variable
//    public Inter() {} Warning: No construction method in an interface

//    public void show() {}  Warning: no non-abstract method inside an interface

    public abstract void method();

    void show(); // methods inside an interface has default decoration of: public abstract

}
