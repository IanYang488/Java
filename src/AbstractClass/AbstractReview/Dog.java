package AbstractClass.AbstractReview;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog eats bones");
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }


}
