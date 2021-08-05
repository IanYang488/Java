package Collection.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        Collection<Student> students = new ArrayList<>();

        Student s1 = new Student("Ian Yang", 20);
        Student s2 = new Student("IA", 20);

        students.add(s1);
        students.add(s2);

        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student tempStudent = iterator.next();
            System.out.println(tempStudent.getAge() + ", " + tempStudent.getName());
        }
    }

}
