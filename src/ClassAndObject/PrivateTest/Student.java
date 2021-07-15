package ClassAndObject.PrivateTest;

public class Student {
    private String name;
    private int age;

    public void setAge(int givenAge) {
        if (age < 120 || age > 0) {
            age = givenAge;
        } else {
            System.out.println("Wrong age");
        }
    }

    public void setName(String givenName) {
        name = givenName;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void show() {
        System.out.println(name + ", " + age);
    }
}
