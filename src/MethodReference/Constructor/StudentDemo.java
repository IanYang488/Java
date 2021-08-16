package MethodReference.Constructor;

public class StudentDemo {
    public static void main(String[] args) {
        useStudentBuilder((name, age) -> new Student(name, age));
        useStudentBuilder(Student::new);
        // all parameter would be sent to the constructor as virtual parameter
    }

    private static void useStudentBuilder(StudentBuilder studentBuilder) {
        Student student = studentBuilder.build("Ian Yang", 20);
        System.out.println(student.getName() + ", " + student.getAge());
    }
}
