package Assignments;

import arrays.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P03 {

    /*Selection Sort*/

    private static void selectionSort(List<Integer> arr){
        int N = arr.size();
        int minIndex;
        for (int i = 0; i < N; i++) {
            minIndex = i;
            for (int j = i+1; j < N; j++) {
                if (arr.get(j) < arr.get(minIndex))
                    minIndex = j;
            }
            Collections.swap(arr, i, minIndex);
        }
    }

    /*Complexity Analysis :
    * T(n) = O(n^2) why?
    *  - The outer loop runs n times
    *  - The inner loop runs n-1 times in the first iteration, n-2 times in the second iteration, and so on
    *
    * S(n) = O(1) why?
    *   - The space complexity is constant because we are not using any extra space
    * */


    /*Insertion Sort*/

    public static void insertionSort(List<Integer> arr){
        int N = arr.size();
        for (int i = 1; i < N; i++){
            int key = arr.get(i);
            for(int j = i; j > 0; j--){
                if(arr.get(j-1) > key){
                    Collections.swap(arr, j, j-1);
                }
            }
        }
    }

    /*Complexity Analysis : Insertion Sort
    * T(n) = O(n^2) why?
    * - The outer loop runs n times
    * - The inner loop runs n-1 times in the first iteration, n-2 times in the second iteration, and so on
    *
    * S(n) = O(1) why?
    *  - The space complexity is constant because we are not using any extra space
     * */


    /*Bubble Sort*/

    private static void bubbleSort(List<Integer> arr){
        int N = arr.size();
        for(int i = 0; i < N; i++){
            boolean swapped = false;
            for(int j = 1; j < N - i; j++){
                if(arr.get(j) < arr.get(j - 1)) {
                    Collections.swap(arr, j, j - 1);
                    swapped = true;
                }
            }
            if(!swapped)
                return;
        }
    }

    /*Complexity Analysis : Bubble Sort
    * T(n) = O(n^2) why?
    * - The outer loop runs n times
    * - The inner loop runs n-1 times in the first iteration, n-2 times in the second iteration, and so on
    *
    * S(n) = O(1) why?
    * - The space complexity is constant because we are not using any extra space
     */

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < 20; i++){
            arr.add((int) (Math.random() * 100 - 50));
        }
//        selectionSort(arr);
        insertionSort(arr);
//        bubbleSort(arr);

        System.out.println(arr);
    }
}
