package AbstractClass.AbstractClassMember;

public class AnimalDemo {
    public static void main(String[] args) {
        // Notice: the Animal class is abstract, polymorphism is needed, or override all the abstract member
        // method should be override
        Animal animal = new Cat();
        animal.eat();
        animal.show();
    }
}
