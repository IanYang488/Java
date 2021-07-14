package DataStructure;

public class ArrayTest03 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);


=======
// <<<<<<< July_13
//         int[] arr2 = arr;// address of arr is assigned to arr2 as well as its values
// =======
//         int[] arr2 = arr; // address of arr is assigned to arr2 as well as its values
// >>>>>>> main
        arr2[0] = 111; // arr2[2] equals to arr[0]
        arr2[1] = 222;
        arr2[2] = 333;

        System.out.println(arr);
        System.out.println(arr[1]);
        System.out.println(arr2);
        System.out.println(arr2[2]);

    }
}
