package sort;

import java.util.Arrays;

public class SortMerge {
    private static void merge(int[] arr, int s, int e){
        int mid = s + (e - s) / 2;
        int[] left = Arrays.copyOfRange(arr, s, mid + 1);
        int[] right = Arrays.copyOfRange(arr, mid + 1, e + 1);

        int i = 0, j = 0, k = s;
        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                arr[k++] = left[i++];
            }else{
                arr[k++] = right[j++];
            }
        }
        while(i < left.length){
            arr[k++] = left[i++];
        }
        while(j < right.length){
            arr[k++] = right[j++];
        }
    }

    private static void mergeSort(int[] arr, int s, int e){
        if(s >= e)
            return;
        int mid = s + (e - s) / 2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid + 1, e);
        merge(arr, s, e);
    }
    public static void main(String[] args) {
        int[] arr = {9, 6, 4, 3, 2, 1};
        mergeSort(arr, 0, 5);

        System.out.println(Arrays.toString(arr));
    }
}
