package String;

public class StringBuilderDemo01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb + "sb");

        StringBuilder sb2 = new StringBuilder("Hello");
        System.out.println("sb2: " + sb2);
        System.out.println("sb2.length(): " + sb2.length());
    }
}
