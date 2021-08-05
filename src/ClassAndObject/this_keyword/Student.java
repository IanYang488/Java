package ClassAndObject.this_keyword;

public class Student {
    private String name;
    private int age;

    //    public void setName(String n) {
//        name = n;
//    }

    // this keyword is used to distinguish member variable from local variable
    // the variable without this is parameter
    public void setName(String name) {
//        name = name;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + ", " + age);

    }
}
