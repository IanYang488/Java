package ClassAndObject.Private;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();

        s.name = "IAN YANG";
//        s.age = 20;
        s.setAge(20);
        s.setAge(233);
//        with exception control


        s.show();
        // private keyword, protect member not being used by other class
        // if the private member should be called by other class, we can construct getVariable() method,
        // and setVariable(parameter), both should be decorated by keyword public
    }
}
