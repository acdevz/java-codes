package Assignments;

public class P11b {
    public static void main(String[] args) {
        int[] weights = {5, 4, 3, 2};
        int[] values = {6, 5, 4, 3};
        int capacity = 5;
        int maxValue = Knapsack.knapsack(weights, values, capacity);
        System.out.println("Maximum value that can be achieved: " + maxValue);
    }
}

class Knapsack {
    public static int knapsack(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 1; i <= n; i++) {
            int currentWeight = weights[i - 1];
            int currentValue = values[i - 1];
            for (int j = 0; j <= capacity; j++) {
                if (currentWeight > j) {
                    // If the current item's weight is greater than the current capacity, we can't include it
                    dp[i][j] = dp[i - 1][j];
                } else {
                    // Otherwise, consider including or excluding the current item
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - currentWeight] + currentValue);
                }
            }

            System.out.println("After considering item " + i + ":");
            for (int[] row : dp) {
                for (int cell : row) {
                    System.out.printf("%3d ", cell);
                }
                System.out.println();
            }
        }

        for(int[] row : dp){
            for(int cell : row){
                System.out.printf("%3d ", cell);
            }
            System.out.println();
        }
        return dp[n][capacity];
    }
}

