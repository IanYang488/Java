package Comparable;

public class Student implements Comparable<Student> {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student() {
    }

    @Override
    public int compareTo(Student s) {
//        return 0;
//        return 1;
//        return -1;
//        return this.age - s.age;  // the best, but this method only compared the age
        int num = this.age - s.age;
        return num == 0 ? this.name.compareTo(s.name) : num;
    }
}
