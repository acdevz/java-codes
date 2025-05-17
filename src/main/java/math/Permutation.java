package math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3);
        List<List<Integer>> res = new ArrayList<>();
        permute(nums, 0, res);
//        for (List<Integer> list : res) {
//            System.out.println(list);
//        }
    }

    /*
    * Time complexity: O(n*n!) ->
    * */
    private static void permute(List<Integer> nums, int first, List<List<Integer>> res) {
        if(nums.size() == first){
            res.add(new ArrayList<>(nums));
        }
        for(int i = first; i < nums.size(); i++){
            Collections.swap(nums, first, i);
            permute(nums, first + 1, res);
            Collections.swap(nums, first, i);
        }
    }
}
