package sort;

import java.util.Arrays;

public class SortInsertion {
    public static void main(String[] args) {
        int[] arr = {6, 4, 3, 8, 5, 1, 0};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Best Case: O(n)
    // Worst Case: 0(n^2)
    // Stable Sort
    // for hybrid sorting algorithms... / on partially sorted arrays

    static void insertionSort(int[] arr){
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = i + 1; j > 0 ; j--) {
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            }
        }
    }

}
