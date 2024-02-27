package Assignments;

import java.util.Arrays;

public class P05 {
    /* randomised quick sort to find the ith smallest number */

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 4, 6, 7, 8, 9, 10, 11, 12, 13};
        int q = quickSelect(arr, 0, arr.length - 1, 3);

        System.out.println("The 3rd smallest number is: " + q);
        System.out.println("The array is: " + Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int quickSelect(int[] arr, int left, int right, int k){
        if(left == right){
            return arr[left];
        }

        int pivotIndex = partition(arr, left, right);

        if(pivotIndex == k)
            return arr[k];
        else if(pivotIndex < k)
            return quickSelect(arr, pivotIndex + 1, right, k);
        else
            return quickSelect(arr, left, pivotIndex - 1, k);
    }

    private static int partition(int[] arr, int left, int right){
        int pivot = arr[right];
        int i = left - 1;

        for(int j = left; j < right; j++){
            if(arr[j] <= pivot){
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, right);
        return i + 1;
    }

    /*Algorihtm...
    * input : an array of n numbers and an integer k
    * output : the kth smallest element of the array
    *
    * Complexity Analysis
    * Time Complexity : O(n) in the average case
    *  why?
    * - the partitioning step takes O(n) time
    * - the recursive step is performed on at most one of the subarrays formed by the partitioning step
    * - the size of the subarray is at most n/2
    * - the size of the subarray is at most n/4
    * - and so on
    * Space Complexity : O(1)
    * - the algorithm is tail recursive?
    * */

    /*Title of the program is
    * implementation of quick select algorithm and finding the ith smallest number
    * */
}
