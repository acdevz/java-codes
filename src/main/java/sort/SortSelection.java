package sort;

import java.util.Arrays;

public class SortSelection {
    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 8, 4, 0, 9};
        selectionSort2(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Best Case: O(n^2)
    // Worst Case: O(n^2)
    // Unstable Sort

    // method #1
    static void selectionSort1(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min){
                    min = arr[j];
                    index = j;
                }
            }
            if (min == arr[i]){
                continue;
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }

    // method #2
    static void selectionSort2(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int index = arr.length - 1 - i;
            int max = arr[arr.length - 1 - i];
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > max){
                    max = arr[j];
                    index = j;
                }
            }
            if (max == arr[arr.length - 1 - i]){
                continue;
            }
            int temp = arr[index];
            arr[index] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}
