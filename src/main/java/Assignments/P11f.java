package Assignments;

public class P11f {
    public static void main(String[] args) {
        // Example probabilities for keys and dummy nodes
        double[] p = {0.15, 0.10, 0.05, 0.10, 0.20}; // Probabilities of actual keys
        double[] q = {0.05, 0.10, 0.05, 0.05, 0.05, 0.10}; // Probabilities for dummy nodes

        int n = p.length; // Number of keys

        OptimalBST.OBSTResult result = OptimalBST.optimalBST(p, q, n); // Get the expected cost and optimal structure
        System.out.println("Expected cost for optimal BST: " + result.expectedCost);

        System.out.println("Optimal BST structure:");
        OptimalBST.printOptimalBST(result.root, 1, n, 1); // Print the optimal BST structure
    }
}

class OptimalBST {
    // Method to construct the optimal BST and return the expected cost
    public static OBSTResult optimalBST(double[] p, double[] q, int n) {
        // Tables to store the cost and roots
        double[][] e = new double[n + 2][n + 2]; // Expected costs
        int[][] root = new int[n + 1][n + 1]; // Roots for optimal structure

        // Initialization: When there's only one dummy key
        for (int i = 1; i <= n + 1; i++) {
            e[i][i - 1] = q[i - 1]; // Expected cost for an empty tree (only dummy nodes)
        }

        // Build the cost and root tables
        for (int length = 1; length <= n; length++) {
            for (int i = 1; i <= n - length + 1; i++) {
                int j = i + length - 1;
                e[i][j] = Double.MAX_VALUE; // Initialize to a high cost

                // Try all possible roots to find the optimal one
                for (int r = i; r <= j; r++) {
                    double cost = e[i][r - 1] + e[r + 1][j] + sum(p, q, i, j); // Cost of tree with root r
                    if (cost < e[i][j]) {
                        e[i][j] = cost; // Store the minimum cost
                        root[i][j] = r; // Store the optimal root
                    }
                }
            }
        }

        return new OBSTResult(e[1][n], root); // Return the minimum cost and root structure
    }

    // Method to calculate the sum of probabilities for a given range
    public static double sum(double[] p, double[] q, int i, int j) {
        double s = 0.0;
        for (int k = i; k <= j; k++) {
            s += p[k - 1]; // Add probabilities for keys
        }
        s += q[i - 1] + q[j]; // Add probabilities for dummy nodes
        return s;
    }

    // Method to print the optimal BST structure
    public static void printOptimalBST(int[][] root, int i, int j, int level) {
        if (i > j) {
            System.out.println("Level " + level + ": Dummy Node");
            return;
        }

        int r = root[i][j]; // Optimal root for this subtree
        System.out.println("Level " + level + ": Key " + r);

        printOptimalBST(root, i, r - 1, level + 1); // Left subtree
        printOptimalBST(root, r + 1, j, level + 1); // Right subtree
    }

    public static class OBSTResult {
        public double expectedCost;
        public int[][] root;

        public OBSTResult(double expectedCost, int[][] root) {
            this.expectedCost = expectedCost;
            this.root = root;
        }
    }
}

