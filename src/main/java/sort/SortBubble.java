package sort;

import java.util.Arrays;

public class SortBubble {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Best Case: O(n)
    // Worst Case: O(n^2)
    // Stable Sort

    static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
            boolean swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
}
