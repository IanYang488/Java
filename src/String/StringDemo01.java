package String;

//String construction
public class StringDemo01 {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println(s1);

        // another way to construct a String: pubic String(char[] chs)
        char[] chs = {'a', 'b', 'c'};
        String s2 = new String(chs);
        System.out.println("s2 = " + s2);

        // also, public String(byte[] bys)
        byte[] bys = {97, 98, 99}; // 'a' = 97 in byte
        String s3 = new String(bys);
        System.out.println(s3);

        // assign value directly, recommended
        String s4 = "abc";
        System.out.println("s4 = " + s4);
    }

}

