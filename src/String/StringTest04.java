package String;

public class StringTest04 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String str = arrayToString(arr);
        System.out.println(str);
    }


    public static String arrayToString(int[] arr) {
        String s = "";
        s += "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                s += arr[i];
            } else {
                s += arr[i];
                s += ", ";
            }
        }
        s += "]";
        return s;
    }
}