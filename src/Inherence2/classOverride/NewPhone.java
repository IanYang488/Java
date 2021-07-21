package Inherence2.classOverride;

public class NewPhone extends Phone {
    @Override  // when override a class,the  access capacity should not smaller than its Father class
    public void call(String name) {
        System.out.println("Start streaming");
//        System.out.println("Call" + name);
        super.call(name);
    }
}
