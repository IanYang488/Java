package HashSet02;

import java.util.HashSet;

public class Demo {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<Student>();

        Student s1 = new Student("Ian Yang", 20);
        Student s2 = new Student("IA", 20);

        students.add(s1);
        students.add(s2);

        //now enumerate it with enhanced for
        for (Student s : students) {
            System.out.println(s.getName() + ", " + s.getAge());
        }

    }
}
