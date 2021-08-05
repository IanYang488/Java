package Interface.Review;

public class Cat extends Animal implements Jumping {
    @Override
    public void eat() {
        System.out.println(getName() + " eats fish");
    }

    public void jump() {
        System.out.println(getName() + " jumps high");
    }

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }
}
