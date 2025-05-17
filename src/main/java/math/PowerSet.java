package math;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int n = nums.length;
        List<List<Integer>> subsets = new ArrayList<>();
        int subset = 1 << n;

        for(int subsetMask = 0; subsetMask < subset; subsetMask++) {
            List<Integer> subsetList = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                if((subsetMask & (1 << i)) != 0) {
                    subsetList.add(nums[i]);
                }
            }
            subsets.add(subsetList);
        }
        /* Time Complexity: O(n * 2^n)
         * Space Complexity: O(n * 2^n)
         * where n is the number of elements in the input array.
         */
        System.out.println(subsets);
        System.out.println(Integer.valueOf("234"));

    }
}
