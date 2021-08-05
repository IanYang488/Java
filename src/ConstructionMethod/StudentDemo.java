package ConstructionMethod;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.show();

        Student s2 = new Student();
        s2.show();

        Student s3 = new Student("Ian Yang", 20);
        s3.show();

    }
}
