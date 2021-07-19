package ConstructionMethod;


// this construction creates and initialize the class
public class Student {
    private String name;
    private int age;


    // now starts the construction method
    public Student() {
        System.out.println("Construction method without parameter");
    } // if this construction is missing, the IDEA will generate a same method instead


    public void show() {
        System.out.println(name + "," + age);

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;

    }
}
