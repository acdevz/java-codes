package Assignments;

public class P11d {
    public static void main(String[] args) {
        String s1 = "ABCBDAB"; // First string
        String s2 = "BDCABA"; // Second string

        int[][] lcsTable = LongestCommonSubsequence.computeLCS(s1, s2); // Compute the LCS table
        String lcs = LongestCommonSubsequence.getLCS(s1, s2, lcsTable); // Get the LCS from the table

        System.out.println("Length of the LCS: " + lcsTable[s1.length()][s2.length()]); // Length of the LCS
        System.out.println("Longest Common Subsequence: " + lcs); // LCS itself
    }
}

class LongestCommonSubsequence {
    // Method to find the length of the LCS using dynamic programming
    public static int[][] computeLCS(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] lcs = new int[m + 1][n + 1]; // DP table to store LCS lengths

        // Fill the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    // If characters match, increment the length of the subsequence
                    lcs[i][j] = lcs[i - 1][j - 1] + 1;
                } else {
                    // Otherwise, take the maximum from the adjacent values
                    lcs[i][j] = Math.max(lcs[i - 1][j], lcs[i][j - 1]);
                }
            }
        }

        return lcs; // Return the DP table
    }

    // Method to print the LCS using the DP table
    public static String getLCS(String s1, String s2, int[][] lcs) {
        StringBuilder lcsResult = new StringBuilder();
        int i = s1.length();
        int j = s2.length();

        // Backtracking through the DP table to reconstruct the LCS
        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                lcsResult.append(s1.charAt(i - 1)); // If characters match, add to the LCS
                i--;
                j--;
            } else if (lcs[i - 1][j] > lcs[i][j - 1]) {
                i--; // Move up if the top value is greater
            } else {
                j--; // Move left if the left value is greater
            }
        }

        return lcsResult.reverse().toString(); // The LCS is constructed in reverse order
    }
}
