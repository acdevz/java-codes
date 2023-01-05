package leetcode;

import java.util.Arrays;

public class P268_MissingNumbers {
    public static void main(String[] args) {
//        int[] arr = {8,6,4,2,3,5,7,0,1};
        int[] arr = {9,6,4,2,3,5,7,0,1};
//        int[] arr = {4,0,2,1};
        System.out.println(missingNumbers(arr));
    }
    static int missingNumbers(int[] nums) {
        int len = nums.length;
        boolean islen = true;
        for (int i = 0; i < len; i++){
            System.out.println(Arrays.toString(nums));
            if (nums[i] != i){
                if(nums[i] == len){
                    islen = false;
                }else{
                    int temp = nums[nums[i]];
                    nums[nums[i]] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        if(!islen){
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != i) {
                    return i;
                }
            }
        }
        return len;
    }
}

