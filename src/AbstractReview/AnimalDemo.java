package AbstractReview;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal dog = new Dog("DOG", 20);
        Animal cat = new Cat("CAT", 20);
        cat.eat();
        dog.eat();
        System.out.println(cat.getName() + ", " + cat.getAge());
        System.out.println(dog.getName() + ", " + dog.getAge());

//        Omitted object construction without parameter
    }
}
