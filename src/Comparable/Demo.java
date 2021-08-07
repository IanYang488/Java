package Comparable;

import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();
        Student s1 = new Student(20, "IA");
        Student s2 = new Student(20, "Ian Yang");

        students.add(s1);
        students.add(s2);

        for (Student currStudent : students) {
            System.out.println(currStudent.getName() + ", " + currStudent.getAge());
        }
    }
}
