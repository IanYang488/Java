package List;

import java.util.ArrayList;

public class ArrayListTest02 {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<>();

        Student student1 = new Student("EDD", 20);
        Student student2 = new Student("ADD", 20);

        studentArrayList.add(student1);
        studentArrayList.add(student2);

        for (int i = 0; i < studentArrayList.size(); i++) {
            Student tempStudent = studentArrayList.get(i);
            System.out.println(tempStudent);
            System.out.println(tempStudent.getName() + ", " + tempStudent.getAge());
        }
    }
}

