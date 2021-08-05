package ClassAndObject.Private;

public class Student {
    String name;
    //    int age;
    private int age;

    public void setAge(int a) {
//        age = a;
        if (a < 0 || a > 120) {
            System.out.println("Wrong age");
        } else {
            age = a;
        }
    }

    public int getAge() {
        return age;
    }

    // notice: the name "getAge" and "setAge" is a convention
    public void show() {
        System.out.println(name + ", " + age);

    }
}
