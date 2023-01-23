package arrays;

import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        shuffle(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void shuffle(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int r = (int) (Math.random() * (arr.length - i)) + i;
            //swap arr[i] <-> arr[r]
            int temp = arr[i];
            arr[i] = arr[r];
            arr[r] = temp;
        }
    }
}
