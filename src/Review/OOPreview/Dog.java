package Review.OOPreview;

public class Dog extends Animal implements Reproduce {
    @Override
    public void eat() {
        System.out.println("Dog eats bones");
    }

    @Override
    public void reproducing(Animal dog1, Animal dog2) {
        if ((dog1.getAnimal().equals(dog2.getAnimal())) && (!dog1.getGender().equals(dog2.getGender()))) {
            System.out.println("Baby puppies are coming");

        }
    }
}
