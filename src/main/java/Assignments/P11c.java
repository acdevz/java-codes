package Assignments;

class P11c{
    public static void main(String[] args) {
        int[] dimensions = {40, 20, 30, 10, 30}; // Example dimensions

        MatrixChainMultiplication.Result result = MatrixChainMultiplication.matrixChainOrder(dimensions); // Get the cost and split arrays

        int minCost = result.cost[0][dimensions.length - 2]; // Final minimum cost
        System.out.println("Minimum multiplication cost: " + minCost);

        System.out.print("Optimal parenthesization: ");
        MatrixChainMultiplication.printOptimalParenthesization(result.split, 0, dimensions.length - 2);
        System.out.println();
    }
}

class MatrixChainMultiplication {

    // Method to calculate the minimum cost and optimal split for matrix chain multiplication
    public static Result matrixChainOrder(int[] dimensions) {
        int n = dimensions.length - 1; // Number of matrices
        int[][] cost = new int[n][n]; // Minimum cost for multiplication
        int[][] split = new int[n][n]; // Track the optimal split points

        // Initialize the diagonal to zero, since a single matrix multiplication has no cost
        for (int i = 0; i < n; i++) {
            cost[i][i] = 0;
        }

        // Calculate optimal costs and splits for chains of length 2 to n
        for (int length = 2; length <= n; length++) {
            for (int i = 0; i < n - length + 1; i++) {
                int j = i + length - 1;
                cost[i][j] = Integer.MAX_VALUE; // Initialize with a large number

                for (int k = i; k < j; k++) {
                    // Calculate cost to split at point k
                    int currentCost = cost[i][k] + cost[k + 1][j] +
                            dimensions[i] * dimensions[k + 1] * dimensions[j + 1];
                    if (currentCost < cost[i][j]) {
                        cost[i][j] = currentCost; // Store minimum cost
                        split[i][j] = k; // Store split point
                    }
                }
            }
        }

        // Return both cost and split arrays encapsulated in a Result object
        return new Result(cost, split);
    }

    // Helper class to return both cost and split arrays
    public static class Result {
        public int[][] cost;
        public int[][] split;

        public Result(int[][] cost, int[][] split) {
            this.cost = cost;
            this.split = split;
        }
    }

    // Utility method to print the optimal parenthesization
    public static void printOptimalParenthesization(int[][] split, int i, int j) {
        if (i == j) {
            System.out.print("M" + (i + 1)); // Single matrix
        } else {
            System.out.print("(");
            printOptimalParenthesization(split, i, split[i][j]); // Left side of the split
            System.out.print(" x ");
            printOptimalParenthesization(split, split[i][j] + 1, j); // Right side
            System.out.print(")");
        }
    }
}
