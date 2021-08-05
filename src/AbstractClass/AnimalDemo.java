package AbstractClass;

public class AnimalDemo {
    public static void main(String[] args) {
//        Animal animal = new Animal();
//        animal.eat();
//        now the class is defined as abstdract


//        how an abstract class creates an object, show as follows
        Animal animal = new Cat(); // Polymorphism
        animal.eat();
        animal.sleep();
    }
}
