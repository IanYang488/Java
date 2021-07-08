package DataStructure;

public class ArrayTest02 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int[] arr2 = new int[2];
        System.out.println("arr2 = " + arr2);
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);

        arr[0] = 100;
        arr2[0] = 200;
        arr2[1] = 300;

        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);

    }
}
