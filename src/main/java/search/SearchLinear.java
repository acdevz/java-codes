package search;

import java.util.Arrays;

public class SearchLinear {
    public static void main(String[] args) {
//        int[] arr = {1, 6, 2, 3, 8, 4};
//        System.out.println(searchInt(arr, 8));

        String name = "Skiing is fun";
//        System.out.println(searchChar(name, 'f'));
//        char[] arr = name.toCharArray();
//        System.out.println(Arrays.toString(arr));

        int[][] arr2D = {
                {1, 5, 8},
                {3, 6},
                {1, 5, 7, 5}
        };
        System.out.println(Arrays.toString(searchIn2D(arr2D, 6)));
    }

    static int searchInt(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }else{
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target){
                    return i;
                }
            }
            return -1;
        }
    }

    static int searchChar(String str, char target){
        if (str.length() == 0){
            return -1;
        }else{
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == target){
                    return i;
                }
            }
            return -1;
        }
    }

    static int[] searchIn2D(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
