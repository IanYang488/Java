package InheritanceWithSuper;

public class Son extends Father {
    public int age = 20;

    public void show() {
        int age = 30;
        System.out.println(age);  //local
        System.out.println(this.age);  //son class
        System.out.println(super.age);  //father class
    }
}
