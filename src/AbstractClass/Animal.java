package AbstractClass;

//public class Animal {

//    public void eat() {
//        System.out.println("Eat");
//
//    }
//  Such a class should specify the particular eat way, not a good choice
//  To avoid, these method should be defined as abstract class and covered by an abstract class as follows
//}

public abstract class Animal {
    public abstract void eat();
    // abstract methods do not have parameters

    // abstract class can contain non-abstract method, as follows
    // also, an abstract class can has none of the abstract methods
    public void sleep() {
        System.out.println("Sleeping");

    }
}