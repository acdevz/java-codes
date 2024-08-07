package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P04 {

    /* Counting Sort */
    /*
    * Input : An array A of n elements, A[i] ranges from 0 to k
    * Output : A sorted array B
    *
    * */

    private static int[] countingSort(int[] A, int k) {
        int N = A.length;
        int[] B = new int[N];

        int[] C = new int[k + 1];

        for (int j : A) {
            C[j]++;
        }

        for (int i = 1; i <= k; i++) {
            C[i] += C[i - 1];
        }

        for (int i = N - 1; i >= 0; i--) {
            B[--C[A[i]]] = A[i];
        }

        return B;
    }

    /*
    * Complexity Analysis:
    * - Time Complexity: O(n + k)
    * - Space Complexity: O(n + k)
    */


    /* Bucket Sort */

    public static void insertionSort(List<Double> arr){
        int N = arr.size();
        for (int i = 1; i < N; i++){
            double key = arr.get(i);
            for(int j = i; j > 0; j--){
                if(arr.get(j-1) > key){
                    Collections.swap(arr, j, j-1);
                }
            }
        }
    }

    private static void bucketSort(double[] A){
        int N = A.length;
        if(N == 0) return;

        List<List<Double>> buckets = new ArrayList<>(N);
        for(int i = 0; i < N; i++){
            buckets.add(i, new ArrayList<>());
        }

        for(int i = 0; i < N; i++){
            int index = (int) Math.floor(N * A[i]);
            buckets.get(index).add(A[i]);
        }

        for(int i = 0; i < N; i++){
            insertionSort(buckets.get(i));
        }

        int index = 0;
        for (List<Double> bucket : buckets) {
            for (double num : bucket) {
                A[index++] = num;
            }
        }
    }

    /*Complexity Analysis :
    * - Time Complexity : O(n^2) but it can reduce to O(n)
    * - Space Complexity : O(n)
    * */


    /* Heap Sort */

    private static void heapSort(int[] arr){
        for(int i = arr.length / 2 - 1; i >= 0; i--){
            heapify(arr, arr.length - 1, i);
        }
        int n = arr.length - 1;
        while(n >= 1){
            int temp = arr[0];
            arr[0] = arr[n];
            arr[n--] = temp;
            heapify(arr, n, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i){ // n inclusive
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if(left <= n && arr[largest] < arr[left]){
            largest = left;
        }
        if(right <= n && arr[largest] < arr[right]){
            largest = right;
        }
        if(largest != i){
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            heapify(arr, n, largest);
        }
    }

    /* Complexity Analysis
    * - Time Complexity : O(nlogn)
    *   - Building the heap takes O(n) time
    *   - Heapify takes O(logn) time
    * - Space Complexity : O(1)
    *  */

    public static void main(String[] args) {
//        System.out.println("Counting Sort");
//        int[] A = {2, 5, 3, 0, 2, 3, 1, 3};
//        int k = 6;
//        int[] B = countingSort(A, k);
//        System.out.println("Sorted Array.java: " + Arrays.toString(B));
//
//        System.out.println("\nBucket Sort");
//        double[] C = {0.897, 0.565, 0.656, 0.1234, 0.665, 0.3434};
//        bucketSort(C);
//        System.out.println("Sorted Array.java: " + Arrays.toString(C));

        System.out.println("\nHeap Sort");
        int[] H = {1,2,3,4,5,6,7,8,9,10};
        heapSort(H);
        System.out.println("Sorted Array.java: " + Arrays.toString(H));
    }
}
