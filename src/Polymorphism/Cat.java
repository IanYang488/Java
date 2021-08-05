package Polymorphism;

public class Cat extends Animal {

    public int age = 2;
    public int weight = 20;

    @Override
    public void eat() {
        System.out.println("Cat eats fish");
    }

    public void playGame() {
        System.out.println("Cat playing games");
    }

}
