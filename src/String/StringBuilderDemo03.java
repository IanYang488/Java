package String;

//String and StringBuilder convert to each other
public class StringBuilderDemo03 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        String s = sb.toString();
        System.out.println(s);


        String s2 = "boo";
        StringBuilder sb2 = new StringBuilder(s2);
        System.out.println(sb2);
    }
}
