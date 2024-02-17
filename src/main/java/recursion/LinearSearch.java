package recursion;

public class LinearSearch {
    private static int linearSearch(int[] arr, int i, int key){
        if(i == arr.length)
            return -1;

        if(arr[i] == key)
            return i;

        return linearSearch(arr, i + 1, key);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(linearSearch(arr, 0, 3));
    }
}
