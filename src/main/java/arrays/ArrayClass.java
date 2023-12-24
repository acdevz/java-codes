package arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {

        //Arrays class
        int[] arr = {3, 5, 2, 8, 9};
        System.out.println( Arrays.toString(arr) ); // [3, 5, 2, 8, 9]

        Arrays.sort(arr);
        System.out.println( Arrays.toString(arr) ); // [2, 3, 5, 8, 9]

        System.out.println( Arrays.binarySearch(arr, 5) ); // 2

        int[] arr2 = {3, 5, 2, 8, 9};
        System.out.println( Arrays.equals(arr, arr2) ); // false

        // 2D arrays
        int[][] arr5 = new int[3][4]; // 3 rows and 4 columns
        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < arr5[i].length; j++) {
                arr5[i][j] = i * j + i + j + 1;
            }
        }

        System.out.println(Arrays.deepToString(arr5));
    }
}
