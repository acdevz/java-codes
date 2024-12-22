package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Array {
    public static void main(String[] args) {
        int[] arr; // declaration : arr is a reference to an array of int
        arr = new int[5]; // instantiation : arr is a reference to an array of int of size 5 (memory allocation)
        arr = new int[]{3, 5, 2, 8, 9}; // initialization : arr is a reference to an array of int of size 5 with values 3, 5, 2, 8, 9
        int[] arr2 = {3, 5, 2, 8, 9}; // declaration, instantiation and initialization in one line
        // accessing elements
        System.out.println(arr[0]); // 3

        // accessing length
        System.out.println(arr.length); // 5

        //swapping in arrays...
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));

        //reversing...
        reverse(arr);
        String input = "123+345";

        List<Integer> h = (input != null && !input.isEmpty())
                ? Arrays.stream(input.split("[+]"))
                .map(x -> {
                    try {
                        return Integer.parseInt(x);
                    } catch (NumberFormatException e) {
                        return null; // Handle invalid numbers
                    }
                })
                .filter(Objects::nonNull)
                .collect(Collectors.toList())
                : Collections.emptyList();

        System.out.println(h); // Output: [123, 345]        System.out.println(Arrays.toString(arr));

        //finding max...
        System.out.println( max(arr) );


        // 2D arrays
        int[][] arr5 = new int[3][4]; // 3 rows and 4 columns
        int[][] arr6 = new int[3][]; // 3 rows and unknown columns
        // jagged array


        // Cloning an array
        int[] arr3 = arr.clone(); // deep copy : arr3 == arr is false
        int[] arr4 = arr; // shallow copy

        // Cloning a 2D array
        int[][] arr7 = arr5.clone(); // shallow copy : arr7 == arr5 is false but arr7[0] == arr5[0] is true

    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            swap(arr, i, arr.length-i-1);
        }
    }

    static int max(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}