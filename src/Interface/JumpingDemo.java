package Interface;

/*
Testing class
 */
public class JumpingDemo {
    public static void main(String[] args) {
        Jumping jumping = new Cat();  // polymorphism here, also the jumping() interface is abstract
        jumping.jump();
    }
}
