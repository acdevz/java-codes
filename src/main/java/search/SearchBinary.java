package search;

public class SearchBinary {
    public static void main(String[] args) {
        int[] arr = {97, 56, 46, 43, 21, 10, 0, -1, -5, -10, -15};


        // sorted arrays
        int result = search(arr, -5);
        System.out.println(result);
    }

    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc;
        if (arr[start] <= arr[end]){
            isAsc = true;
        }else{
            isAsc = false;
        }
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (target > arr[mid]){
                if (isAsc) {
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else if(target < arr[mid]){
                if (isAsc) {
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                return mid;
            }
        }
        return -1;
    }
}
