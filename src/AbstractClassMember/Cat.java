package AbstractClassMember;

public class Cat extends Animal {  // or set the entire class to be abstract
    @Override
    public void eat() {
        System.out.println("Cat eats fish");
    }
}
