package DataStructure;

public class ArrayTest05 {
    public static void main(String[] args) {
        int[] arr = {12, 45, 98, 73, 60};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] < min) {
                min = arr[j];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
