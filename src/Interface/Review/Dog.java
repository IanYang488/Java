package Interface.Review;

public class Dog extends Animal implements Jumping {
    @Override
    public void eat() {
        System.out.println(getName() + " eats bone");
    }

    @Override
    public void jump() {
        System.out.println(getName() + " jumps high");
    }

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }
}
