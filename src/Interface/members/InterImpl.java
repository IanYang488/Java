package Interface.members;

public class InterImpl implements Inter {

    // same as: public class InterImpl extends Object implements Inter {
    public InterImpl() {
        super(); // means using construction method from the Object class


    }

    @Override
    public void show() {
        System.out.println("show method override");
    }

    @Override
    public void method() {
        System.out.println("method being called");

    }
}
