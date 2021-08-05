package Review.OOPreview;

public class Cat extends Animal implements Reproduce {
    @Override
    public void eat() {
        System.out.println("Cat eats fish");
    }

    @Override
    public void reproducing(Animal animal1, Animal animal2) {
        if ((animal1.getAnimal().equals(animal2.getAnimal())) && (!animal1.getGender().equals(animal1.getGender()))) {
            System.out.println("Baby kittens are coming");
        }
    }
}
