package Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P01 {

    /* Practical 1.1 */
    private static int ibinarySearch(List<Integer> arr, int target){
        int s = 0, e = arr.size() - 1;
        int res = -1;
        while(s <= e){

            int mid = s + (e - s) / 2;

            if(target < arr.get(mid))
                e = mid - 1;
            else if(target > arr.get(mid))
                s = mid + 1;
            else {
                res = mid;
                e = mid - 1;
            }
        }
        return res;
    }

    /* Practical 1.2 */
    private static int rbinarySearch(List<Integer> arr, int target, int s, int e){
        if(s > e)
            return -1;

        int mid = s + (e - s) / 2;

        if(target < arr.get(mid))
            return rbinarySearch(arr, target, s, mid - 1);
        else if(target > arr.get(mid))
            return rbinarySearch(arr, target, mid + 1, e);
        else
            return mid;
    }

    /* Practical 2.0 */

    private static int partition(List<Integer> arr, int s, int e) {
        int pivot = arr.get(e);
        int i = s - 1;
        for(int j = s; j < e; j++) {
            if (arr.get(j) <= pivot) {
                i++;
                Collections.swap(arr, i, j);
            }
        }
        Collections.swap(arr, i + 1, e);
        return i + 1;
    }

    private static void quickSort(List<Integer> arr, int s, int e){
        if(s >= e)
            return;

        int p = partition(arr, s, e);

        quickSort(arr, s, p - 1);
        quickSort(arr, p + 1, e);
    }

    public static void main(String[] args) {

//        List<Integer> arr = new ArrayList<>();
//        for(int i = 0; i < 20; i++)
//            arr.add(i - 10);
//        Collections.sort(arr);
//
//        System.out.println("Original Array.java: " + arr);

        /* Searching */
//        int target = 10;
//        int res = rbinarySearch(arr, target, 0, arr.size() - 1);
////        int res = ibinarySearch(arr, target);
//        if (res == -1) {
//            System.out.println("Target, " + target + " not found.");
//        } else {
//            System.out.println("Target, " + target + " found at index " + res);
//        }

        /* generating list of random numbers*/
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 25; i++)
            arr.add((int) (Math.random() * 50 - 25));


        System.out.println("Original Array.java: " + arr);


        /* Sorting */
        long startTime = System.currentTimeMillis();
        quickSort(arr, 0, arr.size() - 1);
        long endTime = System.currentTimeMillis();

        System.out.println("Sorted Array.java: " + arr);
        System.out.println("Time taken: " + (endTime - startTime) + "ms");

    }
}
