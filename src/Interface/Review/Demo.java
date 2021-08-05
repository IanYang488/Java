package Interface.Review;

public class Demo {
    public static void main(String[] args) {
        Jumping catJump = new Cat("Tom", 3);
        Jumping dogJump = new Dog("Wangcai", 2);

        Animal Tom = new Cat("Tom", 3);
        Animal Wangcai = new Dog("Wangcai", 2);

        catJump.jump();
        dogJump.jump();

        Tom.eat();
        Wangcai.eat();

        //To mix
        Cat Tom2 = new Cat("Tom2", 3);
        Tom2.eat();
        Tom2.jump();
//        Typically, we prefer realize the son class directly when using it
    }
}
