package Polymorphism;

// inheritance or realization
// method override
// father class citation directs to son class
public class AnimalDemo {
    public static void main(String[] args) {
        Animal animal = new Cat();

        System.out.println(animal.age);
//        System.out.println(animal.weight); Wrong code here
//        member access in polymorphism: refer to the father class

        animal.eat();
//        animal.playgame(): Same problem here
//        member element: decode & execution refer to the left
//        member method: decode  refers to the left, execution refers to the right (difference because
//        of the override

    }
}
