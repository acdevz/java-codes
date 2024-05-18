package Assignments;

public class P11g {
    public static void main(String[] args) {
        // Example prices for rod lengths from 1 to 10
        int[] prices = {0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30}; // Index 0 is unused

        int rodLength = 10; // Length of the rod
        RodCutting.RodCuttingResult result = RodCutting.rodCut(prices, rodLength); // Calculate the maximum revenue and optimal cuts

        System.out.println("Maximum revenue for rod length " + rodLength + ": " + result.maxRevenue);
        RodCutting.printOptimalCuts(result.cuts, rodLength); // Display the optimal cuts
    }
}

class RodCutting {

    // Method to calculate the maximum revenue for a given rod length and prices
    public static RodCuttingResult rodCut(int[] prices, int n) {
        int[] revenue = new int[n + 1]; // Maximum revenue for each length
        int[] cuts = new int[n + 1]; // Track where to make the optimal cuts

        // Iterate through each length to find the optimal cuts and revenue
        for (int j = 1; j <= n; j++) {
            int maxRevenue = Integer.MIN_VALUE;

            // Try all possible first cuts and select the one that yields the maximum revenue
            for (int i = 1; i <= j; i++) {
                int currentRevenue = prices[i] + revenue[j - i];
                if (currentRevenue > maxRevenue) {
                    maxRevenue = currentRevenue;
                    cuts[j] = i; // Record the cut that yields maximum revenue
                }
            }

            revenue[j] = maxRevenue; // Store the maximum revenue for this length
        }

        return new RodCuttingResult(revenue[n], cuts); // Return the maximum revenue and the cut positions
    }

    // Method to print the optimal cuts to achieve maximum revenue
    public static void printOptimalCuts(int[] cuts, int length) {
        System.out.print("Optimal cuts for rod length " + length + ": ");
        while (length > 0) {
            System.out.print(cuts[length] + " "); // Print the cut length
            length -= cuts[length]; // Move to the next segment
        }
        System.out.println();
    }

    public static class RodCuttingResult {
        public int maxRevenue;
        public int[] cuts;

        public RodCuttingResult(int maxRevenue, int[] cuts) {
            this.maxRevenue = maxRevenue;
            this.cuts = cuts;
        }
    }
}
