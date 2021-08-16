package AbstractClass.AbstractClassMember;

public abstract class Animal {
    private int age = 20;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private final String city = "Shanghai";

    public void show() {
        age = 30;
//        city = "Beijing";  it's a final (constant) variable
        System.out.println(age + city);

    }

    public abstract void eat(); // this abstract method confines the son class to do something as your

    // wish, a member method in an abstract class can be either abstract or not
    public Animal() {
    } // non-parameter construction method for Son class hir and initialization

    public Animal(int age) {
        this.age = age;
    }


}
