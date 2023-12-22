package arrays;

public class Arrays {
    public static void main(String[] args) {

        int[] arr = {3, 5, 2 ,8, 9};

        //swapping in arrays...
        swap(arr, 1, 3);
        System.out.println(java.util.Arrays.toString(arr));

        //reversing...
        reverse(arr);
        System.out.println(java.util.Arrays.toString(arr));

        //finding max...
        System.out.println( max(arr) );
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            swap(arr, i, arr.length-i-1);
        }
    }

    static int max(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}