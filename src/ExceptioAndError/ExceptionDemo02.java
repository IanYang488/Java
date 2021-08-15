package ExceptioAndError;

public class ExceptionDemo02 {
    public static void main(String[] args) {
        System.out.println("Start");
        method();
        System.out.println("End");
    }

    public static void method() {
        int[] arr = {1, 2, 3};
        System.out.println(arr[3]); // breakpoint
        /*
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
	at ExceptioAndError.ExceptionDemo02.method(ExceptionDemo02.java:12)
	at ExceptioAndError.ExceptionDemo02.main(ExceptionDemo02.java:6)
         */
    }
}
