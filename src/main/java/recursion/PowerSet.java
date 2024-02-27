package recursion;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public static void main(String[] args) {
//        String str = "abc";
//        powerSet(str, 0, "");

        int[] arr = {1, 2, 3};
        System.out.println(powerSet(arr));
    }

    private static List<List<Integer>> powerSet(int[] arr){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        solve(arr, result, subset, 0);
        return result;
    }

    private static void solve(int[] arr, List<List<Integer>> result, List<Integer> subset, int index){
        if(index == arr.length){
            result.add(new ArrayList<>(subset));
            return;
        }

        subset.add(arr[index]);
        solve(arr, result, subset, index + 1);
        subset.remove(subset.size() - 1);
        solve(arr, result, subset, index + 1);
    }

    private static void powerSet(String str, int i, String curr){
        if(i == str.length()){
            System.out.println(curr);
            return;
        }

        powerSet(str, i + 1, curr + str.charAt(i));
        powerSet(str, i + 1, curr);
    }
}
