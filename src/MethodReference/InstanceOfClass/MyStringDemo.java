package MethodReference.InstanceOfClass;

public class MyStringDemo {
    // Class::member method  e.g. String::substring
    public static void main(String[] args) {
        useMyString((s, x, y) -> s.substring(x, y));
        useMyString(String::substring);
        // when lambda is replaced by class instance method reference, the first parameter is the caller
        // the rest were sent to the method as parameter
    }

    private static void useMyString(MyString myString) {
        myString.mySubString("Hello", 3, 5);
    }

}
