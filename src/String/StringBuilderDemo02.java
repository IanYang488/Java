package String;

public class StringBuilderDemo02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        StringBuilder sb2 = sb.append("hello");
        System.out.println("sb: " + sb);
        System.out.println("sb2: " + sb2);
        System.out.println(sb == sb2);  // .append() method returns the StringBuilder itself.

        // or
        sb.append("hello");
        sb.append("world");
        sb.append("java");

        // or chain programming
        sb.append("hello").append("world").append("java");

        // StringBuilder reverse
        sb.reverse();
        System.out.println("sb reversed" + sb);
    }
}
