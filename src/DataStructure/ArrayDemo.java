package DataStructure;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[3];
        // int declares the data type,
        // [] shows that its an array
        // new applies new ROM space for the array
        // int means the element in the array is int
        // [] shows its an array

        // Print array name
        System.out.println(arr); // [I@119d7047

        System.out.println(arr[0]); // why?
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        // Assign new value to the array
        arr[0] = 100;
        arr[1] = 200;

        // Print again
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
