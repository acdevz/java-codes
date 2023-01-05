package sort;

import java.util.Arrays;

public class SortCyclic {
    public static void main(String[] args) {

        // When given numbers form range 1 to N, -> use cyclic sort.

        int[] arr = {7, 2, 3, 4, 5, 6, 1, 8};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int thisValue = arr[i];
            int atIndexValue = arr[arr[i] - 1];

            if (thisValue != atIndexValue){
                //swapping...
                arr[i] = atIndexValue;
                arr[thisValue - 1] = thisValue;
            }
        }
    }
}
