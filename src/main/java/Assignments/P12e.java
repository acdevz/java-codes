package Assignments;
import java.util.Arrays;

public class P12e {
    public static void main(String[] args) {
        // Example graph
        int[][] graph = {
                {0, 1, 0, 0},
                {1, 0, 1, 0},
                {0, 1, 0, 1},
                {1, 0, 1, 0}
        };

        int chromaticNumber = GraphChromaticNumber.findChromaticNumber(graph); // Find the chromatic number
        System.out.println("Chromatic Number: " + chromaticNumber);
    }
}

class GraphChromaticNumber {

    // Recursive method to solve the graph coloring problem and return if it's possible with given number of colors
    public static boolean isColorable(int[][] graph, int m, int[] colors, int vertex) {
        int n = graph.length; // Number of vertices

        if (vertex == n) {
            return true; // All vertices have been successfully colored
        }

        // Try to color the current vertex with colors from 1 to m
        for (int color = 1; color <= m; color++) {
            if (isSafe(graph, colors, vertex, color)) {
                colors[vertex] = color; // Assign the color to the current vertex

                // Recursively color the next vertex
                if (isColorable(graph, m, colors, vertex + 1)) {
                    return true; // If successful, return true
                }

                // If not successful, backtrack
                colors[vertex] = 0; // Reset the color
            }
        }

        return false; // No valid color assignment found
    }

    // Method to check if it's safe to color a given vertex with a specific color
    private static boolean isSafe(int[][] graph, int[] colors, int vertex, int color) {
        for (int i = 0; i < graph.length; i++) {
            if (graph[vertex][i] == 1 && colors[i] == color) {
                return false; // If there's an edge and the adjacent vertex has the same color
            }
        }
        return true; // No conflicts, it's safe to color
    }

    // Method to find the chromatic number by incrementally testing the number of colors
    public static int findChromaticNumber(int[][] graph) {
        int n = graph.length; // Number of vertices
        int[] colors = new int[n]; // Array.java to store the colors for each vertex

        // Start with 1 color and increase until a valid coloring is found
        for (int m = 1; m <= n; m++) {
            Arrays.fill(colors, 0); // Reset colors
            if (isColorable(graph, m, colors, 0)) {
                return m; // Found a valid coloring with m colors
            }
        }

        return n; // The worst case is each vertex has a different color
    }
}

