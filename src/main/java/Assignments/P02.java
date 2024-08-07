package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P02 {
    private static void merge(List<Integer> arr, int s, int e){
        int mid = s + (e - s) / 2;
        int len1 = mid - s + 1;
        int len2 = e - mid;
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();

        for(int i = 0; i < len1; i++){
            first.add(arr.get(s + i));
        }
        for(int i = 0; i < len2; i++){
            second.add(arr.get(mid + 1 + i));
        }

        int i = 0, j = 0, k = s;
        while(i < len1 && j < len2){
            if(first.get(i) < second.get(j))
                arr.set(k++, first.get(i++));
            else
                arr.set(k++, second.get(j++));
        }

        while(i < len1)
            arr.set(k++, first.get(i++));
        while(j < len2)
            arr.set(k++, second.get(j++));
    }

    private static void mergeSort(List<Integer> arr, int s, int e){
        if(s >= e)
            return;
        int mid = s + (e - s) / 2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid+1, e);
        merge(arr, s, e);
    }

    /*Time Complexity : merge sort
    * T(n) = O(nlogn)
    * mergeSort() runs logn times, and merge() runs n times
    *
    * Space Complexity : merge sort
    * S(n) = O(n)
    * mergeSort() uses an array of size n
    *
    * */

   /* Radix Sort */
    private static void countSort(List<Integer> arr, int exp){
        int n = arr.size();
        int[] output = new int[n];
        int[] count = new int[10];
        for(int i = 0; i < n; i++)
            count[(arr.get(i) / exp) % 10]++;
        for(int i = 1; i < 10; i++)
            count[i] += count[i - 1];
        for(int i = n - 1; i >= 0; i--){
            output[count[(arr.get(i) / exp) % 10] - 1] = arr.get(i);
            count[(arr.get(i) / exp) % 10]--;
        }
        for(int i = 0; i < n; i++)
            arr.set(i, output[i]);
    }

    private static void radixSort(List<Integer> arr){
        int max = arr.get(0);
        for(int i = 1; i < arr.size(); i++)
            if(arr.get(i) > max)
                max = arr.get(i);
        for(int exp = 1; max / exp > 0; exp *= 10)
            countSort(arr, exp);
    }

    /*Time Complexity : Radix Sort
    * T(n) = O(d * (n + k))
    * : countSort() runs d times, where d is the number of digits in the maximum number
    *
    * Space Complexity : Radix Sort
    * S(n) = O(n + k)
    * : countSort() uses an array of size k
    *
    * */

    public static void main(String[] args) {
//        List<Integer> arr = new ArrayList<>();
//        for (int i = 0; i < 10; i++)
//            arr.add((int) (Math.random() * 10 - 5));
//        System.out.println("Original Array.java: " + arr);

//        mergeSort(arr, 0, arr.size() - 1);
//        System.out.println("Sorted Array.java: " + arr);

        List<Integer> arr = new ArrayList<>(Arrays.asList(170, 45, 75, 90, 802, 24, 2, 66));
        System.out.println("Original Array.java: " + arr);

        radixSort(arr);
        System.out.println("Sorted Array.java: " + arr);
    }
}
