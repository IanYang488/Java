package Review.OOPreview;

public class Demo {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Animal cat1 = new Cat();
        Cat cat2 = new Cat();
        Dog dog2 = new Dog();

        dog1.setGender("Male");
        dog1.setGender("Female");

        dog2.reproducing(dog1, dog1);
    }
}
