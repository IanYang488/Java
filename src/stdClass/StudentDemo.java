package stdClass;


public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.setAge(20);
        student1.setName("Ian Yang");

        student1.show();

        Student student2 = new Student("Yiwen Yang", 20);
        student2.show();

    }
}
