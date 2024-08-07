package testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public int solution(String S, String T) {
        int n = S.length();
        StringBuilder Sb = new StringBuilder(S);
        StringBuilder Tb = new StringBuilder(T);
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            int Sdigit = S.charAt(i) - '0';
            int Tdigit = T.charAt(i) - '0';

            // Calculate current difference without swapping
            long snum = Long.parseLong(Sb.toString());
            long tnum = Long.parseLong(Tb.toString());
            long prevDiff = Math.abs(snum - tnum);

            // Calculate difference after swapping current digits
            Sb.setCharAt(i, T.charAt(i));
            Tb.setCharAt(i, S.charAt(i));
            long afterDiff = Math.abs(Long.parseLong(Sb.toString()) - Long.parseLong(Tb.toString()));

            // If the swap reduces the difference, keep it and increment the swap count
            if (afterDiff < prevDiff) {
                swaps++;
            } else {
                // Revert the swap if it doesn't reduce the difference
                Sb.setCharAt(i, S.charAt(i));
                Tb.setCharAt(i, T.charAt(i));
            }
        }

        return swaps;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String S = "29162";
        String T = "10524";
        int result = sol.solution(S, T);
        System.out.println("Minimum swaps required: " + result); // Output: 2
    }


}
