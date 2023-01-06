package recursion;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {1,6,3,8,3,5,2};
        int res = search(arr, 8, 0, arr.length-1);
        System.out.println(res);

    }
    //Binary Search...
    static int search(int[] arr, int target, int s, int e){
        int m = s + (e - s)/2;
        if (target > arr[m]){
            search(arr, target, m + 1, e);
        } else if (target < arr[m]) {
            search(arr, target, s, m - 1);
        }else{
            return m;
        }
        return -1;
    }

}
